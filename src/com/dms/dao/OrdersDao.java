package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Goods;
import com.dms.domain.Orders;

public interface OrdersDao {

	List<Orders> findAll() throws SQLException;
}
