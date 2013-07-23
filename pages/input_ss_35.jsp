<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 35 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="35"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>WRITING</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="wr100"/>I like to write stories about imaginary people, places or things.<br>
<input type="hidden" name="wr100" value="false">
<html:checkbox property="wr101"/>I like to write long stories.<br>
<input type="hidden" name="wr101" value="false">
<html:checkbox property="wr102"/>I like to write short stories.<br>
<input type="hidden" name="wr102" value="false">
<html:checkbox property="wr103"/>I like to write poems.<br>
<input type="hidden" name="wr103" value="false">
<html:checkbox property="wr104"/>I like to write about something that really happened.<br>
<input type="hidden" name="wr104" value="false">
<html:checkbox property="wr105"/>I like to write to get people to agree with me or understand my ideas.<br>
<input type="hidden" name="wr105" value="false">
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

