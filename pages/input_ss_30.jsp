<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 30 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="30"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>TOYS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td colspan="2" align="left"><br><em>Some of my favorite toys are:</em><br>
<i>(<bean:message key="check.three"/>)</i></td>
</tr><tr>
<td><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to100"/>stuffed or soft animals<br>
<input type="hidden" name="to100" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to101"/>action figures<br>
<input type="hidden" name="to101" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to102"/>dolls<br>
<input type="hidden" name="to102" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to103"/>electronic games<br>
<input type="hidden" name="to103" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to104"/>video games<br>
<input type="hidden" name="to104" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to105"/>computer games<br>
<input type="hidden" name="to105" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to106"/>board games<br>
<input type="hidden" name="to106" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to107"/>hoola hoop<br>
<input type="hidden" name="to107" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to108"/>skip it<br>
<input type="hidden" name="to108" value="false">
</td><td><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to109"/>jump rope<br>
<input type="hidden" name="to109" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to110"/>sports equipment<br>
<input type="hidden" name="to110" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to111"/>dress up clothes<br>
<input type="hidden" name="to111" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to112"/>puppets<br>
<input type="hidden" name="to112" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to113"/>bike<br>
<input type="hidden" name="to113" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to114"/>scooter<br>
<input type="hidden" name="to114" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to115"/>roller blades<br>
<input type="hidden" name="to115" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to116"/>sidewalk chalk<br>
<input type="hidden" name="to116" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="to117"/>silly putty, gooze, or Flubber<br>
<input type="hidden" name="to117" value="false">
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

