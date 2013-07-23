<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 25 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="25"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>PROBLEM SOLVING</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="ps100"/>I like to solve problems.<br>
<input type="hidden" name="ps100" value="false">
<html:checkbox property="ps101"/>I like to find out why things happen.<br>
<input type="hidden" name="ps101" value="false">
<html:checkbox property="ps102"/>I like to find out how things work.<br>
<input type="hidden" name="ps102" value="false">
<html:checkbox property="ps103"/>I like to think about things until I figure them out.<br>
<input type="hidden" name="ps103" value="false">
<html:checkbox property="ps104"/>I like to work with others to figure things out.<br>
<input type="hidden" name="ps104" value="false">
<html:checkbox property="ps105"/>I like to figure out puzzles.<br>
<input type="hidden" name="ps105" value="false">
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

