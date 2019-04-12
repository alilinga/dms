package com.dms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.DealerDao;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;
import com.dms.util.JDBCUtil;

public class DealerDaoImpl implements DealerDao {

	/*
	 * 查询所有经销商
	 * @throws SQLException
	 */
	@Override
	public List<Dealer> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from dealer", new BeanListHandler<Dealer>(Dealer.class));
	}
	@Override
	public void insertDealer(Dealer dealer) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("insert into dealer values(null , ?,?,?,?,?,?,?,?)" ,
				dealer.getDid(),
				dealer.getDname(),
				dealer.getDsex(),
				dealer.getDpassword(),
				dealer.getDtel(),
				dealer.getDemail(),
				dealer.getDaddress(),
				dealer.getDcompany()
				);
		
	}

}
