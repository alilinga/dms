package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Goods;

/*
 * ���ѧ��������ݷ���
 */
public interface GoodsDao {

	/*
	 * ��ѯ����ѧ��
	 */
	List<Goods> findAll() throws SQLException;
}
