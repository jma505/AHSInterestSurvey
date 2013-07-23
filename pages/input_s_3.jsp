<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Page 4 of 4<br>
<em>Student = <bean:write name="entryForm2" property="studentFullName"/></em>
</h4>
</center>

<html:form action="addSmallEntry.do">
<html:hidden property="pageNumber" value="3"/>

<fieldset>
<legend align="center"><b><big>PAPER FORM PAGE 3</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><br>
<td colspan="2" align="left"><br><em>Check all that apply:</em></td></tr>
<tr><td><br>
<html:checkbox property="ps200"/>I like to do puzzles<br>
<html:checkbox property="ps201"/>I like to take things apart<br>
<html:checkbox property="ps202"/>I like to put things together<br>
<html:checkbox property="ps203"/>I like to find out what things are made out of<br>
<html:checkbox property="ps204"/>I like to find out how things work<br>
<html:checkbox property="ps205"/>I like to think about things until I figure them out<br>
<html:checkbox property="re200"/>I like to read<br>
</td>
<td><br>
<html:checkbox property="rl200"/>My friends are very important to me<br>
<html:checkbox property="rl201"/>My family is very important to me<br>
<html:checkbox property="rl202"/>My teachers are very important to me<br>
<html:checkbox property="rl203"/>There are other people that are very important to me<br>
<html:checkbox property="sa200"/>I like to take care of other people<br>
<html:checkbox property="sa201"/>I like to help people<br>
<html:checkbox property="sa202"/>I like <b>things</b> better than people<br>
</td></tr></table>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><td colspan="3" align="left"><br><em>Check no more than 3 Favorite Kinds of Toys:</em></td></tr>
<tr><td><br>
<html:checkbox property="to200"/>Stuffed animals<br>
<html:checkbox property="to201"/>Action figures<br>
<html:checkbox property="to202"/>Dolls<br>
<html:checkbox property="to203"/>Electronic games<br>
<html:checkbox property="to204"/>Video games<br>
<html:checkbox property="to205"/>Computer games<br>
<html:checkbox property="to206"/>Board games<br>
</td><td>
<html:checkbox property="to207"/>Hoola Hoops<br>
<html:checkbox property="to208"/>Skip it<br>
<html:checkbox property="to209"/>Jump rope<br>
<html:checkbox property="to210"/>Balls<br>
<html:checkbox property="to211"/>Sports stuff<br>
<html:checkbox property="to212"/>Dress up clothes<br>
<html:checkbox property="to213"/>Puppets<br>
</td><td>
<html:checkbox property="to214"/>Bike<br>
<html:checkbox property="to215"/>Scooter<br>
<html:checkbox property="to216"/>Rollerblades<br>
<html:checkbox property="to217"/>Sidewalk chalk<br>
<html:checkbox property="to218"/>Gooey things<br>
<html:checkbox property="to219"/>Electronic friends like Furbie or Poochie<br>
</td>
</tr></table>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><td colspan="2" align="left"><br><em>Check all that apply:</em></td></tr>
<tr><td><br>
<html:checkbox property="te200"/>I like using the computer<br>
<html:checkbox property="tr200"/>I like to travel to new places<br>
<html:checkbox property="ve200"/>I like bikes a lot<br>
<html:checkbox property="ve201"/>I like motorcycles a lot<br>
<html:checkbox property="ve202"/>I like cars a lot<br>
<html:checkbox property="ve203"/>I like trucks a lot<br>
<html:checkbox property="ve204"/>I like trains a lot<br>
<html:checkbox property="ve205"/>I like buses a lot<br>
</td><td>
<html:checkbox property="ve206"/>I like airplanes a lot<br>
<html:checkbox property="ve207"/>I like boats a lot<br>
<html:checkbox property="we200"/>I like it when it rains<br>
<html:checkbox property="we201"/>I like it when it snows<br>
<html:checkbox property="we202"/>I like to watch clouds<br>
<html:checkbox property="wr200"/>I like poems<br>
<html:checkbox property="wr201"/>I like writing stories<br>
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

