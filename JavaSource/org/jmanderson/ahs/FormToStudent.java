package org.jmanderson.ahs;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.jmanderson.ahs.da.TeachersDA;
import org.jmanderson.ahs.dataobjects.CheckBoxes1;
import org.jmanderson.ahs.dataobjects.CheckBoxes2;
import org.jmanderson.ahs.dataobjects.StudentBean;
import org.jmanderson.ahs.dataobjects.TeacherBean;
import org.jmanderson.ahs.forms.EntryForm1;
import org.jmanderson.ahs.forms.EntryForm2;

public class FormToStudent {

  private StudentBean sb;
  private DataSource ds;

  public FormToStudent(DataSource ds) {
    sb = new StudentBean();
    sb.setId(0);
    this.ds = ds;
  }

  public FormToStudent(DataSource ds, int studentId) {
    sb = new StudentBean();
    sb.setId(studentId);
    this.ds = ds;
  }

  public void reset() {
    sb = new StudentBean();
    sb.setId(0);
  }

  public void reset(int studentId) {
    sb = new StudentBean();
    sb.setId(studentId);
  }

  public StudentBean convert(EntryForm1 bef) 
		throws Exception, SQLException {

    // STUDENT INFORMATION
    sb.setFirstname(bef.getStudentFirstName());
    sb.setLastname(bef.getStudentLastName());
    TeachersDA tda = new TeachersDA(ds);
    TeacherBean tb = tda.getTeacher(bef.getTeacherId());
    sb.setTb(tb);
    CheckBoxes1 cb = new CheckBoxes1();
    cb.loadFromEntryForm(bef);
    sb.setCheckBoxes(cb);

    sb.prepareForTransport();
    return sb;

  }

  public StudentBean convert(EntryForm2 sef) 
		throws Exception, SQLException {

    // STUDENT INFORMATION
    sb.setFirstname(sef.getStudentFirstName());
    sb.setLastname(sef.getStudentLastName());
    TeachersDA tda = new TeachersDA(ds);
    TeacherBean tb = tda.getTeacher(sef.getTeacherId());
    sb.setTb(tb);
    CheckBoxes2 cb = new CheckBoxes2();
    cb.loadFromEntryForm(sef);
    sb.setCheckBoxes(cb);

    sb.prepareForTransport();
    return sb;

  }

}

