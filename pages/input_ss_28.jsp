<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 28 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="28"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>SCIENCE</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td colspan="2" align="left"><br><em>I am interested in:</em><br>
<i>(<bean:message key="check.three"/>)</i></td>
</tr><tr><td>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc100"/>insects (bugs)<br>
<input type="hidden" name="sc100" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc101"/>furry animals<br>
<input type="hidden" name="sc101" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc102"/>reptiles<br>
<input type="hidden" name="sc102" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc103"/>sea creatures<br>
<input type="hidden" name="sc103" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc104"/>birds<br>
<input type="hidden" name="sc104" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc105"/>humans<br>
<input type="hidden" name="sc105" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc106"/>the earth<br>
<input type="hidden" name="sc106" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc107"/>the sky<br>
<input type="hidden" name="sc107" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc108"/>the stars or planets<br>
<input type="hidden" name="sc108" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc109"/>gravity<br>
<input type="hidden" name="sc109" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc110"/>flight<br>
<input type="hidden" name="sc110" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc111"/>chemicals<br>
<input type="hidden" name="sc111" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc112"/>mixtures of things that make other things<br>
<input type="hidden" name="sc112" value="false">
</td><td><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc113"/>what things are made out of<br>
<input type="hidden" name="sc113" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc114"/>light<br>
<input type="hidden" name="sc114" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc115"/>motion<br>
<input type="hidden" name="sc115" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc116"/>mechanics<br>
<input type="hidden" name="sc116" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc117"/>goopy things (like Gak or Silly Putty)<br>
<input type="hidden" name="sc117" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc118"/>rockets<br>
<input type="hidden" name="sc108" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc119"/>rocks<br>
<input type="hidden" name="sc119" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc120"/>volcanoes<br>
<input type="hidden" name="sc120" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc121"/>earthquakes<br>
<input type="hidden" name="sc121" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc122"/>sounds<br>
<input type="hidden" name="sc122" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc123"/>oceans<br>
<input type="hidden" name="sc123" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc124"/>water<br>
<input type="hidden" name="sc124" value="false">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="sc125"/>electrical things<br>
<input type="hidden" name="sc125" value="false">
<td><br>
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

