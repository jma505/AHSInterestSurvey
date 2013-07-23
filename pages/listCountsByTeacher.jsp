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
  <th align="left"><big>Interest</big></th>
  <th></th>
  <th align="left" colspan="3"><big>Count</big></th>
</tr>
<%
  int total = Integer.parseInt((String) request.getAttribute("count"));
  java.util.Vector v = (java.util.Vector) request.getAttribute("interests");
  for (int i = 0; i < v.size(); i++) {
    org.jmanderson.ahs.dataobjects.InterestBean interest = (org.jmanderson.ahs.dataobjects.InterestBean) v.get(i);
    request.setAttribute("interest", interest);
%>
<tr><td valign="top">
<%= interest.getInterestName() %>
</td><td></td><td>
<%= interest.getCount() %>
</td><td>
<%
  out.println("(" + (interest.getCount() * 100) / total + "%)");
%>
</td><td>
<%
  out.print("    ");
  for (int j = 0; j < interest.getCount(); j++)
    out.print("*");
%>
</td></tr>
<%
  }
%>
</table>
</div>
<br>
<h4><html:link action="/chooseTeacher.do">Choose another Teacher</html:link></h4>
</center>


