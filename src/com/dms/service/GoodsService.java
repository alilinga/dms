package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/*
 * ��Ʒҵ����ģ��
 */
public interface GoodsService {

	/*
	 * ��ѯ������Ʒ
	 */
	List<Goods> findAll() throws SQLException;
	
	/*
	 * ��ѯ������Ʒ
	 * @param goods ��Ҫ��ӵ����ݿ�Ĳ���Ա����
	 * @throws SQLException
	 */	
	void insertGoods(Goods goods) throws SQLException;
}
