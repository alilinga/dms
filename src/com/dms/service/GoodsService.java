package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Console1;
import com.dms.domain.Goods;

/*
 * 商品业务处理模范
 */
public interface GoodsService {

	/*
	 * 查询所有商品
	 */
	List<Goods> findAll() throws SQLException;
	
	/*
	 * 查询所有商品
	 * @param goods 需要添加到数据库的操作员对象
	 * @throws SQLException
	 */	
	void insertGoods(Goods goods) throws SQLException;
}
