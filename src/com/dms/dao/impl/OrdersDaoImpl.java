package com.dms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.OrdersDao;
import com.dms.domain.Goods;
import com.dms.domain.Orders;
import com.dms.util.JDBCUtil;

public class OrdersDaoImpl implements OrdersDao {

	@Override
	public List<Orders> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from orders", new BeanListHandler<Orders>(Orders.class));

	}

}
