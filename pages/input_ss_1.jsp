<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 1 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="edit"/>
<html:hidden property="pageNumber" value="1"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>ANIMALS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
<td colspan="2" align="left"><br><em>Select ONE Favorite Animal:</em></td>
</tr><tr>
<td><br>
<html:checkbox property="an100"/>I like most animals.<br>
<input type="hidden" name="an100" value="false">
<html:checkbox property="an101"/>I have a pet ...<br>
<input type="hidden" name="an101" value="false">
<html:checkbox property="an102"/>I take care of a pet.<br>
<input type="hidden" name="an102" value="false">
<html:checkbox property="an103"/>I only like a few animals.<br>
<input type="hidden" name="an103" value="false">
</td>
<td><br>
<html:checkbox property="an104"/>Cat<br>
<input type="hidden" name="an104" value="false">
<html:checkbox property="an105"/>Dog<br>
<input type="hidden" name="an105" value="false">
<html:checkbox property="an106"/>Rabbit<br>
<input type="hidden" name="an106" value="false">
<html:checkbox property="an107"/>Bird<br>
<input type="hidden" name="an107" value="false">
<html:checkbox property="an108"/>Fish<br>
<input type="hidden" name="an108" value="false">
</td><td><br>
<html:checkbox property="an109"/>Insect<br>
<input type="hidden" name="an109" value="false">
<html:checkbox property="an110"/>Reptile/Amphibian<br>
<input type="hidden" name="an110" value="false">
<html:checkbox property="an111"/>Horse<br>
<input type="hidden" name="an111" value="false">
<html:checkbox property="an112"/>Other<br>
<input type="hidden" name="an112" value="false">
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
</td></tr>
</table>

<script language="javascript">
  if (document.forms[0].edit.value=="true") {
    if (!confirm("WARNING! THIS STUDENT ALREADY EXISTS.\n\nClick OK to EDIT this student, or\nClick CANCEL to try again\n")) {
      document.forms[0].elements["org.apache.struts.taglib.html.CANCEL"].click();
    }
  }
</script>

</center>
</html:form>

