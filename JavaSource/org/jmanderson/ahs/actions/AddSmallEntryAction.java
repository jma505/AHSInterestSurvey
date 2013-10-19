package org.jmanderson.ahs.actions;

import java.io.IOException;
import java.util.Locale;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.jmanderson.ahs.AppException;
import org.jmanderson.ahs.FormToInterests;
import org.jmanderson.ahs.FormToStudent;
import org.jmanderson.ahs.InterestsTallyBean;
import org.jmanderson.ahs.PrepareSession;
import org.jmanderson.ahs.TopicsLookup;
import org.jmanderson.ahs.da.StudentsDA;
import org.jmanderson.ahs.dataobjects.StudentBean;
import org.jmanderson.ahs.dataobjects.User;
import org.jmanderson.ahs.forms.EntryForm2;
import org.jmanderson.ahs.actions.AddSmallEntryAction;

/**
 * AddSmallEntryAction - prepare a task bean
 */

public final class AddSmallEntryAction extends Action {

	private static final String GLOBAL_FORWARD_login = "login";

	public static final String GLOBAL_FORWARD_logoff = "logoff";

	private static final String GLOBAL_FORWARD_exception = "exception";

	private static final String FORWARD_success = "success";

	private static final String FORWARD_complete = "complete";

	private static final String FORWARD_cancel = "cancel";

	private static final String[] FORWARD_pages = { "page0", "page1", "page2",
			"page3" };

	private Log logger = LogFactory.getLog(AddSmallEntryAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// Extract attributes we will need
		Locale locale = getLocale(request);

		HttpSession session = request.getSession();
		// Is there a logged in user?
		User user = (User) session.getAttribute("user");
		if ((user == null) || (!user.getIs_validated())) {
			if (logger.isDebugEnabled()) {
				StringBuffer sb = new StringBuffer();
				sb
						.append("AddSmallEntryAction: User is not logged on in session ");
				sb.append(session.getId());
				logger.debug(sb.toString());
			}
			return (mapping.findForward(GLOBAL_FORWARD_login));
		}

		// Was this transaction cancelled?
		if (isCancelled(request)) {
			if (logger.isDebugEnabled()) {
				logger.debug("AddSmallEntryAction: Transaction was cancelled");
			}
			if (mapping.getAttribute() != null)
				session.removeAttribute(mapping.getAttribute());
			if (user.isK12()) {
				return mapping.findForward(GLOBAL_FORWARD_logoff);
			}
			return (mapping.findForward(FORWARD_cancel));
		}

		// prepare to populate the form
		if (form == null) {
			if (logger.isDebugEnabled()) {
				StringBuffer sb = new StringBuffer();
				sb
						.append("AddSmallEntryAction: Creating new EntryForm2 bean under key ");
				sb.append(mapping.getAttribute());
				logger.debug(sb.toString());
			}
			form = new EntryForm2();
			if ("request".equals(mapping.getScope()))
				request.setAttribute(mapping.getAttribute(), form);
			else
				session.setAttribute(mapping.getAttribute(), form);
		}
		EntryForm2 seform = (EntryForm2) form;

		int pageNumber = seform.getPageNumber();
		if (pageNumber > -1) {
			ActionErrors formErrors = seform.validate(mapping, request);
			if (!formErrors.isEmpty()) {
				saveErrors(request, formErrors);
				return mapping.findForward(FORWARD_pages[pageNumber]);
			}
		}
		
		String isnew = (String) request.getParameter("newstudent");
		if (isnew != null) {
			seform.fullReset(mapping, request);
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
			return (mapping.findForward(GLOBAL_FORWARD_exception));
		}

		// Forward control to the specified success URI
		
		if (logger.isDebugEnabled()) {
			logger.debug("AddSmallEntryAction: page = " + pageNumber);
		}

		if (pageNumber == seform.getLastPageNumber()) {
			FormToStudent fts = new FormToStudent(ds);
			FormToInterests fti = new FormToInterests();
			StudentsDA sda = new StudentsDA(ds);
			StudentBean sb = null;
			Vector interestsV;
			InterestsTallyBean tally = (InterestsTallyBean) session
					.getAttribute("tally");
			TopicsLookup lookup = (TopicsLookup) context.getAttribute("lookup");
			try {
				interestsV = fti.getInterests(seform, tally);
				sb = fts.convert(seform);
				sb.setInterests(interestsV);
				if (seform.isEdit()) {
					sb.setId(seform.getStudentId());
					sda.updateStudent(sb);
				}
				else {
					sb.setId(sda.writeNewStudent(sb));
				}
			} catch (Exception e) {
				AppException ae = new AppException(
						"Error saving Student data -- Student deleted!!  Please reenter!!",
						e);
				session.setAttribute("AppException", ae);
				return (mapping.findForward(GLOBAL_FORWARD_exception));
			}
			session.setAttribute("Student", sb);
			seform.fullReset(mapping, request);
			if (user.isStudent()) {
				return (mapping.findForward(FORWARD_complete));
			}
			return mapping.findForward(FORWARD_success);
		}

		return (mapping.findForward(FORWARD_pages[pageNumber + 1]));
	}

}

