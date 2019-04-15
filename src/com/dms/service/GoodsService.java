package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/**
 * 商品业务处理规范
 * @author LiLing
 *
 */
public interface GoodsService {

	/**
	 * 查询所有商品
	 * @return List<Goods>
	 * @throws SQLException
	 */
	List<Goods> findAll() throws SQLException;

	/**
	 * 根据商品序列号查询单个商品对象
	 * @param gnumber
	 * @return Goods
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
	 * 按商品序列号商品
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
	 * @return
	 * @throws SQLException
	 */
	List<Goods> searchGoods(String gname) throws SQLException;

}
