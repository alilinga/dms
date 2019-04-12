package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Orders;
import com.dms.service.OrdersService;
import com.dms.util.JDBCUtil;

public class OrdersServiceImpl implements OrdersService {

	@Override
	public List<Orders> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from orders", new BeanListHandler<Orders>(Orders.class));

	}

}
