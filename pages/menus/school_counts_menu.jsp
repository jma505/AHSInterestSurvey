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
<span title="Return to the Application's Home Page">
<html:link action="/homepage.do">Home Page</html:link></span><br>
<hr>
<% if (user.isView()) { %>
<span title="Choose a Teacher's Class to View">
<html:link action="/chooseTeacher.do">Choose a Teacher's Class</html:link></span><br>
<hr>
<% } %>
View All Interests<br>
<hr>
<span title="Logoff">
<html:link action="/logoff.do">Logoff</html:link></span><br>
<%--
<span title="Display information about the organists, including how to contact them">
<html:link action="/organistInfo.do">Organist Info</html:link></span><br>
<hr>
<span title="Display information about organists who are available for Weddings and Funerals">
<html:link action="/organistInfo.do?type=wf">Organists for Weddings and Funerals</html:link></span><br>
<hr>
<span title="Open a new window describing the latest site updates">
<html:link href="javascript:openwin('pages/news.jsp', 'news');">News (updated 07/29/04)</html:link>
</span><br>
<hr>
<span title="Open a new window with Help text">
<html:link href="javascript:openwin('pages/help/public_help.jsp', 'help');">Help</html:link>
</span><br>
<hr>
<span title="Open a new email message to the WebMaster">
<html:link href="mailto:john.anderson@bigfoot.com">Contact the Webmaster</html:link>
</span><br>
<hr>
<span title="Login for organists to maintain their schedule information">
<html:link forward="login">Login</html:link></span><br>
--%>
</i>
