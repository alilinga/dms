package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;
/*
 * ������ҵ����ģ��
 */
public interface DealerService {
	/*
	 * ��ѯ���о�����
	 * @return List<Console>
	 */
	List<Dealer> findAll() throws SQLException;
	
	/*
	 * ��ѯ���о�����
	 * @param dealer ��Ҫ��ӵ����ݿ�ľ����̶���
	 * @throws SQLException
	 */	
	void insertDealer(Dealer dealer) throws SQLException;
}
