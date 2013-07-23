<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 21 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="21"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>MUSIC</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr><td>
<br>I like listening to:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu100"/>Jazz<br>
<input type="hidden" name="mu100" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu101"/>Classical<br>
<input type="hidden" name="mu101" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu102"/>Pop<br>
<input type="hidden" name="mu102" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu103"/>Hip Hop<br>
<input type="hidden" name="mu103" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu104"/>Rap<br>
<input type="hidden" name="mu104" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu105"/>Rock<br>
<input type="hidden" name="mu105" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu106"/>New Age<br>
<input type="hidden" name="mu106" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu111"/>Country<br>
<input type="hidden" name="mu111" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu112"/>Gospel<br>
<input type="hidden" name="mu112" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu107"/>Other not listed here<br>
<input type="hidden" name="mu107" value="false">
<br>
<html:checkbox property="mu108"/>I like to sing.<br>
<input type="hidden" name="mu108" value="false">
<html:checkbox property="mu109"/>I play an instrument.<br>
<input type="hidden" name="mu109" value="false">
<html:checkbox property="mu110"/>I would like to play an instrument.<br>
<input type="hidden" name="mu110" value="false">
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

