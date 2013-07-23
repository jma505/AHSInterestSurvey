<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html>
<head>

<title><tiles:getAsString name="title"/></title>
<html:base/>
<link rel="StyleSheet" type="text/css" href="../../CSS/style1.css">
</head>
<body>
<table border="0" cellpadding="3" cellspacing="3" width="100%">
<tr>
<td>
<tiles:insert attribute="banner">
</tiles:insert>
</td>
</tr>
<tr>
<td>
<tiles:insert attribute="content"/>
</td>
</tr>
</table>

</body>
</html:html>
