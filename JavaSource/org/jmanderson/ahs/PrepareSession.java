package org.jmanderson.ahs;

/**
 * New class for 2002-2003
 */

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.jmanderson.ahs.da.TeachersDA;
import org.jmanderson.ahs.da.TopicsDA;
import org.jmanderson.ahs.dataobjects.TeacherBean;
import org.jmanderson.ahs.AppException;
import org.jmanderson.ahs.InterestsTallyBean;
import org.jmanderson.ahs.QuestionPage;
import org.jmanderson.ahs.TeacherListBean;
import org.jmanderson.ahs.TopicsLookup;

/**
 * @author John Anderson
 *  
 */
public class PrepareSession {

	public static void checkSessionObjects(HttpSession session,
			ServletContext context, DataSource ds) throws AppException {
		ResourceBundle rb = ResourceBundle
				.getBundle("org.jmanderson.ahs.LocalResources");
		checkTeacherListBean(ds, context, rb);
		checkTopicListBean(ds, context, rb);
		checkTopicsLookupBean(ds, context, rb);
		checkInterestsTallyBean(ds, session, rb);
		checkTeacherListBig(ds, context, rb);
		checkTeacherListSmall(ds, context, rb);
		checkQuestionPageListBig(ds, context, rb);
	}

	private static void checkQuestionPageListBig(DataSource ds, ServletContext context, ResourceBundle rb) {
		ArrayList list = (ArrayList) context.getAttribute("questionPageListBig");
		if (list == null) {
			list = new ArrayList();
			list.add(new QuestionPage("Jump to page ...", 0));
			list.add(new QuestionPage("Animals", 1));
			list.add(new QuestionPage("Art", 9));
			list.add(new QuestionPage("Athletics / Sports", 2));
			list.add(new QuestionPage("Building", 6));
			list.add(new QuestionPage("Business", 3));
			list.add(new QuestionPage("Childcare", 4));
			list.add(new QuestionPage("Clothing", 5));
			list.add(new QuestionPage("Competing", 7));
			list.add(new QuestionPage("Crafts", 8));
			list.add(new QuestionPage("Food", 10));
			list.add(new QuestionPage("Foreign Language", 14));
			list.add(new QuestionPage("Games", 11));
			list.add(new QuestionPage("History", 12));
			list.add(new QuestionPage("Humor", 13));
			list.add(new QuestionPage("Law", 15));
			list.add(new QuestionPage("Media - TV", 17));
			list.add(new QuestionPage("Media - Radio", 18));
			list.add(new QuestionPage("Media - Movies & Listening", 19));
			list.add(new QuestionPage("Medicine", 20));
			list.add(new QuestionPage("Music", 21));
			list.add(new QuestionPage("Nature", 22));
			list.add(new QuestionPage("Performing Arts", 23));
			list.add(new QuestionPage("Politics", 24));
			list.add(new QuestionPage("Problem Solving", 25));
			list.add(new QuestionPage("Reading", 26));
			list.add(new QuestionPage("Relationships", 27));
			list.add(new QuestionPage("School Subjects", 16));
			list.add(new QuestionPage("Science", 28));
			list.add(new QuestionPage("Social Awareness", 29));
			list.add(new QuestionPage("Toys", 30));
			list.add(new QuestionPage("Technology", 31));
			list.add(new QuestionPage("Travel / Culture", 32));
			list.add(new QuestionPage("Vehicles", 33));
			list.add(new QuestionPage("Weather", 34));
			list.add(new QuestionPage("Writing", 35));
			list.add(new QuestionPage("DONE", 36));
			context.setAttribute("questionPageListBig", list);
		}
	}
	
	private static void checkTeacherListBean(DataSource ds,
			ServletContext context, ResourceBundle rb) throws AppException {
		// Populate a TeacherListBean in the application scope if one
		// doesn't already exist

		ArrayList list = (ArrayList) context.getAttribute("teacherList");
		if (list == null) {
			list = new ArrayList();
			list.add(new TeacherListBean("Select a Teacher", 0));
			try {
				TeachersDA tda = new TeachersDA(ds);
				Vector teachersV = tda.getTeachers();
				TeacherBean tb = null;
				for (int i = 0; i < teachersV.size(); i++) {
					tb = (TeacherBean) teachersV.get(i);
					list.add(new TeacherListBean(tb.getLastname() + " (grade "
							+ tb.getGrade() + ")", tb.getId()));
				}
			} catch (Exception e) {
				throw new AppException("Error creating the Teacher list", e);
			}
			context.setAttribute("teacherList", list);
		}
	}

	private static void checkTopicListBean(DataSource ds,
			ServletContext context, ResourceBundle rb) throws AppException {
		// Populate a TopicListBean in the application scope if one doesn't
		// already exist

		ArrayList list = (ArrayList) context.getAttribute("topics");
		if (list == null) {
			list = new ArrayList();
			try {
				TopicsDA tda = new TopicsDA(ds);
				Vector topicsV = tda.getTopics();
				for (int i = 0; i < topicsV.size(); i++) {
					list.add(topicsV.get(i));
				}
			} catch (Exception e) {
				throw new AppException("Error creating the Topics list", e);
			}
			context.setAttribute("topics", list);
		}
	}

	private static void checkTopicsLookupBean(DataSource ds,
			ServletContext context, ResourceBundle rb) throws AppException {
		// Populate a TopicsLookup bean in the application scope if one doesn't
		// already exist

		TopicsLookup lookup = (TopicsLookup) context.getAttribute("lookup");
		if (lookup == null) {
			try {
				lookup = new TopicsLookup(ds);
			} catch (Exception e) {
				throw new AppException("Error creating the Topics lookup", e);
			}
			context.setAttribute("lookup", lookup);
		}
	}

	private static void checkInterestsTallyBean(DataSource ds,
			HttpSession session, ResourceBundle rb) throws AppException {
		// Populate an InterestsTallyBean in the session scope if one doesn't
		// already exist

		InterestsTallyBean tally = (InterestsTallyBean) session
				.getAttribute("tally");
		if (tally == null) {
			try {
				tally = new InterestsTallyBean(ds);
			} catch (Exception e) {
				throw new AppException("Error creating the Tally bean", e);
			}
			session.setAttribute("tally", tally);
		}

	}

	private static void checkTeacherListBig(DataSource ds,
			ServletContext context, ResourceBundle rb) throws AppException {
		// Populate a TeacherListBean in the application scope if one doesn't
		// already exist (for upper grades only)

		ArrayList listB = (ArrayList) context.getAttribute("teacherListBig");
		if (listB == null) {
			String s = rb.getString("bigform.lowest.grade");
			int grade = 4;
			try {
				grade = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				// ignore, take default of grade 4
			}
			listB = new ArrayList();
			listB.add(new TeacherListBean("Select a Teacher", 0));
			try {
				TeachersDA tda = new TeachersDA(ds);
				Vector teachersV = tda.getTeachers();
				TeacherBean tb = null;
				for (int i = 0; i < teachersV.size(); i++) {
					tb = (TeacherBean) teachersV.get(i);
					if (tb.getGrade() >= grade)
						listB
								.add(new TeacherListBean(tb.getLastname()
										+ " (grade " + tb.getGrade() + ")", tb
										.getId()));
				}
			} catch (Exception e) {
				throw new AppException("Error creating the Teacher list", e);
			}
			context.setAttribute("teacherListBig", listB);
		}
	}

	private static void checkTeacherListSmall(DataSource ds,
			ServletContext context, ResourceBundle rb) throws AppException {
		// Populate a TeacherListBean in the application scope if one doesn't
		// already exist (for lower grades only)

		ArrayList listS = (ArrayList) context.getAttribute("teacherListSmall");
		if (listS == null) {
			String s = rb.getString("bigform.lowest.grade");
			int grade = 4;
			try {
				grade = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				// ignore - take default of 4
			}
			listS = new ArrayList();
			listS.add(new TeacherListBean("Select a Teacher", 0));
			try {
				TeachersDA tda = new TeachersDA(ds);
				Vector teachersV = tda.getTeachers();
				TeacherBean tb = null;
				for (int i = 0; i < teachersV.size(); i++) {
					tb = (TeacherBean) teachersV.get(i);
					if (tb.getGrade() < grade)
						listS
								.add(new TeacherListBean(tb.getLastname()
										+ " (grade " + tb.getGrade() + ")", tb
										.getId()));
				}
			} catch (Exception e) {
				throw new AppException("Error creating the Teacher list", e);
			}
			context.setAttribute("teacherListSmall", listS);
		}
	}

}
