package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/**
 * �����Ʒ������ݷ���
 * @author LiLing
 *
 */
public interface GoodsDao {

	/**
	 * ��ѯ������Ʒ
	 * @return List<Goods>
	 * @throws SQLException
	 */
	List<Goods> findAll() throws SQLException;
	
	/**
	 * ������Ʒ���кŲ�ѯ������Ʒ����
	 * @param gnumber
	 * @return
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
	 * ������Ʒ���к�ɾ����Ʒ
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
	 * @return List<Goods>
	 * @throws SQLException
	 */
	List<Goods> searchGoods(String gname) throws SQLException;

}
