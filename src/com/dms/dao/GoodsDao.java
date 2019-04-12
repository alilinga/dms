package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/*
 * 针对商品表的数据访问
 */
public interface GoodsDao {

	/*
	 * 查询所有商品
	 */
	List<Goods> findAll() throws SQLException;
	
	/*
	 * 添加商品
	 * @param goods 需要添加到数据库的操作员对象
	 * @throws SQLException
	 */
	void insertGoods(Goods goods) throws SQLException;
}
