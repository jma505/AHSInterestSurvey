<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/x.tld" prefix="x" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>

<br>
<center>
<h4>Student successfully added or updated:</h4>
<br>
<div class="boxcolor40">
<br>
<c:import url="/XML/student_added.xsl" var="xslt">
</c:import>
<x:parse var="xml">
<jsp:getProperty name="Student" property="xml"/>
</x:parse>
<x:transform xml="${xml}" xslt="${xslt}">
</x:transform>

<br>
</div>
<br>
<%
  org.jmanderson.ahs.dataobjects.User user =
      (org.jmanderson.ahs.dataobjects.User) session.getAttribute("user");
  if (user.isStudent()) { %>
<html:form action="logoff.do">
<html:submit><bean:message key="button.submit"/></html:submit>
</html:form>
<% } else { %>
<html:form action="/homepage.do">
<html:submit><bean:message key="button.submit"/></html:submit>
</html:form>
<% } %>
</center>


