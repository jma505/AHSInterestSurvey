<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 12 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="12"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>HISTORY</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><br>
<td>
</td></tr><tr>
<td align="left"><br><em>I would like to meet:</em><br>
<i>(Check NONE, ONE, or TWO people that you wish you could have met)</i></td>
</tr><tr>
<td><br>
<html:checkbox property="hi101"/>George Washington<br>
<input type="hidden" name="hi101" value="false">
<html:checkbox property="hi102"/>Abraham Lincoln<br>
<input type="hidden" name="hi102" value="false">
<html:checkbox property="hi103"/>Martin Luther King, Jr.<br>
<input type="hidden" name="hi103" value="false">
<html:checkbox property="hi104"/>Gandhi<br>
<input type="hidden" name="hi104" value="false">
<html:checkbox property="hi105"/>Robert E. Lee<br>
<input type="hidden" name="hi105" value="false">
<html:checkbox property="hi106"/>Albert Einstein<br>
<input type="hidden" name="hi106" value="false">
<html:checkbox property="hi107"/>Marie Curie<br>
<input type="hidden" name="hi107" value="false">
<html:checkbox property="hi108"/>Eleanor Roosevelt<br>
<input type="hidden" name="hi108" value="false">
<html:checkbox property="hi109"/>Harriet Tubman<br>
<input type="hidden" name="hi109" value="false">
<html:checkbox property="hi110"/>Joan of Arc<br>
<input type="hidden" name="hi110" value="false">
<html:checkbox property="hi111"/>Helen Keller<br>
<input type="hidden" name="hi111" value="false">
<html:checkbox property="hi112"/>Florence Nightingale<br>
<input type="hidden" name="hi112" value="false">
<html:checkbox property="hi113"/>Pocahontas<br>
<input type="hidden" name="hi113" value="false">
<html:checkbox property="hi114"/>Someone else not named here<br>
<input type="hidden" name="hi114" value="false">
</td>
</tr>
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
</tr><tr>
<td><br><html:checkbox property="hi100"/>I like things from the old days<br>
<input type="hidden" name="hi100" value="false">
<br>I would like to go back in time to:<br>
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi115"/>old castles<br>
<input type="hidden" name="hi115" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi116"/>the dinosaurs<br>
<input type="hidden" name="hi116" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi117"/>the American Colonies<br>
<input type="hidden" name="hi117" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi118"/>ancient Greece, Rome or other place in Europe<br>
<input type="hidden" name="hi118" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi119"/>the American Civil War<br>
<input type="hidden" name="hi119" value="false">
<br>I would like to go back in time to meet the inventor of:<br>
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi120"/>the light bulb<br>
<input type="hidden" name="hi120" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi121"/>the wheel<br>
<input type="hidden" name="hi121" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi122"/>the telescope<br>
<input type="hidden" name="hi122" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi123"/>a musical instrument<br>
<input type="hidden" name="hi123" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi124"/>the car<br>
<input type="hidden" name="hi124" value="false">
&nbsp;&nbsp;&nbsp;<html:checkbox property="hi125"/>the airplane<br>
<input type="hidden" name="hi125" value="false">
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

