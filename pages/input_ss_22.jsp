<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 22 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="22"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>NATURE</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="na100"/>I like nature.<br>
<input type="hidden" name="na100" value="false">
<html:checkbox property="na101"/>I like to go camping with a tent.<br>
<input type="hidden" name="na101" value="false">
<html:checkbox property="na102"/>I like to take walks in the woods.<br>
<input type="hidden" name="na102" value="false">
<html:checkbox property="na103"/>I like to take care of the environment.<br>
<input type="hidden" name="na103" value="false">
<html:checkbox property="na104"/>I have helped take care of the environment.<br>
<input type="hidden" name="na104" value="false">
<html:checkbox property="na105"/>I am interested in solar energy.<br>
<input type="hidden" name="na105" value="false">
<html:checkbox property="na106"/>I am interested in wind energy.<br>
<input type="hidden" name="na106" value="false">
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

