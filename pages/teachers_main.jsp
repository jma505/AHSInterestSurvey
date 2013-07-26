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
  "\"Choose a Teacher's Class to View\" allows you to select one teacher's students to view, sorted either by Student or by Interest.",
  "Select \"View Interests for the Entire School\" to see counts and a histogram for all Interests in the entire school.",
  "\"Enter Data for a Student in the lower grades\" brings you to a new for use when transcribing from the paper form into this application.",
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
<br><br>
<form name=tickform>
<textarea name=tickfield rows=4 cols=70 style="background-color: rgb(0,85,102); color: rgb(255,255,255); cursor: default; font-family: Arial; font-size: 16px;" wrap=virtual></textarea>
</form>
</center>

