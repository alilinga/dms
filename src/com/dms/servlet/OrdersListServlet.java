package com.dms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dms.domain.Goods;
import com.dms.domain.Orders;
import com.dms.service.GoodsService;
import com.dms.service.OrdersService;
import com.dms.service.impl.GoodsServiceImpl;
import com.dms.service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class OrdersListServlet
 */
public class OrdersListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			OrdersService service = new OrdersServiceImpl();
			List<Orders> list=service.findAll(null);
			request.setAttribute("orderslist", list);
			request.getRequestDispatcher("orderslist.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
