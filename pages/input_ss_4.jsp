<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 4 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="4"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>CHILDCARE</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="ch100"/>I like to take care of younger children.<br>
<input type="hidden" name="ch100" value="false">
<html:checkbox property="ch101"/>I like babies.<br>
<input type="hidden" name="ch101" value="false">
<html:checkbox property="ch102"/>I like to play with little children.<br>
<input type="hidden" name="ch102" value="false">
<html:checkbox property="ch103"/>I take care of a younger brother or sister.<br>
<input type="hidden" name="ch103" value="false">
<html:checkbox property="ch104"/>I have, or would like to have, a younger brother or sister.<br>
<input type="hidden" name="ch104" value="false">
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

