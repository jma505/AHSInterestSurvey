<% String url = response.encodeURL("../../listByTeacher.do"); %>

<form action="<%= url %>" method="post">
<input type="hidden" name="teacherId" value="<%= request.getAttribute("teacherId") %>">
<h4>
<%
  out.println("Threshold for Interests Display: ");
  int th = Integer.parseInt((String) request.getAttribute("thold"));
  for (int i = 2; i < 11; i+=2) {
    out.print("<input type=\"radio\" name=\"threshold\" value=\"" + i + "\" onclick=\"document.forms[0].submit()\"");
    if (th == i)
      out.print(" checked");
    out.println(">" + i + "0%");
  }
  out.println("<br>");
  String display = (String) request.getAttribute("display");
  out.print("<input type=\"radio\" name=\"display\" value=\"student\" onClick=\"document.forms[0].submit()\"");
  if (display.equals("student"))
    out.print(" checked");
  out.println(">Interests by Students ");
  out.print("<input type=\"radio\" name=\"display\" value=\"interest\" onClick=\"document.forms[0].submit()\"");
  if (display.equals("interest"))
    out.print(" checked");
  out.println(">Students by Interests ");
  out.print("<input type=\"radio\" name=\"display\" value=\"count\" onClick=\"document.forms[0].submit()\"");
  if (display.equals("count"))
    out.print(" checked");
  out.println(">Counts by Interests ");
  out.println("<br>");
  String minority = (String) request.getAttribute("minority");
  if (minority == null)
    minority = "both";
  out.print("<input type=\"radio\" style=\"display:none;\" name=\"minority\" value=\"yes\" onclick=\"document.forms[0].submit()\"");
  if (minority.equals("yes"))
    out.print(" checked><font size=\"+1\" color=\"red\"></font>  ");
  else 
    out.println(">");
  out.print("<input type=\"radio\" style=\"display:none;\" name=\"minority\" value=\"no\" onclick=\"document.forms[0].submit()\"");
  if (minority.equals("no"))
    out.print(" checked><font size=\"+1\" color=\"red\"></font>  ");
  else
    out.println(">");
  out.print("<input type=\"radio\" style=\"display:none;\" name=\"minority\" value=\"both\" onclick=\"document.forms[0].submit()\"");
  if (minority.equals("both"))
    out.print(" checked");
  out.println("><br>");
%>

</h4>
</form>

