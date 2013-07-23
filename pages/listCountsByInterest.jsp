<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>


<html:html locale="true">
<head>
<title>Entire School Listing (Interests)</title>
<html:base/>
<link rel="stylesheet" href="CSS/style1.css" type="text/css">
</head>
<body>
<br>
<center>
<h3>Counts by Interest (Entire School - <%= request.getAttribute("count") %> Students)</h3>

<%@ include file="/pages/threshold_form2.jsp" %>

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
  StringBuffer sb = new StringBuffer();
  for (int i = 0; i < v.size(); i++) {
    org.jmanderson.ahs.dataobjects.MiniInterestBean interest = (org.jmanderson.ahs.dataobjects.MiniInterestBean) v.get(i);
    request.setAttribute("interest", interest);
%>
<tr><td valign="top">
<%
  sb.delete(0, sb.length());
  sb.append("../../interestDetails.do?threshold=").append(th);
  sb.append("&topicId=").append(interest.getTopicId());
  sb.append("&minority=").append(minority);
  url = response.encodeURL(sb.toString());
  out.print("<a href=\"");
  out.print(url);
  out.println("\">");
%>
<%= interest.getInterestName() %>
</a>
</td><td></td><td>
<%= interest.getCount() %>
</td><td>
<%
  out.println("(" + (interest.getCount() * 100) / total + "%)");
%>
</td><td>
<%
  out.print("    ");
  for (int j = 0; j <= interest.getCount()/5; j++)
    out.print("*");
%>
</td></tr>
<%
  }
%>
</table>
</div>
</center>

</body>
</html:html>

