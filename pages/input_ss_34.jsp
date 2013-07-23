<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 34 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="34"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>WEATHER</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="we100"/>I like it when it rains.<br>
<input type="hidden" name="we100" value="false">
<html:checkbox property="we101"/>I like it when it snows.<br>
<input type="hidden" name="we101" value="false">
<html:checkbox property="we102"/>I <b>only</b> like it when it is warm and sunny outside.<br>
<input type="hidden" name="we102" value="false">
<html:checkbox property="we103"/>I like to watch the clouds.<br>
<input type="hidden" name="we103" value="false">
<html:checkbox property="we104"/>I wonder about what makes it rain.<br>
<input type="hidden" name="we104" value="false">
<html:checkbox property="we105"/>I wonder about what makes it snow.<br>
<input type="hidden" name="we105" value="false">
<html:checkbox property="we106"/>I wonder about what makes it windy.<br>
<input type="hidden" name="we106" value="false">
<html:checkbox property="we107"/>I wonder about what makes it sunny.<br>
<input type="hidden" name="we107" value="false">
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

