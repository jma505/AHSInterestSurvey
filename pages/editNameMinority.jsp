<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Student Information</h4>
</center>
<html:form action="updateNameMinority.do" focus="studentFirstName">
<html:hidden property="id"/>
<html:hidden property="tid"/>
<fieldset>
<legend align="center"><b><big>STUDENT INFORMATION</big></b></legend>
<p>First Name<br>
<html:text property="firstName" size="30" maxlength="50"/>
</p>
<p>Last Name<br>
<html:text property="lastName" size="30" maxlength="50"/>
</p>
<p>Minority?&nbsp;&nbsp;&nbsp;
<html:checkbox property="minority"/>
</p>
<br>
</fieldset>
<br>
<center>
<html:submit><bean:message key="button.submit"/></html:submit>
<br><br>
<html:cancel><bean:message key="button.cancel"/></html:cancel>

</center>
</html:form>

<script language="JavaScript"
  <!--
  document.forms[0].teacherId.selectedIndex = eval(getCookie("teacherIdB"));
  -->
</script>

