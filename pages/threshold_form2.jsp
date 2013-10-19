
<% String url = response.encodeURL("../../allCounts.do"); %>
<form action='<%= url %>'>
<h4>Threshold for Interests display: 
<%
  int th = Integer.parseInt((String) request.getAttribute("threshold"));
  for (int i = 2; i < 11; i+=2) {
    out.print("<input type=\"radio\" name=\"threshold\" value=\"" + i + "\" onclick=\"document.forms[0].submit()\"");
    if (th == i)
      out.print(" checked");
    out.println(">" + i + "0%");
  }
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
<form>

