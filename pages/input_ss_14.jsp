<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 14 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="14"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>FOREIGN LANGUAGE</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td>
<br>I can speak and understand over 100 words in a language other than English.<br>
That language is:<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl100"/>Chinese<br>
<input type="hidden" name="fl100" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl101"/>Japanese<br>
<input type="hidden" name="fl101" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl102"/>French<br>
<input type="hidden" name="fl102" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl103"/>Spanish<br>
<input type="hidden" name="fl103" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl110"/>Italian<br>
<input type="hidden" name="fl110" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl104"/>German<br>
<input type="hidden" name="fl104" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl105"/>Russian<br>
<input type="hidden" name="fl105" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl106"/>Vietnamese<br>
<input type="hidden" name="fl106" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl107"/>Korean<br>
<input type="hidden" name="fl107" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl111"/>Hebrew<br>
<input type="hidden" name="fl111" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="fl108"/>Other language not listed here<br>
<input type="hidden" name="fl108" value="false">
<br>
<html:checkbox property="fl109"/>I would like to learn another language.<br>
<input type="hidden" name="fl109" value="false">
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

