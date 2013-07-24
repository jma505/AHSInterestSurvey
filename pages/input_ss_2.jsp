<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<logic:messagesPresent>
<font color="red"><UL>
<html:errors/>
</UL></font>
</logic:messagesPresent>

<center>
<h4>Question 2 of 35</h4>
</center>
<html:form action="addBigEntry.do">
<html:hidden property="pageNumber" value="2"/>
<center>
<jsp:include page="/pages/question_page.jsp"/>
<h4><i>
<bean:message key="back.warning"/>
</i></h4></center>
<fieldset>
<legend align="center"><b><big>ATHLETICS / SPORTS</big></b></legend>
<table align="center" border="0" cellpadding="0" cellspacing="0" width="640">
<tr>
<td align="left"><br><em><bean:message key="check.all"/></em></td>
<td colspan="2" align="left"><em>My favorite Sports are:<br></em>
<i>(<bean:message key="check.two"/>)</i></td>
</tr><tr>
<td>
<html:checkbox property="at100"/>I like to watch sports.<br>
<input type="hidden" name="at100" value="false">
<html:checkbox property="at101"/>I play a sport.<br>
<input type="hidden" name="at101" value="false">
<html:checkbox property="at108"/>I like running, jumping, skipping, hopping<br>
<input type="hidden" name="at108" value="false">
<html:checkbox property="at109"/>I like roller blading, ice skating, roller skating<br>
<input type="hidden" name="at109" value="false">
</td>
<td>
<br>
<html:checkbox property="at102"/>Football<br>
<input type="hidden" name="at102" value="false">
<html:checkbox property="at103"/>Baseball<br>
<input type="hidden" name="at103" value="false">
<html:checkbox property="at104"/>Basketball<br>
<input type="hidden" name="at104" value="false">
<html:checkbox property="at110"/>Golf<br>
<input type="hidden" name="at110" value="false">
<html:checkbox property="at111"/>Bowling<br>
<input type="hidden" name="at111" value="false">
</td><td><br>
<html:checkbox property="at105"/>Soccer<br>
<input type="hidden" name="at105" value="false">
<html:checkbox property="at106"/>Hockey<br>
<input type="hidden" name="at106" value="false">
<html:checkbox property="at112"/>Volleyball<br>
<input type="hidden" name="at112" value="false">
<html:checkbox property="at113"/>Tennis<br>
<input type="hidden" name="at113" value="false">
<html:checkbox property="at107"/>Other<br>
<input type="hidden" name="at107" value="false">
</td>
</tr>
</table>
</p>
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

