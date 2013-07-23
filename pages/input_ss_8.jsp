<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 8 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="8"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>CRAFTS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="cr100"/>I like to make things with my hands.<br>
<input type="hidden" name="cr100" value="false">
<html:checkbox property="cr101"/>I like to make things from a kit.<br>
<input type="hidden" name="cr101" value="false">
<html:checkbox property="cr102"/>I like to make things with cloth or yarn.<br>
<input type="hidden" name="cr102" value="false">
<html:checkbox property="cr103"/>I like to make things from clay.<br>
<input type="hidden" name="cr103" value="false">
<html:checkbox property="cr104"/>I like to make jewelry or things like jewelry.<br>
<input type="hidden" name="cr104" value="false">
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

