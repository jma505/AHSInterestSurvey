<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 29 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="29"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>SOCIAL AWARENESS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br>
<html:checkbox property="sa100"/>I think it is important to take care of other people.<br>
<input type="hidden" name="sa100" value="false">
<html:checkbox property="sa101"/>I would like to help others.<br>
<input type="hidden" name="sa101" value="false">
<html:checkbox property="sa102"/>I have helped with projects that help other people.<br>
<input type="hidden" name="sa102" value="false">
<br>I am concerned about:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sa103"/>the homeless<br>
<input type="hidden" name="sa103" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sa104"/>old people<br>
<input type="hidden" name="sa104" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sa105"/>poor people<br>
<input type="hidden" name="sa105" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sa106"/>people that get hurt by other people<br>
<input type="hidden" name="sa106" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sa107"/>crime<br>
<input type="hidden" name="sa107" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sa108"/>war<br>
<input type="hidden" name="sa108" value="false">
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

