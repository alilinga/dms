package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.ConsoleDao;
import com.dms.dao.GoodsDao;
import com.dms.dao.impl.ConsoleDaoImpl;
import com.dms.dao.impl.GoodsDaoImpl;
import com.dms.domain.Goods;
import com.dms.service.GoodsService;
import com.dms.util.JDBCUtil;

public class GoodsServiceImpl implements GoodsService {

	/*
	 * 查询所有学生
	 * @throws SQLException
	 */
	@Override
	public List<Goods> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from goods", new BeanListHandler<Goods>(Goods.class));

	}

	@Override
	public void insertGoods(Goods goods) throws SQLException {
		GoodsDao dao = new GoodsDaoImpl();
		dao.insertGoods(goods);
		
	}
}
