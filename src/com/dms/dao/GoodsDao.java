package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/*
 * �����Ʒ������ݷ���
 */
public interface GoodsDao {

	/*
	 * ��ѯ������Ʒ
	 */
	List<Goods> findAll() throws SQLException;
	
	/*
	 * �����Ʒ
	 * @param goods ��Ҫ��ӵ����ݿ�Ĳ���Ա����
	 * @throws SQLException
	 */
	void insertGoods(Goods goods) throws SQLException;
}
