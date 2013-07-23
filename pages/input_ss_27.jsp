<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 27 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="27"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>RELATIONSHIPS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr><td>
<br>The things that are the <b>most</b> important to me are:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="rl100"/>My friends<br>
<input type="hidden" name="rl100" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="rl101"/>My family<br>
<input type="hidden" name="rl101" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="rl102"/>My teachers<br>
<input type="hidden" name="rl102" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="rl103"/>People that aren't listed here<br>
<input type="hidden" name="rl103" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="rl104"/>My toys<br>
<input type="hidden" name="rl104" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="rl105"/>I like <b>things more</b> than people<br>
<input type="hidden" name="rl105" value="false">
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

