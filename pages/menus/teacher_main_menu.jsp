<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<script language="javascript">
function openwin(win, winname) {
  window.open(win, winname, config='toolbar=0,menubar=0,location=0,scrollbars=1,status=0');
}
</script>

<% org.jmanderson.ahs.dataobjects.User user = 
      (org.jmanderson.ahs.dataobjects.User) session.getAttribute("user");
%>

<i>
Home Page<br>
<hr>
<% if (user.isView()) { %>
<span title="Choose a Teacher's Class to View">
<html:link action="/chooseTeacher.do">Choose a Teacher's Class</html:link></span><br>
<hr>
<% } %>
<% if (user.isViewAll()) { %>
<span title="View Interests for the entire school">
<html:link action="/allCounts.do?threshold=4">View All Interests</html:link></span><br>
<hr>
<% } %>
<% if (user.isDataEntry()) { %>
<span title="Enter Data for a Student in the lower grades">
<html:link action="/addSmallEntry.do?newstudent=true">Enter New Student</html:link></span><br>
<hr>
<% } %>
<span title="Logoff">
<html:link action="/logoff.do">Logoff</html:link></span><br>
</i>
