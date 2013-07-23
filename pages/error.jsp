<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>


<html:html locale="true">
<head>
<title>Error!</title>
<html:base/>
<link rel="stylesheet" href="../CSS/style1.css" type="text/css">
</head>
<body>

<br>
<center>
<h4>An Application error has occurred.</h4>
</center><br>

<center>
<div class="box">
<h4>Description:</h4><font size="+1" color="red">
<jsp:getProperty name="AppException" property="message"/>
</font>
<br>
<h4>Detail:</h4>
<jsp:getProperty name="AppException" property="e"/>
<%--
  org.jmanderson.ahs.AppException e = (org.jmanderson.ahs.AppException) session.getAttribute("AppException");
  e.printStackTrace();
--%>
<br>
<br>
</div>
</center>
<br>
<center>
<h4>
<a href="javascript:history.go(-1)">Back</a>
</h4>
</body>
</html:html>

