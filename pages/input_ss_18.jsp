<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 18 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="18"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>MEDIA - RADIO</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><td>
<html:checkbox property="me116"/>I like listening to the Radio.<br></td>
<input type="hidden" name="me116" value="false">
</tr><tr>
<td align="left" colspan="3"><br><em>My favorite kinds of Radio shows are:</em><br>
<i>(<bean:message key="check.three"/>)</i></td></tr><tr>
<td><br>
<html:checkbox property="me117"/>Pop<br>
<input type="hidden" name="me117" value="false">
<html:checkbox property="me118"/>Rock<br>
<input type="hidden" name="me118" value="false">
<html:checkbox property="me119"/>News<br>
<input type="hidden" name="me119" value="false">
<html:checkbox property="me120"/>Classical<br>
<input type="hidden" name="me120" value="false">
</td><td><br>
<html:checkbox property="me121"/>Jazz<br>
<input type="hidden" name="me121" value="false">
<html:checkbox property="me122"/>Rap<br>
<input type="hidden" name="me122" value="false">
<html:checkbox property="me123"/>Hip-Hop<br>
<input type="hidden" name="me123" value="false">
<html:checkbox property="me124"/>Talk Show<br>
<input type="hidden" name="me124" value="false">
</td><td><br>
<html:checkbox property="me137"/>Country<br>
<input type="hidden" name="me137" value="false">
<html:checkbox property="me138"/>Gospel<br>
<input type="hidden" name="me138" value="false">
</td></tr></table><br>
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

