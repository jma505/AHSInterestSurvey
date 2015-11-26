<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>


<html:html locale="true">
<head>
<title>Entire School Listing (Interests)</title>
<html:base/>
<link rel="stylesheet" href="CSS/style1.css" type="text/css">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
</head>
<body>
<br>
<center>
<h3>Counts by Interest (Entire School - <%= request.getAttribute("count") %> Students)</h3>

<%@ include file="/pages/threshold_form2.jsp" %>

<div id='container' class="boxcolor" style="min-width: 310px; height: 100px; margin: 0 auto"></div>
<div>
<table id='datatable' border="0" cellspacing="5" cellpadding="1" align="center">
<thead><tr>
  <th></th>
  <th>Percentage of Students</th>
</tr></thead><tbody>
<%
  int total = Integer.parseInt((String) request.getAttribute("count"));
  java.util.Vector v = (java.util.Vector) request.getAttribute("interests");
  StringBuffer sb = new StringBuffer();
  for (int i = 0; i < v.size(); i++) {
    org.jmanderson.ahs.dataobjects.MiniInterestBean interest = (org.jmanderson.ahs.dataobjects.MiniInterestBean) v.get(i);
    request.setAttribute("interest", interest);
%>
<tr><td valign="top">
<%
  sb.delete(0, sb.length());
  sb.append("../../interestDetails.do?threshold=").append(th);
  sb.append("&topicId=").append(interest.getTopicId());
  sb.append("&minority=").append(minority);
  url = response.encodeURL(sb.toString());
  out.print("<a href=\"");
  out.print(url);
  out.println("\">");
%>
<%= interest.getInterestName() %>
</a>
</td><td>
<%
  out.println((interest.getCount() * 100) / total);
%>
</td></tr>
<%
  }
%>
</tbody></table>
</div>
</center>
<script>
$(function () {
	$('#container').css('height',200+(($('#datatable > tbody > tr').length)*40));
    $('#container').highcharts({
        data: {
            table: 'datatable'
        },
        chart: {
            type: 'bar'
        },
        title: {
        	text: 'Percentage of Students by Interest'
        },
        yAxis: {
            title: {
                text: ''
            },
            min: 0,
            max: 100
        },
        xAxis: {
            type: 'category'
        }
    });
});
</script>


</body>
</html:html>

