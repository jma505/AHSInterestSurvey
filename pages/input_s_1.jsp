<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Page 2 of 4<br>
<em>Student = <bean:write name="entryForm2" property="studentFullName"/></em>
</h4>
</center>

<html:form action="addSmallEntry.do">
<html:hidden property="edit"/>
<html:hidden property="pageNumber" value="1"/>

<fieldset>
<legend align="center"><b><big>PAPER FORM PAGE 1</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td><br>
<html:checkbox property="an200"/>I like animals<br>
<html:checkbox property="an201"/>I like insects<br>
<html:checkbox property="an202"/>I like snakes<br>
<html:checkbox property="an203"/>I like birds<br>
<html:checkbox property="sc200"/>I like the stars and the planets<br>
<html:checkbox property="sc201"/>I like things that fly like planes or helicopters<br>
<html:checkbox property="sc202"/>I like rockets<br>
<html:checkbox property="sc203"/>I like volcanoes<br>
<html:checkbox property="sc204"/>I like electric things<br>
<html:checkbox property="at200"/>I like sports<br>
<br><em>Check only one favorite sport:</em><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="at201"/>Football<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="at202"/>Baseball<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="at203"/>Basketball<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="at204"/>Soccer<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="at205"/>Hockey<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:checkbox property="at206"/>Other<br>
<br>
<html:checkbox property="ch200"/>I like taking care of children that are younger than me<br>
<html:checkbox property="cl200"/>I am careful about the kinds of clothes I wear<br>
<html:checkbox property="co200"/>I like building things<br>
<html:checkbox property="cm200"/>I like winning a lot<br>
</td>
<td valign="top"><br>
<html:checkbox property="cr200"/>I like making things<br>
<html:checkbox property="fa200"/>I like drawing<br>
<html:checkbox property="fa201"/>I like painting<br>
<html:checkbox property="fo200"/>I like lots of different kinds of foods<br>
<html:checkbox property="ga200"/>I like to play games<br>
<html:checkbox property="hi200"/>I like things from the past<br>
<html:checkbox property="hi201"/>I am interested in people from the past<br>
<html:checkbox property="hi202"/>I like the time of castles and kings and queens<br>
<html:checkbox property="hi203"/>I like dinosaurs<br>
<html:checkbox property="sc205"/>I like inventing things<br>
<html:checkbox property="hu200"/>I like jokes or funny stories a lot<br>
<html:checkbox property="fl200"/>I can speak >100 words in a language other than English<br>
<html:checkbox property="fl201"/>I would like to learn another language<br>
<html:checkbox property="la200"/>I think rules are very important<br>
<html:checkbox property="la201"/>I try to get other people to obey the rules<br>
</td>
</tr>
</table>
<br>
</fieldset>
<br>

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

<script language="javascript">
  if (document.forms[0].edit.value=="true") {
    if (!confirm("WARNING! THIS STUDENT ALREADY EXISTS.\n\nClick OK to EDIT this student, or\nClick CANCEL to try again\n")) {
      document.forms[0].elements["org.apache.struts.taglib.html.CANCEL"].click();
    }
  }
</script>

</center>
</html:form>

