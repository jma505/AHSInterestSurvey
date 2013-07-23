<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 33 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="33"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>VEHICLES</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td colspan="2" align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="ve100"/>I like cars.<br>
<input type="hidden" name="ve100" value="false">
<html:checkbox property="ve101"/>I can name many kinds of cars.<br>
<input type="hidden" name="ve101" value="false">
<html:checkbox property="ve102"/>I like trucks.<br>
<input type="hidden" name="ve102" value="false">
<html:checkbox property="ve103"/>I can name many kinds of trucks.<br>
<input type="hidden" name="ve103" value="false">
<html:checkbox property="ve104"/>I have ridden in a truck.<br>
<input type="hidden" name="ve104" value="false">
<html:checkbox property="ve105"/>I like trains.<br>
<input type="hidden" name="ve105" value="false">
<html:checkbox property="ve106"/>I can name many kinds of trains.<br>
<input type="hidden" name="ve106" value="false">
<html:checkbox property="ve107"/>I have ridden in a train.<br>
<input type="hidden" name="ve107" value="false">
<html:checkbox property="ve108"/>I like airplanes.<br>
<input type="hidden" name="ve108" value="false">
</td><td><br>
<html:checkbox property="ve109"/>I can name many kinds of planes.<br>
<input type="hidden" name="ve109" value="false">
<html:checkbox property="ve110"/>I have flown on a plane.<br>
<input type="hidden" name="ve110" value="false">
<html:checkbox property="ve111"/>I like motorcycles.<br>
<input type="hidden" name="ve111" value="false">
<html:checkbox property="ve112"/>I can name many kinds of motorcycles.<br>
<input type="hidden" name="ve112" value="false">
<html:checkbox property="ve113"/>I have ridden on a motorcycle.<br>
<input type="hidden" name="ve113" value="false">
<html:checkbox property="ve114"/>I like snowmobiles.<br>
<input type="hidden" name="ve114" value="false">
<html:checkbox property="ve115"/>I have ridden on a snowmobile.<br>
<input type="hidden" name="ve115" value="false">
<html:checkbox property="ve116"/>I like bicycles.<br>
<input type="hidden" name="ve116" value="false">
<html:checkbox property="ve117"/>I ride a bicycle.<br>
<input type="hidden" name="ve117" value="false">
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

