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
<html:form action="addBigEntry.do" focus="studentFirstName">
<html:hidden property="pageNumber" value="0"/>
<center><h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>STUDENT INFORMATION</big></b></legend>
<p>First Name<br>
<html:text property="studentFirstName" size="30" maxlength="50"/>
</p>
<p>Last Name<br>
<html:text property="studentLastName" size="30" maxlength="50"/>
</p>
<p>Teacher<br>
<html:select property="teacherId" size="1" onblur="setCookie()">
<html:options collection="teacherListBig" labelProperty="label" property="value"/>
</html:select>
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

