<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html locale="true">
<head>
<title><tiles:getAsString name="title"/></title>
<html:base/>
<link rel="stylesheet" href="CSS/style1.css" type="text/css">
</head>
<body>
<br>
<center>
<%
  java.util.Vector v = (java.util.Vector) request.getAttribute("students");
%>
<h3><%= v.size() %> Student<% if (v.size() != 1) out.print("s"); %> for "<%= request.getAttribute("interest") %>":</h3>

<%@ include file="/pages/threshold_form3.jsp" %>

<div class="boxcolor">
<table align="center" border="0" cellspacing="5" cellpadding="1">
<tr>
  <th align="left"><big>Student</big></th>
  <th align="left"><big>Count</big></th>
  <th align="left"><big>Teacher</big></th>
</tr>
<%
  String s;
  for (int i = 0; i < v.size(); i++) {
    org.jmanderson.ahs.dataobjects.MiniStudentBean student = (org.jmanderson.ahs.dataobjects.MiniStudentBean) v.get(i);
    request.setAttribute("student", student);
%>
<tr><td valign="top">
<html:link href="../../listStudent.do" paramId="studentId" paramName="student" paramProperty="studentId" target="_blank">
<%= student.getStudentLastFirstName() %>
</html:link>
</td><td>
<%= student.getCount() %>
</td><td>
<%= student.getTeacher() %>
</td></tr>
<%
  }
%>
</table>
</div>
<br>
<%
  StringBuffer sb = new StringBuffer();
  sb.append("../../allCounts.do?threshold=");
  sb.append(request.getAttribute("threshold"));
  sb.append("&minority=").append(minority);
  out.print("<a href=\"");
  out.print(response.encodeURL(sb.toString()) + "\">");
  out.println("Return to Counts by Interest</a>");
%>
</center>

</body>
</html:html>

