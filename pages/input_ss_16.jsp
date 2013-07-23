<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 16 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="16"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>SCHOOL SUBJECTS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="ss100"/>I like Math.<br>
<input type="hidden" name="ss100" value="false">
<html:checkbox property="ss101"/>I like doing things with numbers.<br>
<input type="hidden" name="ss101" value="false">
<html:checkbox property="ss102"/>I like Reading.<br>
<input type="hidden" name="ss102" value="false">
<html:checkbox property="ss103"/>I like Writing.<br>
<input type="hidden" name="ss103" value="false">
<html:checkbox property="ss104"/>I like Science.<br>
<input type="hidden" name="ss104" value="false">
<html:checkbox property="ss105"/>I like experimenting with things and seeing what happens.<br>
<input type="hidden" name="ss105" value="false">
<html:checkbox property="ss106"/>I like Social Studies (learning about the past, other countries, and other people).<br>
<input type="hidden" name="ss106" value="false">
<html:checkbox property="ss107"/>I like finding places on maps or globes.<br>
<input type="hidden" name="ss107" value="false">
<html:checkbox property="ss108"/>I like Gym.<br>
<input type="hidden" name="ss108" value="false">
<html:checkbox property="ss109"/>I like Art Class.<br>
<input type="hidden" name="ss109" value="false">
<html:checkbox property="ss110"/>I like Music Class.<br>
<input type="hidden" name="ss110" value="false">
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

