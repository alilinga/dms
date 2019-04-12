<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>操作员列表页面</title>
</head>
<body>
  <table border="1" width="700">
  <tr align="center">
	<td>C序列号</td>
	<td>编号</td>
	<td>姓名</td>
	<td>性别</td>
	<td>密码</td>
	<td>手机号</td>
	<td>公司名称</td>
</tr>
  <c:forEach items="${consolelist }" var="console">
  <tr align="center">
	<td>${console.cnumber }</td>
	<td>${console.cid }</td>
	<td>${console.cname }</td>
	<td>${console.csex }</td>
	<td>${console.cpassword }</td>
	<td>${console.ctel }</td>
	<td>${console.ccompany }</td>
</tr>
  </c:forEach>
</table>
</body>
</html>