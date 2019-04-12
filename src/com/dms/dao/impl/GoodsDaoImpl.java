package com.dms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.GoodsDao;
import com.dms.domain.Goods;
import com.dms.util.JDBCUtil;


public class GoodsDaoImpl implements GoodsDao {

	/*
	 * 查询所有学生
	 * @throws SQLException
	 */
	@Override
	public List<Goods> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from goods", new BeanListHandler<Goods>(Goods.class));

	}

}
