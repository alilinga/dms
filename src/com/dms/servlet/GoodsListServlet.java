package com.dms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dms.domain.Goods;
import com.dms.service.GoodsService;
import com.dms.service.impl.GoodsServiceImpl;



/**
 * 负责查询所有学生信息显示到页面上
 */
public class GoodsListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {
			GoodsService service = new GoodsServiceImpl();
			List<Goods> list = service.findAll();
			
			request.setAttribute("goodslist", list);
			request.getRequestDispatcher("goodslist.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
