<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="g" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表页面</title>

<script type="text/javascript">
	function doDelete(gnumber) {
		/*如果这里弹出的对话框，用户点击的是确定，就马上去请求servlet
		如何知道用户点击的是确定
		如何在js方法中请求servlet
		*/
		var flag=confirm("是否确定删除？");
		if (flag) {
			//表明点击了确定，请问servlet。在当前标签页上打开超链接
			//window.location.href="GoodsDeleteServlet?gnumber="+gnumber;
			location.href="GoodsDeleteServlet?gnumber="+gnumber;
		}
		
	}

</script>

</head>
<body>
<form method="post" action="GoodsSearchServlet">
  <table border="1" width="800">
  
  <tr> 
  	<td colspan="10">
  
  		按商品名称查询：<input type="text" name="gname">
  		
  		商品价格：<input type="text" name="gprice1">-<input type="text" name="gprice2">	
		
				<input type="submit" value="查询">
  		<a href="ordersadd.jsp">添加</a>
  	</td>
  </tr>
  
  <tr align="center">
	<td>商品序列号</td>
	<td>编号</td>
	<td>名称</td>
	<td>类型</td>
	<td>价格</td>
	<td>操作</td>
  </tr>
  
  <g:forEach items="${goodslist }" var="goods">
  <tr align="center">
	<td>${goods.gnumber }</td>
	<td>${goods.gid }</td>
	<td>${goods.gname }</td>
	<td>${goods.gtype }</td>
	<td>${goods.gprice }</td>
	<td><a href="GoodsEditServlet?gnumber=${goods.gnumber }">更新</a>   <a href="#"onclick="doDelete(${goods.gnumber})">删除</a></td>
  </tr>
  </g:forEach> 
  </table>
</form>  
</body>
</html>