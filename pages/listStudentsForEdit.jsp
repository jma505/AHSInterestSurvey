<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:base/>
<link rel="stylesheet" href="CSS/style1.css" type="text/css">
<br>
<center>
<h3><%= request.getAttribute("teacher") %> (Grade <%= request.getAttribute("grade") %>)</h3>


<div class="boxcolor">
<table align="center" border="0" cellspacing="5" cellpadding="1">
<tr>
  <th align="left"><big>Student</big></th>
  <th align="left"><big>Minority?</big></th>
</tr>
<%
  java.util.List list = (java.util.List) request.getAttribute("students");
  String s;
  java.util.Iterator iter = list.iterator();
  while (iter.hasNext()) {
    org.jmanderson.ahs.dataobjects.MiniStudentBean student = (org.jmanderson.ahs.dataobjects.MiniStudentBean) iter.next();
    request.setAttribute("student", student);
%>
<tr><td valign="top">
<html:link action="/prepareStudentEdit.do" paramId="studentId" paramName="student" paramProperty="studentId">
<%= student.getStudentLastFirstName() %>
</html:link>
</td><td>
<%  if (student.getMinority()) { out.print("Yes"); } else { out.print("No"); }  %>
</td></tr>
<%
  }
%>
</table>
</div>
<br>
<h4><html:link action="/chooseTeacher.do">Choose another Teacher</html:link></h4>
</center>



