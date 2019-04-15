package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Goods;
import com.dms.domain.Orders;

public interface OrdersService {
	
	/**
	 * 查询所有订单
	 * @param lazy
	 * @return List<Orders>
	 * @throws SQLException
	 */
	List<Orders> findAll(Orders orders) throws SQLException; 

	/**
	 * 按订单序列号删除订单
	 * @param onumber
	 * @throws SQLException
	 */
	void deleteOrders(int onumber) throws SQLException;

	/**
	 * 插入订单
	 * @param orders
	 * @throws SQLException
	 */
	void insertOrders(Orders orders)  throws SQLException;

	/**
	 * 模糊查询
	 * @param gname
	 * @param dname
	 * @return
	 * @throws SQLException
	 */
	List<Orders> searchOrders(String gname,String dname) throws SQLException;

	/**
	 * 根据订单序列号查询单个订单对象
	 * @param onumber
	 * @return
	 */
	Orders findOrdersByOnumber(int onumber) throws SQLException;

	/**
	 * 根据订单序列号更新订单
	 * @param orders
	 * @throws SQLException
	 */
	void updateOrders(Orders orders) throws SQLException;
}
