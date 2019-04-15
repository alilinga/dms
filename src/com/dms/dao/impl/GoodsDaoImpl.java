package com.dms.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.GoodsDao;
import com.dms.domain.Console1;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;
import com.dms.util.JDBCUtil;
import com.dms.util.TextUtil;


public class GoodsDaoImpl implements GoodsDao {

	/*
	 * 查询所有商品
	 * @throws SQLException
	 */
	@Override
	public List<Goods> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from goods", new BeanListHandler<Goods>(Goods.class));

	}

	@Override
	public void insertGoods(Goods goods) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("insert into goods values(null , ?,?,?,?)" ,
				goods.getGid(),
				goods.getGname(),
				goods.getGtype(),
				goods.getGprice()
				);		
	}

	@Override
	public void deleteGoods(int gnumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("delete from goods where gnumber=?", gnumber);
		
	}

	@Override
	public Goods findGoodsByGnumber(int gnumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from goods where gnumber=?", new BeanHandler<Goods>(Goods.class),gnumber);
	}

	@Override
	public void updateGoods(Goods goods) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("update goods set gid=?, gname=?, gtype=?, gprice=? where gnumber=?" ,
				goods.getGid(),
				goods.getGname(),
				goods.getGtype(),
				goods.getGprice(),
				goods.getGnumber());		
	}

	@Override
	public List<Goods> searchGoods(String gname) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		String sql="select * from goods where 1=1";
		List<String> list=new ArrayList<String>();
		
		//判断有没有姓名，如果有，就组拼到SQL语句里面
		if (!TextUtil.isEmpty(gname)) {
			sql=sql+" and gname like ?";
			list.add("%"+gname+"%");			
		}
		return runner.query(sql, new BeanListHandler<Goods>(Goods.class),list.toArray());
	}

}
