package com.dms.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import com.dms.domain.Goods;
import com.dms.domain.Orders;

public interface OrdersDao {

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
	 * @throws SQLException 
	 */
	Orders findOrdersByOnumber(int onumber) throws SQLException;

	/**
	 * ���ݶ������кŸ��¶���
	 * @param orders
	 * @throws SQLException
	 */
	void updateOrders(Orders orders) throws SQLException;
}
