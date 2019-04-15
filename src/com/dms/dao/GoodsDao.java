package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/**
 * 针对商品表的数据访问
 * @author LiLing
 *
 */
public interface GoodsDao {

	/**
	 * 查询所有商品
	 * @return List<Goods>
	 * @throws SQLException
	 */
	List<Goods> findAll() throws SQLException;
	
	/**
	 * 根据商品序列号查询单个商品对象
	 * @param gnumber
	 * @return
	 * @throws SQLException
	 */
	Goods findGoodsByGnumber(int gnumber) throws SQLException;	
	
	/**
	 * 添加商品
	 * @param goods
	 * @throws SQLException
	 */
	void insertGoods(Goods goods) throws SQLException;
	
	/**
	 * 根据商品序列号删除商品
	 * @param gnumber
	 * @throws SQLException
	 */
	void deleteGoods(int gnumber) throws SQLException;
	
	/**
	 * 更新商品信息
	 * @param goods
	 * @throws SQLException
	 */
	void updateGoods(Goods goods) throws SQLException;

	/**
	 * 模糊查询
	 * @param gname
	 * @param gprice1
	 * @param gprice2
	 * @return List<Goods>
	 * @throws SQLException
	 */
	List<Goods> searchGoods(String gname) throws SQLException;

}
