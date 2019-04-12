<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>经销商列表页面</title>
</head>
<body>

<table border="1" width="700">
<tr align="center">
	<td>D序列号</td>
	<td>编号</td>
	<td>姓名</td>
	<td>性别</td>
	<td>密码</td>
	<td>手机号</td>
	<td>电子邮箱</td>
	<td>地址</td>
	<td>公司名称</td>
</tr>
  <d:forEach items="${dealerlist }" var="dealer">
  <tr align="center">
	<td>${dealer.dnumber }</td>
	<td>${dealer.did }</td>
	<td>${dealer.dname }</td>
	<td>${dealer.dsex }</td>
	<td>${dealer.dpassword }</td>
	<td>${dealer.dtel }</td>
	<td>${dealer.demail }</td>
	<td>${dealer.daddress }</td>
	<td>${dealer.dcompany }</td>
</d:forEach>
</table>

</body>
</html>