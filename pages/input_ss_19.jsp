<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 19 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="19"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>MEDIA - MOVIES</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><td>
<html:checkbox property="me125"/>I like watching Movies.<br></td>
<input type="hidden" name="me125" value="false">
</tr><tr>
<td align="left" colspan="3"><br><em>My favorite kinds of Movies are:</em><br>
<i>(<bean:message key="check.three"/>)</i></td></tr><tr>
<td><br>
<html:checkbox property="me126"/>Comedy<br>
<input type="hidden" name="me126" value="false">
<html:checkbox property="me127"/>Drama<br>
<input type="hidden" name="me127" value="false">
<html:checkbox property="me128"/>Action<br>
<input type="hidden" name="me128" value="false">
</td><td><br>
<html:checkbox property="me129"/>Family<br>
<input type="hidden" name="me129" value="false">
<html:checkbox property="me130"/>Horror<br>
<input type="hidden" name="me130" value="false">
<html:checkbox property="me131"/>Science Fiction<br>
<input type="hidden" name="me131" value="false">
</td><td><br>
<html:checkbox property="me132"/>Classic<br>
<input type="hidden" name="me132" value="false">
<html:checkbox property="me133"/>Childrens'<br>
<input type="hidden" name="me133" value="false">
<html:checkbox property="me134"/>Musical<br>
<input type="hidden" name="me134" value="false">
</td></tr><tr>
<td colspan="3"><br><hr><center><b><big>MEDIA - LISTENING</big></b><br><br></center>
<em><bean:message key="check.all"/></em><br><br>
<html:checkbox property="me135"/>I like listening to stories on an MP3 player, iPod, or similar device.<br>
<input type="hidden" name="me135" value="false">
<html:checkbox property="me136"/>I like listening to music on an MP3 player, iPod, or similar device.<br>
<input type="hidden" name="me136" value="false">
<html:checkbox property="me139"/>I like listening to stories on a computer.<br>
<input type="hidden" name="me139" value="false">
<html:checkbox property="me140"/>I like listening to music on a computer.<br>
<input type="hidden" name="me140" value="false">
</td></tr>
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

