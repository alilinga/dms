package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Dealer;

/**
 * ��Ծ����̵����ݷ���
 */
public interface DealerDao {

	/**
	 * ��ѯ���о�����
	 * @return List<Dealer>
	 * @throws SQLException
	 */
	List<Dealer> findAll() throws SQLException;
	
	/**
	 * ���ݾ��������кŲ�ѯ������Ʒ����
	 * @param dnumber
	 * @return Dealer
	 * @throws SQLException
	 */
	Dealer findDealerByDnumber(int dnumber) throws SQLException;		
	
	/**
	 * ���뾭����
	 * @param dealer
	 * @throws SQLException
	 */
	void insertDealer(Dealer dealer) throws SQLException;
	
	/**
	 * ���ݾ��������к�ɾ����Ʒ
	 * @param dnumber
	 * @throws SQLException
	 */
	void deleteDealer(int dnumber) throws SQLException;
	
	/**
	 * ���¾�������Ϣ
	 * @param dealer
	 * @throws SQLException
	 */
	void updateDealer(Dealer dealer) throws SQLException;	
	
	/**
	 * ģ����ѯ�������������߸��ݹ�˾���������߼���
	 * @param dname
	 * @param dcompany
	 * @return List<Dealer>
	 * @throws SQLException
	 */
	List<Dealer> searchDealer(String dname,String dcompany) throws SQLException;
}
