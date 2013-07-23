<%@ page language="java" session="false" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html locale="true">
<head><title><bean:message key="login.title"/></title>
<html:base/>
<link rel="stylesheet" href="../CSS/style1.css" type="text/css">
</head>
<body>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<p>
<center><h3><bean:message key="login.welcome"/></h3></center>
</p>
<html:form action="processLogin.do" focus="username">
<table border="0" width="100%">
  <tr>
    <th align="right">
      <bean:message key="prompt.username"/>
    </th>
    <td align="left">
      <html:text property="username" size="15" maxlength="15"/>
    </td>
  </tr>

  <tr>
    <th align="right">
      <bean:message key="prompt.password"/>
    </th>
    <td align="left">
      <html:password property="password" size="15" maxlength="15"/>
    </td>
  </tr>

  <tr>
    <td align="right">
    </td>
    <td align="left">
      <html:submit property="submit" value="Submit"/>
    </td>
  </tr>

</table>

</html:form>

</body>
</html:html>

