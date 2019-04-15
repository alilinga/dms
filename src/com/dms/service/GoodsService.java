package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/**
 * ��Ʒҵ����淶
 * @author LiLing
 *
 */
public interface GoodsService {

	/**
	 * ��ѯ������Ʒ
	 * @return List<Goods>
	 * @throws SQLException
	 */
	List<Goods> findAll() throws SQLException;

	/**
	 * ������Ʒ���кŲ�ѯ������Ʒ����
	 * @param gnumber
	 * @return Goods
	 * @throws SQLException
	 */
	Goods findGoodsByGnumber(int gnumber) throws SQLException;	
	
	/**
	 * �����Ʒ
	 * @param goods
	 * @throws SQLException
	 */
	void insertGoods(Goods goods) throws SQLException;
	
	/**
	 * ����Ʒ���к���Ʒ
	 * @param gnumber
	 * @throws SQLException
	 */
	void deleteGoods(int gnumber) throws SQLException;
	
	/**
	 * ������Ʒ��Ϣ
	 * @param goods
	 * @throws SQLException
	 */
	void updateGoods(Goods goods) throws SQLException;

	/**
	 * ģ����ѯ
	 * @param gname
	 * @param gprice1
	 * @param gprice2
	 * @return
	 * @throws SQLException
	 */
	List<Goods> searchGoods(String gname) throws SQLException;

}
