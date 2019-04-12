<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="g" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单列表页面</title>
</head>
<body>
  <table border="1" width="800">
  <tr align="center">
	<td>O序列号</td>
	<td>订单编号</td>
	<td>G序列号</td>
	<td>D序列号</td>   
	<td>购买数量</td>
	<td>销售价格</td>
	<td>成交日期</td>
	<td>货物状态</td>
	
</tr>
  <g:forEach items="${orderslist }" var="orders">
  <tr align="center">
	<td>${orders.onumber }</td>
	<td>${orders.oid }</td>
	<td>${orders.gnumber }</td>
	<td>${orders.dnumber }</td>
	<td>${orders.oquantity }</td>
	<td>${orders.oprice }</td>
	<td>${orders.odata }</td>
	<td>${orders.ostate }</td>
</tr>
</g:forEach>
</table>

</body>
</html>