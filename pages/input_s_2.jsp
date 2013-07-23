<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Page 3 of 4<br>
<em>Student = <bean:write name="entryForm2" property="studentFullName"/></em>
</h4>
</center>

<html:form action="addSmallEntry.do">
<html:hidden property="pageNumber" value="2"/>

<fieldset>
<legend align="center"><b><big>PAPER FORM PAGE 2</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr><br>
<td colspan="2" align="left"><br><em>Check all that apply:</em></td>
</tr><tr>
<td><br>
<html:checkbox property="ss200"/>My favorite subject in school is Math<br>
<html:checkbox property="ss201"/>My favorite thing in school is Reading<br>
<html:checkbox property="ss202"/>My favorite thing in school is Writing<br>
<html:checkbox property="ss203"/>My favorite thing in school is Science<br>
</td><td><br>
<html:checkbox property="ss204"/>My favorite thing in school is Social Studies<br>
<html:checkbox property="ss205"/>My favorite thing in school is Gym<br>
<html:checkbox property="ss206"/>My favorite thing in school is Art<br>
<html:checkbox property="ss207"/>My favorite thing in school is Music<br>
</td></tr></table>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td colspan="3" align="left"><br><em>Check one Favorite TV Show Type:</em></td></tr>
<tr><td><br>
<html:checkbox property="me200"/>Music<br>
<html:checkbox property="me201"/>Sports<br>
<html:checkbox property="me202"/>News<br>
<html:checkbox property="me203"/>Cartoons<br>
<html:checkbox property="me204"/>Drama<br>
</td><td>
<html:checkbox property="me205"/>Comedy<br>
<html:checkbox property="me206"/>Mystery<br>
<html:checkbox property="me207"/>History<br>
<html:checkbox property="me208"/>Soap Operas<br>
<html:checkbox property="me209"/>How-To<br>
</td><td>
<html:checkbox property="me210"/>Action<br>
<html:checkbox property="me211"/>Sci-Fi<br>
<html:checkbox property="me212"/>Western<br>
<html:checkbox property="me213"/>Factual<br>
<html:checkbox property="me214"/>Game Shows<br>
</td></tr><tr>
<td colspan="3" align="left"><br><em>Check one Favorite Radio Show Type:</em></td></tr>
<tr><td><br>
<html:checkbox property="me215"/>Pop<br>
<html:checkbox property="me216"/>Rock<br>
<html:checkbox property="me217"/>News<br>
</td><td>
<html:checkbox property="me218"/>Classical<br>
<html:checkbox property="me219"/>Jazz<br>
<html:checkbox property="me220"/>Rap<br>
</td><td>
<html:checkbox property="me221"/>Hip Hop<br>
<html:checkbox property="me222"/>Talk Show<br>
</td></tr><tr>
<td colspan="3" align="left"><br><em>Check one Favorite Movie Type:</em></td></tr>
<tr><td><br>
<html:checkbox property="me223"/>Comedy<br>
<html:checkbox property="me224"/>Drama<br>
<html:checkbox property="me225"/>Action<br>
</td><td>
<html:checkbox property="me226"/>Family<br>
<html:checkbox property="me227"/>Horror<br>
<html:checkbox property="me228"/>Sci-Fi<br>
</td><td>
<html:checkbox property="me229"/>Classic<br>
<html:checkbox property="me230"/>Childrens<br>
<html:checkbox property="me231"/>Musical<br>
</td></tr></table>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td colspan="2" align="left"><br><em>Check one Favorite Kind of Music:</em></td></tr>
<tr><td><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu200"/>Jazz<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu201"/>Classical<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu202"/>Pop<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu203"/>Hip Hop<br>
</td><td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu204"/>Rap<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu205"/>Rock and Roll<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="mu206"/>Another kind that isn't listed here<br>
</td>
</tr>
<tr><td colspan="2" align="left"><br><em>Check all that apply:</em><br></td></tr>
<tr><td><br>
<html:checkbox property="mu207"/>I like to sing<br>
<html:checkbox property="mu208"/>I play an instrument<br>
<html:checkbox property="mu209"/>I would like to learn how to play an instrument<br>
<html:checkbox property="na200"/>I like things in nature like plants and animals<br>
<html:checkbox property="na201"/>I like things in the ocean like plants and sea animals<br>
<html:checkbox property="pa200"/>I like to dance<br>
<html:checkbox property="pa201"/>I take dance lessons<br>
</td><td>
<html:checkbox property="pa202"/>I like to act on stage<br>
<html:checkbox property="pa203"/>I have been in plays on stage<br>
<html:checkbox property="po200"/>I would like to be the person in charge of a town or city or state or government<br>
<html:checkbox property="po201"/>I think voting is important<br>
<html:checkbox property="md200"/>I am interested in doctors, nurses, or other medical things<br>
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

