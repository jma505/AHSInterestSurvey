<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 23 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="23"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>PERFORMING ARTS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="pa100"/>I like to, or would like to learn how to, dance.<br>
<input type="hidden" name="pa100" value="false">
<html:checkbox property="pa101"/>I take dance lessons.<br>
<input type="hidden" name="pa101" value="false">
<html:checkbox property="pa102"/>I have performed dances in front of an audience.<br>
<input type="hidden" name="pa102" value="false">
<html:checkbox property="pa103"/>I would like to be in a play on a stage.<br>
<input type="hidden" name="pa103" value="false">
<html:checkbox property="pa104"/>I have been in a play on a stage.<br>
<input type="hidden" name="pa104" value="false">
<html:checkbox property="pa105"/>I like to watch shows that are on a stage.<br>
<input type="hidden" name="pa105" value="false">
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

