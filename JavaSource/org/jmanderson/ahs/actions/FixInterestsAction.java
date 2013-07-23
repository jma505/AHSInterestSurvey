package org.jmanderson.ahs.actions;

import java.util.List;
import java.util.Locale;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.AppException;
import org.jmanderson.ahs.FormToInterests;
import org.jmanderson.ahs.InterestsTallyBean;
import org.jmanderson.ahs.PrepareSession;
import org.jmanderson.ahs.TopicsLookup;
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.dataobjects.CheckBoxes2;
import org.jmanderson.ahs.dataobjects.StudentBean;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.forms.EntryForm2;
import org.jmanderson.ahs.actions.FixInterestsAction;

/**
 * AddBigEntryAction - prepare a task bean
 */

public final class FixInterestsAction extends Action {

	// Global forwards
	public static final String GLOBAL_FORWARD_login = "login";

	public static final String GLOBAL_FORWARD_logoff = "logoff";

	public static final String GLOBAL_FORWARD_exception = "exception";

	// Local forwards
	public static final String FORWARD_success = "success";

	public static final String FORWARD_cancel = "cancel";

	private static Log logger = LogFactory.getLog(FixInterestsAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// Extract attributes we will need
		Locale locale = getLocale(request);
		HttpSession session = request.getSession();
		// Is there a logged in user?
		User user = (User) session.getAttribute("user");
		if ((user == null) || (!user.getIs_validated())) {
			if (logger.isDebugEnabled()) {
				logger.debug("User is not logged on in session "
						+ session.getId());
			}
			return mapping.findForward(GLOBAL_FORWARD_login);
		}

		// Was this transaction cancelled?
		if (isCancelled(request)) {
			logger.debug("Transaction was cancelled");
			if (mapping.getAttribute() != null)
				session.removeAttribute(mapping.getAttribute());
			if (user.isStudent()) {
				return mapping.findForward(GLOBAL_FORWARD_logoff);
			}
			return mapping.findForward(FORWARD_cancel);
		}

		// Get the ServletContext for later use!
		ServletContext context = servlet.getServletContext();

		// Get the DataSource for later use!
		DataSource ds = (DataSource) context.getAttribute("cloverDB");

		// Set up the application and session objects
		try {
			PrepareSession.checkSessionObjects(session, servlet
					.getServletContext(), ds);
		} catch (AppException ae) {
			session.setAttribute("AppException", ae);
			return mapping.findForward(GLOBAL_FORWARD_exception);
		}

		try {
			StudentsDA sda = new StudentsDA(ds);
			StudentBean sb;
			CheckBoxes2 cb2;
			EntryForm2 seform;
			List students = sda.getStudentsToFix();
			for (int i = 0; i < students.size(); i++) {
				int sid = ((Integer) students.get(i)).intValue();
				sb = sda.getStudent(sid);
				cb2 = (CheckBoxes2) sb.getCheckBoxes();
				seform = new EntryForm2();
				cb2.loadToEntryForm(seform);
				//FormToStudent fts = new FormToStudent(ds);
				FormToInterests fti = new FormToInterests();
				Vector interestsV;
				InterestsTallyBean tally = (InterestsTallyBean) session
						.getAttribute("tally");
				TopicsLookup lookup = (TopicsLookup) context
						.getAttribute("lookup");

				interestsV = fti.getInterests(seform, tally);
				//sb = fts.convert(seform);
				sb.setInterests(interestsV);
				sda.updateStudent(sb);
			}
		} catch (Exception e) {
			AppException ae = new AppException("Update Failed!!", e);
			session.setAttribute("AppException", ae);
			return (mapping.findForward(GLOBAL_FORWARD_exception));
		}

		return mapping.findForward(FORWARD_success);
	}

}

