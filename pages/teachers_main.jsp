<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<script language="JavaScript">
<!-- Hide from older browsers ...

var max = 0;
function textlist() {
  max = textlist.arguments.length;
  for (i = 0; i < max; i++)
    this[i] = textlist.arguments[i];
}
tl = new textlist(
  "Welcome to the Academy Hill School Interest Survey Application!",
  "Depending on your Security Rights, you may not see all of the menu options described here.",
  "Menu Options appear on the left side of most pages.  Resting the mouse cursor (hovering) on an active option will cause a description of that option to appear.",
  "\"Home Page\" brings you back to this page.",
  <%--
  "\"Add New Entry\" brings you to a new Interest-A-Lyzer form.  The form is different depending on the student's grade.  (If you are a Teacher, you can only enter your own students' information.  If you are a G/T Administrator, you can enter students for any teacher.)",
  --%>
  "\"Choose a Teacher's Class\" allows you to select one teacher's students to view, sorted either by Student or by Interest.",
  "Select \"View All Interests\" to see counts and a histogram for all Interests in the entire school.",
  "\"Logoff\" ends this application.",
  "On the Interests displays, \"Threshold for Interests\" is the cutoff for displaying Interest categories.  The percentages relate to the extent of a student's interest in that category.  For example, the default of \"40%\" displays only those students who obtained at least 40% of the possible points for that category.",
  "A new option on the Interests displays allows you to restrict the output to only Minorities or only non-Minorities.  The default is to display all students regardless of their race.",
  "Anything underlined can be clicked on for a new display page.  For example, from \"View All Interests\" you can click on an Interest category to see all students in that category, then click on a single student for that person's details.",
  "From a class list, \"Edit Names and Minorities\" allows you to update the Minority indicator for a student, as well as to correct the student's name."
);

var x = 0; pos = 0;
var l = tl[0].length;
function textticker() {
  document.tickform.tickfield.value = tl[x].substring(0, pos) + "_";
  if (pos++ == l) {
    pos = 0;
    setTimeout("textticker()", 3000);
    if (++x == max)
      x = 0;
    l = tl[x].length;
  } else
    setTimeout("textticker()", 30);
}

  -->
</script>

<body onLoad="textticker()">
<center>
<br>
<logic:present name="lastStudent">
<em>Last student entered was:<br>
<xsl:apply xsl="XML/laststudent.xsl">
<jsp:getProperty name="lastStudent" property="xml"/>
</xsl:apply>
</em></logic:present>
<br>
Your security rights are: <em><jsp:getProperty name="user" property="security"/></em><br>
<%--
<% org.jmanderson.ahs.dataobjects.User user =
	(org.jmanderson.ahs.dataobjects.User) session.getAttribute("user");
   if (user.isTeacherView()) { %>
You are logged in as: <em>
<% java.util.ArrayList list = 
	(java.util.ArrayList) application.getAttribute("teacherList");
   org.jmanderson.ahs.TeacherListBean tlb;
   int ut = user.getUserTeacher();
   for (int i = 0; i < list.size(); i++) {
     tlb = (org.jmanderson.ahs.TeacherListBean) list.get(i);
     if (tlb.getValue() == ut)
       out.print(tlb.getLabel());
   }
%>
     </em><br>
<% } %>
<% if (user.isDataEntry()) {
     if (user.isTeacherEdit()) { %>
<html:link href="addMyEntry.do" target="_self"><h4>Add new Entry</h4>
</html:link>
<% } else { %>
<html:link href="addSmallEntry.do?newstudent=newstudent" target="_self"><h4>Add new Entry (grades 1-2)</h4>
</html:link>
<html:link href="addBigEntry.do?newstudent=newstudent" target="_self"><h4>Add new Entry (grades 3-5)</h4>
</html:link>
<% } }
   if (user.isTeacherView()) { %>
<html:link href="chooseDisplay.jsp" target="_self"><h4>Display My Students</h4>
</html:link>
<% }
   if (user.isViewAll()) { %>
<html:link href="chooseTeacher.jsp" target="_self"><h4>Display a Teacher's Students</h4>
</html:link>
<html:link href="allCounts.do?threshold=2" target="_self"><h4>View All Interests</h4>
</html:link>
<% } %>
--%>

<br><br>
<form name=tickform>
<textarea name=tickfield rows=4 cols=70 style="background-color: rgb(40,60,120); color: rgb(255,255,255); cursor: default; font-family: Arial; font-size: 16px;" wrap=virtual></textarea>
</form>
</center>

