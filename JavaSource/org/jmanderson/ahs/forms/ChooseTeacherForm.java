package org.jmanderson.ahs.forms;

/**
 * Updated for 2002-2003
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class ChooseTeacherForm extends ActionForm {

  public ChooseTeacherForm() {
    teacherId = 0;
    display = "student";
    search = 0;
    threshold = 4;
    minority = "both";
  }

  private int teacherId;
  private String display;
  private int search;
  private int threshold;
  private String minority;

  public int getTeacherId() { return teacherId; }
  public String getDisplay() { return display; }
  public int getSearch() { return search; }
  public int getThreshold() { return threshold; }
  public String getMinority() { return minority; }
  public void setTeacherId(int i) { teacherId = i; }
  public void setDisplay(String s) { display = s; }
  public void setSearch(int i) { search = i; }
  public void setThreshold(int i) { threshold = i; }
  public void setMinority(String s) { minority = s; }

  public void reset(ActionMapping mapping, HttpServletRequest request) {

    search = 0;
    display = "student";
    threshold = 4;
    teacherId = 0;
    minority = "both";

  }

  public ActionErrors validate(ActionMapping mapping, 
				HttpServletRequest request) {

    ActionErrors errors = new ActionErrors();

    if (teacherId <= 0) {
      errors.add("teacherId", new ActionError("error.teacher.required"));
    }

    return errors;

  }

}

