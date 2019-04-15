<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>操作员列表页面</title>
<script type="text/javascript">
	function doDelete(cnumber) {
		/*如果这里弹出的对话框，用户点击的是确定，就马上去请求servlet
		如何知道用户点击的是确定
		如何在js方法中请求servlet
		*/
		var flag=confirm("是否确定删除？");
		if (flag) {
			//表明点击了确定，请问servlet。在当前标签页上打开超链接
			//location.href="ConsoleDeleteServlet?cnumber="+cnumber;
			location.href="ConsoleDeleteServlet?cnumber="+cnumber;
		}
		
	}

</script>
</head>

<body>
<form method="post" action="ConsoleSearchServlet">
  <table border="1" width="700">
  
  <tr>
  	<td colspan="10">
  		按姓名查询：<input type="text" name="cname">
  		<input type="submit" value="查询">
  		&nbsp;&nbsp;&nbsp;&nbsp;
  		<a href="consoleadd.jsp">添加</a>
  	</td>
  </tr>
  	
  <tr align="center">
	<td>操作员序列号</td>
	<td>编号</td>
	<td>姓名</td>
	<td>性别</td>
	<td>密码</td>
	<td>手机号</td>
	<td>公司名称</td>
	<td>操作</td>
  </tr>
  
  <c:forEach items="${consolelist }" var="console1">
  <tr align="center">
	<td>${console1.cnumber }</td>
	<td>${console1.cid }</td>
	<td>${console1.cname }</td>
	<td>${console1.csex }</td>
	<td>${console1.cpassword }</td>
	<td>${console1.ctel }</td>
	<td>${console1.ccompany }</td>
	<td><a href="ConsoleEditServlet?cnumber=${console1.cnumber }">更新</a>   <a href="#"onclick="doDelete(${console1.cnumber})">删除</a></td>
  </c:forEach>
</table>
</form>
</body>
</html>