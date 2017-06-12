<%@ page language="java" import="java.util.*,beans.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>原生态JAVA生成报表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  		<form action="ShowReport" method="post">
  				<input type="submit" value="生成报表">
  		</form>
  			<table class="hovertable">
  					<tr >
  							<th colspan="5">利润表</th>
  					</tr>
  					<tr>
  						<th>序号</th>
  						<th>商品名称</th>
  						<th>卖出数量</th>
  						<th>交易笔数</th>
  						<th>盈利额</th>
  					</tr>
  					
  			<%
  				List list = null;
  				if(session.getAttribute("PROFIT")!=null){
  					
  					list = (List)session.getAttribute("PROFIT");
  					if(list.size()>0){
  						int temp = 0;
  						int temp1 = 0;
  						int temp2 = 0;
  						int temp3 = 0;
  						Profit pf;
  						for(int i =0;i < list.size();i++){
  							pf = new Profit();
  							pf = (Profit)list.get(i);
  							temp1+=pf.getTradingNum();
  							temp2+=pf.getTimes();
  							temp3+=pf.getProfit();
  							%>
  					<tr onmouseover="this.style.backgroundColor='#ffff66';"
  							onmouseout="this.style.backgroundColor='#d4e3e5';">
  						<td><%=temp+=1 %></td>
  						<td><%=pf.getGoodsName() %></td>
  						<td><%=pf.getTradingNum() %></td>
  						<td><%=pf.getTimes() %></td>
  						<td><%=pf. getProfit()%></td>
  					</tr>
  							<%
  						}%>
  						
					<tr onmouseover="this.style.backgroundColor='#ffff66';"
  							onmouseout="this.style.backgroundColor='#d4e3e5';">
  						<td colspan="2">合计</td>
  						<td><%=temp1 %></td>
  						<td><%=temp2 %></td>
  						<td><%=temp3 %></td>
  					</tr>
  						
  						<%
  					}
  				}
  				
  			 %>
  			</table>
  </body>
</html>
