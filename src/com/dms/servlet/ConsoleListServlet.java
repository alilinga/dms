package com.dms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;
import com.dms.service.ConsoleService;
import com.dms.service.DealerService;
import com.dms.service.impl.ConsoleServiceImpl;
import com.dms.service.impl.DealerServiceImpl;

/**
 * Servlet implementation class ConsoleListServlet
 */
public class ConsoleListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ConsoleService service = new ConsoleServiceImpl();
			List<Console1> list = service.findAll();
			request.setAttribute("consolelist", list);
			request.getRequestDispatcher("consolelist.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
