package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Dealer;

/**
 * ������ҵ����ģ��
 * @author LiLing
 *
 */
public interface DealerService {
	/**
	 * ��ѯ���о�����
	 * @return List<Dealer>
	 * @throws SQLException
	 */
	List<Dealer> findAll() throws SQLException;
	
	/**
	 * ���ݾ��������кŲ�ѯ������Ʒ����
	 * @param dnumber
	 * @return
	 * @throws SQLException
	 */
	Dealer findDealerByDnumber(int dnumber) throws SQLException;		
	
	/**
	 * ��ѯ���о�����
	 * @param dealer ��Ҫ��ӵ����ݿ�ľ����̶���
	 * @throws SQLException
	 */
	void insertDealer(Dealer dealer) throws SQLException;

	/**
	 * �������̵����кŽ���ɾ��
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
