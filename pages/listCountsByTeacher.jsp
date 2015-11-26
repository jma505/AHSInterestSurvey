<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:base/>
<link rel="stylesheet" href="CSS/style1.css" type="text/css">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>


<br>
<center>
<h3><%= request.getAttribute("teacher") %> (Grade <%= request.getAttribute("grade") %> - <%= request.getAttribute("count") %> Students)</h3>

<%@ include file="/pages/threshold_form.jsp" %>

<div id='container' class="boxcolor" style="min-width: 310px; height: 100px; margin: 0 auto"></div>
<div>
<table id='datatable' border="0" cellspacing="5" cellpadding="1" style="position: absolute; left: -9999em">
<thead><tr>
  <th></th>
  <th>Percentage of Class</th>
</tr></thead><tbody>
<%
  int total = Integer.parseInt((String) request.getAttribute("count"));
  java.util.Vector v = (java.util.Vector) request.getAttribute("interests");
  for (int i = 0; i < v.size(); i++) {
    org.jmanderson.ahs.dataobjects.InterestBean interest = (org.jmanderson.ahs.dataobjects.InterestBean) v.get(i);
    request.setAttribute("interest", interest);
%>
<tr><td>

<%= interest.getInterestName() %>
</td><td><%
  out.println((interest.getCount() * 100) / total);
%>
</td></tr>
<%
  }
%>
</tbody></table>
</div>
<br>
<h4><html:link action="/chooseTeacher.do">Choose another Teacher</html:link></h4>
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

