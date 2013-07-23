<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 10 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="10"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean.message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>FOOD</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="fo100"/>I like to make things to eat.<br>
<input type="hidden" name="fo100" value="false">
<html:checkbox property="fo101"/>I like to eat lots of different kinds of food.<br>
<input type="hidden" name="fo101" value="false">
<html:checkbox property="fo102"/>I have cooked all or part of a meal for myself or others.<br>
<input type="hidden" name="fo102" value="false">
<html:checkbox property="fo103"/>I have baked something for myself or others.<br>
<input type="hidden" name="fo103" value="false">
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

