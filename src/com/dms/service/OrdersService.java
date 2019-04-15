package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Goods;
import com.dms.domain.Orders;

public interface OrdersService {
	
	/**
	 * ��ѯ���ж���
	 * @param lazy
	 * @return List<Orders>
	 * @throws SQLException
	 */
	List<Orders> findAll(Orders orders) throws SQLException; 

	/**
	 * ���������к�ɾ������
	 * @param onumber
	 * @throws SQLException
	 */
	void deleteOrders(int onumber) throws SQLException;

	/**
	 * ���붩��
	 * @param orders
	 * @throws SQLException
	 */
	void insertOrders(Orders orders)  throws SQLException;

	/**
	 * ģ����ѯ
	 * @param gname
	 * @param dname
	 * @return
	 * @throws SQLException
	 */
	List<Orders> searchOrders(String gname,String dname) throws SQLException;

	/**
	 * ���ݶ������кŲ�ѯ������������
	 * @param onumber
	 * @return
	 */
	Orders findOrdersByOnumber(int onumber) throws SQLException;

	/**
	 * ���ݶ������кŸ��¶���
	 * @param orders
	 * @throws SQLException
	 */
	void updateOrders(Orders orders) throws SQLException;
}
