package com.dms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dms.dao.DealerDao;
import com.dms.dao.impl.DealerDaoImpl;
import com.dms.domain.Dealer;
import com.dms.service.DealerService;
import com.dms.service.impl.DealerServiceImpl;

/**
 * Servlet implementation class DealerListServletDealerListServletDealerListServlet
 */
public class DealerListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			DealerService service = new DealerServiceImpl();
			List<Dealer> list=service.findAll();
			
			request.setAttribute("dealerlist", list);
			request.getRequestDispatcher("dealerlist.jsp").forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
