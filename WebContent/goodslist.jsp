<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="g" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表页面</title>
</head>
<body>

  <table border="1" width="700">
  
  <tr>
  	<td>
  		<a href="goodsadd.jsp">添加</a>
  	</td>
  </tr>
  
  <tr align="center">
	<td>gnumber</td>
	<td>gid</td>
	<td>gname</td>
	<td>gtype</td>
	<td>gprice</td>
  </tr>
  
  <g:forEach items="${goodslist }" var="goods">
  <tr align="center">
	<td>${goods.gnumber }</td>
	<td>${goods.gid }</td>
	<td>${goods.gname }</td>
	<td>${goods.gtype }</td>
	<td>${goods.gprice }</td>
  </tr>
  </g:forEach>
  
  </table>
</body>
</html>