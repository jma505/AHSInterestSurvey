<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 17 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="17"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>MEDIA - TV</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><td>
<br><html:checkbox property="me100"/>I like watching TV.<br></td>
<input type="hidden" name="me100" value="false">
</tr><tr>
<td align="left" colspan="3"><br><em>My favorite kinds of TV shows are:</em><br>
<i>(<bean:message key="check.three"/>)</i></td></tr><tr>
<td><br>
<html:checkbox property="me101"/>Music<br>
<input type="hidden" name="me101" value="false">
<html:checkbox property="me102"/>Sports<br>
<input type="hidden" name="me102" value="false">
<html:checkbox property="me103"/>News<br>
<input type="hidden" name="me103" value="false">
<html:checkbox property="me104"/>Cartoons<br>
<input type="hidden" name="me104" value="false">
<html:checkbox property="me105"/>Drama<br>
<input type="hidden" name="me105" value="false">
</td>
<td><br>
<html:checkbox property="me106"/>Comedy<br>
<input type="hidden" name="me106" value="false">
<html:checkbox property="me107"/>Mystery<br>
<input type="hidden" name="me107" value="false">
<html:checkbox property="me108"/>History<br>
<input type="hidden" name="me108" value="false">
<html:checkbox property="me109"/>Soap Operas<br>
<input type="hidden" name="me109" value="false">
<html:checkbox property="me110"/>How-To<br>
<input type="hidden" name="me110" value="false">
</td><td><br>
<html:checkbox property="me111"/>Action<br>
<input type="hidden" name="me111" value="false">
<html:checkbox property="me112"/>Science Fiction<br>
<input type="hidden" name="me112" value="false">
<html:checkbox property="me113"/>Westerns<br>
<input type="hidden" name="me113" value="false">
<html:checkbox property="me114"/>Factual (like Discovery Channel)<br>
<input type="hidden" name="me114" value="false">
<html:checkbox property="me115"/>Game Shows<br>
<input type="hidden" name="me115" value="false">
</td>
</tr></table>
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

