package org.jmanderson.ahs.actions;

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
import org.jmanderson.ahs.forms.EntryForm1;
import org.jmanderson.ahs.actions.AddBigEntryAction;

/**
 * AddBigEntryAction - prepare a task bean
 */

public final class AddBigEntryAction extends Action {

	// Global forwards
	public static final String GLOBAL_FORWARD_login = "login";

	public static final String GLOBAL_FORWARD_logoff = "logoff";

	public static final String GLOBAL_FORWARD_exception = "exception";

	// Local forwards
	public static final String FORWARD_success = "success";

	public static final String FORWARD_complete = "complete";

	public static final String FORWARD_cancel = "cancel";

	public static final String[] FORWARD_pages = { "page0", "page1", "page2",
			"page3", "page4", "page5", "page6", "page7", "page8", "page9",
			"page10", "page11", "page12", "page13", "page14", "page15",
			"page16", "page17", "page18", "page19", "page20", "page21",
			"page22", "page23", "page24", "page25", "page26", "page27",
			"page28", "page29", "page30", "page31", "page32", "page33",
			"page34", "page35", "page36" };

	private static Log logger = LogFactory.getLog(AddBigEntryAction.class);

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

		// prepare to populate the form
		if (form == null) {
			if (logger.isDebugEnabled()) {
				logger.debug("Creating new EntryForm1 bean under key "
						+ mapping.getAttribute());
			}
			form = new EntryForm1();
			if ("request".equals(mapping.getScope()))
				request.setAttribute(mapping.getAttribute(), form);
			else
				session.setAttribute(mapping.getAttribute(), form);
		}
		EntryForm1 beform = (EntryForm1) form;

		int pageNumber = beform.getPageNumber();
		if (pageNumber > -1) {
			ActionErrors formErrors = beform.validate(mapping, request);
			if (!formErrors.isEmpty()) {
				saveErrors(request, formErrors);
				return mapping
						.findForward(FORWARD_pages[pageNumber]);
			}
		}
		
		String jump = request.getParameter("jump");
		if (jump != null) {
			int jumpPageNumber = beform.getJumpPageNumber();
			if (jumpPageNumber > beform.getLastPageNumber()) {
				pageNumber = beform.getLastPageNumber();
			}
			else {
				return mapping.findForward(FORWARD_pages[jumpPageNumber]);
			}
		}
		
		// TODO possibly eliminate this code in the future
		//		int ut = user.getUserTeacher();
		//		if (ut > 0) {
		//			beform.setTeacherId(ut);
		//			beform.setRestricted(true);
		//		} else {
		//			beform.setRestricted(false);
		//		}

		String isnew = (String) request.getParameter("newstudent");
		if (isnew != null) {
			logger
					.debug("Found \"newstudent\" request parameter ... resetting the form");
			beform.fullReset(mapping, request);
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

		// Forward control to the specified success URI
		if (logger.isDebugEnabled()) {
			logger.debug("AddBigEntryAction: Page = " + beform.getPageNumber());
		}

		if (pageNumber == beform.getLastPageNumber()) {
			FormToStudent fts = new FormToStudent(ds);
			FormToInterests fti = new FormToInterests();
			StudentsDA sda = new StudentsDA(ds);
			StudentBean sb = null;
			Vector interestsV;
			InterestsTallyBean tally = (InterestsTallyBean) session
					.getAttribute("tally");

			TopicsLookup lookup = (TopicsLookup) context.getAttribute("lookup");
			try {
				interestsV = fti.getInterests(beform, tally);
				sb = fts.convert(beform);
				sb.setInterests(interestsV);
				if (beform.isEdit()) {
					sb.setId(beform.getStudentId());
					sda.updateStudent(sb);
				}
				else {
					sb.setId(sda.writeNewStudent(sb));
				}
			} catch (Exception e) {
				System.out.print(e.getStackTrace());
				AppException ae = new AppException(
						"Error saving Student data -- Student deleted!!  Please reenter!!",
						e);
				session.setAttribute("AppException", ae);
				return mapping.findForward(GLOBAL_FORWARD_exception);
			}
			request.setAttribute("Student", sb);
			beform.fullReset(mapping, request);
			if (user.isStudent()) {
				return mapping.findForward(FORWARD_complete);
			}
			return mapping.findForward(FORWARD_success);
		}

		return mapping.findForward(FORWARD_pages[pageNumber + 1]);

	}

}

