<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 24 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="24"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>POLITICS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="po100"/>I think it is important to vote in elections.<br>
<input type="hidden" name="po100" value="false">
<html:checkbox property="po101"/>I think I might like to be a mayor, governor or president.<br>
<input type="hidden" name="po101" value="false">
<html:checkbox property="po102"/>I think a mayor, governor or president has an interesting job.<br>
<input type="hidden" name="po102" value="false">
<html:checkbox property="po103"/>I would like to be in charge of a town, state or country.<br>
<input type="hidden" name="po103" value="false">
<html:checkbox property="po104"/>Elections interest me.<br>
<input type="hidden" name="po104" value="false">
</td>
</tr>
</table>
<br>
</fieldset>
<br>
<center>
<table width="50%" borders="0">
<tr><td align="left">
<html:submit onclick="document.forms[0].pageNumber.value=document.forms[0].pageNumber.value-2"><bean:message key="button.back"/></html:submit>
</td><td align="center">
<html:cancel><bean:message key="button.cancel"/></html:cancel>
</td><td align="right">
<html:submit><bean:message key="button.submit"/></html:submit>
</td></tr></table>

</center>
</html:form>

