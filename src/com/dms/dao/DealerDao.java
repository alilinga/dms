package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;

/*
 * ��Ծ����̵����ݷ���
 */
public interface DealerDao {

	/*
	 * ��ѯ���о�����
	 * @return List<Console>
	 */	
	List<Dealer> findAll() throws SQLException;
	
	/*
	 * ��ѯ���о�����
	 * @return List<Console>
	 */
	void insertDealer(Dealer dealer) throws SQLException;
}
