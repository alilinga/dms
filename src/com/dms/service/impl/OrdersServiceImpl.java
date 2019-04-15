package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.GoodsDao;
import com.dms.dao.OrdersDao;
import com.dms.dao.impl.GoodsDaoImpl;
import com.dms.dao.impl.OrdersDaoImpl;
import com.dms.domain.Orders;
import com.dms.service.OrdersService;
import com.dms.util.JDBCUtil;

public class OrdersServiceImpl implements OrdersService {


	@Override
	public List<Orders> findAll(Orders orders) throws SQLException {
		OrdersDaoImpl dao = new OrdersDaoImpl();
		return dao.findAll(orders);
	}

	@Override
	public void deleteOrders(int onumber) throws SQLException {
		OrdersDao dao = new OrdersDaoImpl();
		dao.deleteOrders(onumber);
	}

	@Override
	public void insertOrders(Orders orders) throws SQLException {
		OrdersDao dao = new OrdersDaoImpl();
		dao.insertOrders(orders);
	}

	@Override
	public List<Orders> searchOrders(String gname, String dname) throws SQLException {
		OrdersDao dao = new OrdersDaoImpl();
		return dao.searchOrders(gname,dname);
	}

	@Override
	public Orders findOrdersByOnumber(int onumber) throws SQLException {
		OrdersDao dao = new OrdersDaoImpl();
		return dao.findOrdersByOnumber(onumber);
	}

	@Override
	public void updateOrders(Orders orders) throws SQLException {
		OrdersDao dao = new OrdersDaoImpl();
		dao.updateOrders(orders);	
	}

}
