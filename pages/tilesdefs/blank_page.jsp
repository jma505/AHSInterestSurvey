<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html>
<head>

<title><tiles:getAsString name="title"/></title>
<html:base/>
<link rel="StyleSheet" type="text/css" href="../../CSS/style1.css">
</head>
<body>
<tiles:insert attribute="content"/>

</body>
</html:html>
