<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="o" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单列表页面</title>
<script type="text/javascript">
	function doDelete(onumber) {
		/*如果这里弹出的对话框，用户点击的是确定，就马上去请求servlet
		如何知道用户点击的是确定
		如何在js方法中请求servlet
		*/
		var flag=confirm("是否确定删除？");
		if (flag) {
			//表明点击了确定，请问servlet。在当前标签页上打开超链接
			//window.location.href="GoodsDeleteServlet?gnumber="+gnumber;
			location.href="OrdersDeleteServlet?onumber="+onumber;
		}
		
	}

</script>
</head>
<body>
<form method="post" action="OrdersSearchServlet">
  <table border="1" width="800">
  
  <tr>
  	<td colspan="9">
 	 	<a href="index.jsp">主页</a>
 	 	&nbsp;&nbsp;&nbsp;&nbsp;
  		按商品名称查询：<input type="text" name="gname">
  		按经销商名称查询：<input type="text" name="dname">
  		<input type="submit" value="查询">
  		&nbsp;&nbsp;&nbsp;&nbsp;
  		<a href="ordersadd.jsp">添加</a>
  	</td>
  </tr>
  
  <tr align="center">
	<td>订单序列号</td>
	<td>订单编号</td>
	<td>商品名称</td>
	<td>经销商名称</td>   
	<td>购买数量</td>
	<td>销售价格</td>
	<td>成交日期</td>
	<td>货物状态</td>
	<td>操作</td>
</tr>
  <o:forEach items="${orderslist }" var="orders">
  <tr align="center">
	<td>${orders.onumber }</td>
	<td>${orders.oid }</td>
	<td>${orders.gname }</td>
	<td>${orders.dname }</td>
	<td>${orders.oquantity }</td>
	<td>${orders.oprice }</td>
	<td>${orders.odata }</td>
	<td>${orders.ostate }</td>
	<td><a href="OrdersEditServlet?onumber=${orders.onumber }">更新</a>   <a href="#"onclick="doDelete(${orders.onumber})">删除</a></td>
</tr>
</o:forEach>
</table>
</form>
</body>
</html>