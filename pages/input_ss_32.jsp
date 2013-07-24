<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 32 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="32"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>TRAVEL / CULTURE</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="tr100"/>I like to travel to new places.<br>
<input type="hidden" name="tr100" value="false">
<html:checkbox property="tr101"/>I like to find places on a map or globe.<br>
<input type="hidden" name="tr101" value="false">
<html:checkbox property="tr102"/>I like to find out about the foods in other countries.<br>
<input type="hidden" name="tr102" value="false">
<html:checkbox property="tr103"/>I like to find out about the clothing in other countries.<br>
<input type="hidden" name="tr103" value="false">
<html:checkbox property="tr104"/>I like to find out about the music or art of other countries.<br>
<input type="hidden" name="tr104" value="false">
<html:checkbox property="tr105"/>I have been to more than three states.<br>
<input type="hidden" name="tr105" value="false">
<html:checkbox property="tr106"/>I have been to more than one country.<br>
<input type="hidden" name="tr106" value="false">
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

