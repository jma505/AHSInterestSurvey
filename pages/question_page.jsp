<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:equal name="entryForm1" property="edit" value="true">
  <logic:present name="questionPageListBig">
  <html:select property="jumpPageNumber" size="1">
  <html:options collection="questionPageListBig" labelProperty="label" property="value"/>
  </html:select>&nbsp;&nbsp;&nbsp;<html:submit property="jump" value="jump" onclick="javascript:document.forms[0].submit()">Go</html:submit><br>
  </logic:present>
</logic:equal>

