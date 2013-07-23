<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/x.tld" prefix="x" %>


<html:html locale="true">
<head>
<title><tiles:getAsString name="title"/></title>
<html:base/>
<link rel="stylesheet" href="CSS/style1.css" type="text/css">
</head>
<body onload="javascript:self.resizeTo(600, 400);">
<br>
<center>
<h4><a href="javascript:self.close();">Close this window</a></h4>
<div class="boxcolor90">
<br>
<c:import url="/XML/student_listS.xsl" var="xslt"/>
<x:parse var="xml">
<jsp:getProperty name="student" property="xml"/>
</x:parse>
<x:transform xml="${xml}" xslt="${xslt}"/>
<br>
</div>
<br>
<h4><a href="javascript:self.close();">Close this window</a></h4>
</center>

</body>
</html:html>

