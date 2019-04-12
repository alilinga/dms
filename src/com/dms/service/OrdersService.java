package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Goods;
import com.dms.domain.Orders;

public interface OrdersService {
	List<Orders> findAll() throws SQLException;
}
