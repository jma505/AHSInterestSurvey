<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:base/>
<link rel="stylesheet" href="CSS/style1.css" type="text/css">
<br>
<center>
<h3><%= request.getAttribute("teacher") %> (Grade <%= request.getAttribute("grade") %> - <%= request.getAttribute("count") %> Students)</h3>

<%@ include file="/pages/threshold_form.jsp" %>

<div class="boxcolor">
<table align="center" border="0" cellspacing="5" cellpadding="1">
<tr>
  <th align="left"><big>Student</big></th>
  <th align="left"><big>Interests</big></th>
</tr>
<%
  java.util.Vector v = (java.util.Vector) request.getAttribute("students");
  String s;
  for (int i = 0; i < v.size(); i++) {
    org.jmanderson.ahs.dataobjects.StudentBean student = (org.jmanderson.ahs.dataobjects.StudentBean) v.get(i);
    request.setAttribute("student", student);
%>
<tr><td valign="top">
<html:link href="../../listStudent.do" paramId="studentId" paramName="student" paramProperty="id" target="_blank">
<%= student.getStudentFullnameRev() %>
</html:link>
</td><td>
<%  s = student.getInterests();
    if (s.length() > 2) out.print(s.substring(1, s.length()-1));  %>
</td></tr>
<%
  }
%>
</table>
</div>
<br>
<h4><html:link action="/chooseTeacher.do">Choose another Teacher</html:link></h4>
</center>



