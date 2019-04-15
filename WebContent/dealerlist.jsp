<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新商品页面</title>
<script type="text/javascript">
	function doDelete(dnumber) {
		/*如果这里弹出的对话框，用户点击的是确定，就马上去请求servlet
		如何知道用户点击的是确定
		如何在js方法中请求servlet
		*/
		var flag=confirm("是否确定删除？");
		if (flag) {
			//表明点击了确定，请问servlet。在当前标签页上打开超链接
			//location.href="DealerDeleteServlet?dnumber="+dnumber;
			location.href="DealerDeleteServlet?dnumber="+dnumber;
		}
		
	}

</script>
</head>
<body>
<form method="post" action="DealerSearchServlet">
<table border="1" width="700">

  <tr>
  	<td colspan="10">
  		按姓名查询：<input type="text" name="dname">
  		&nbsp;&nbsp;&nbsp;&nbsp;
  		按公司查询：<input type="text" name="dcompany">		
		&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" value="查询">
		&nbsp;&nbsp;&nbsp;&nbsp;
  		<a href="dealeradd.jsp">添加</a>
  	</td>
  </tr>

<tr align="center">
	<td>经销商序列号</td>
	<td>编号</td>
	<td>姓名</td>
	<td>性别</td>
	<td>密码</td>
	<td>手机号</td>
	<td>电子邮箱</td>
	<td>地址</td>
	<td>公司名称</td>
	<td>操作</td>
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
	<td><a href="DealerEditServlet?dnumber=${dealer.dnumber }">更新</a>   <a href="#"onclick="doDelete(${dealer.dnumber})">删除</a></td>
</d:forEach>
</table>
</form>
</body>
</html>