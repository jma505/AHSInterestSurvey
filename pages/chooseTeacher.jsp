<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<link rel="stylesheet" href="CSS/style1.css" type="text/css">

<script language="JavaScript">
  <!-- Hide from older browsers ...

  expireDate = new Date;
  expireDate.setMonth(expireDate.getMonth()+9);

  function setCookie() {
    document.cookie = "teacherId=" +
			document.chooseTeacherForm.teacherId.selectedIndex +
			";expires=" + expireDate.toGMTString();
  }

  function getCookie(cookieName) {
    thisCookie = document.cookie.split("; ");
    for (i = 0; i < thisCookie.length; i++) {
      if (cookieName == thisCookie[i].split("=")[0]) {
        return thisCookie[i].split("=")[1];
      }
    }
    return 0;
  }

  function teacherCheck(teacherField) {
    teacherChoice = teacherField.options[teacherField.selectedIndex].text;
    if ((teacherChoice.indexOf("(grade 1)", 0) > 0) || (teacherChoice.indexOf("(grade 2)", 0) > 0) || (teacherChoice.indexOf("(grade 0)", 0) > 0)) {
      for (i = 0; i < document.chooseTeacherForm.threshold.length; i++) {
        if (document.chooseTeacherForm.threshold[i].value == "1") {
          document.chooseTeacherForm.threshold[i].checked = true;
        }
      }
    }
  }

  -->
</script>

<html:errors/>
<logic:present name="teacherList">
<html:form action="/listByTeacher.do" focus="teacherId">
<fieldset>
<legend align="center"><b><big>Select Teacher and Type of List</big></b></legend>
<center>
<br>
<html:select property="teacherId" size="1" onblur="setCookie()" onclick="teacherCheck(this.form.teacherId)">
<html:options collection="teacherList" labelProperty="label" property="value"/>
</html:select>
<hr>
<table align="center" border="0"><tr><td align="center">
<html:radio property="display" value="student">Show Interests by Student</html:radio></td></tr><tr><td align="center">
<html:radio property="display" value="interest">Show Students by Interest</html:radio></td></tr><tr><td align="center">
<html:radio property="display" value="count">Show Counts by Interest</html:radio></td></tr>
<tr>
<td align="center"><hr>
Threshold for Interests display:<br>
<html:radio property="threshold" value="2" onclick="teacherCheck(this.form.teacherId)">20%</html:radio>
<html:radio property="threshold" value="4" onclick="teacherCheck(this.form.teacherId)">40%</html:radio>
<html:radio property="threshold" value="6" onclick="teacherCheck(this.form.teacherId)">60%</html:radio>
<html:radio property="threshold" value="8" onclick="teacherCheck(this.form.teacherId)">80%</html:radio>
<html:radio property="threshold" value="10" onclick="teacherCheck(this.form.teacherId)">100%</html:radio>
</td></tr>
</table>
<%--
<input type="checkbox" disabled name="search" value="1" onClick="javascript:if (this.checked) {document.forms[0].searchtext.focus();}" > Search for: </input>
<input type="text" disabled name="searchtext" value="" >
--%>
</center>
<br>
</fieldset>
<br>
<center>
<html:submit><bean:message key="button.submit"/></html:submit>
</center>
</html:form>
</logic:present>

<script language="JavaScript"
  <!--
  document.chooseTeacherForm.teacherId.selectedIndex = eval(getCookie("teacherId"));
  teacherCheck(document.chooseTeacherForm.teacherId);
  -->
</script>

