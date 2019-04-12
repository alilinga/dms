package com.dms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.ConsoleDao;
import com.dms.domain.Console1;
import com.dms.domain.Dealer;
import com.dms.util.JDBCUtil;

public class ConsoleDaoImpl implements ConsoleDao {

	/*
	 * 查询所有操作员
	 * @throws SQLException
	 */
	@Override
	public List<Console1> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from console1", new BeanListHandler<Console1>(Console1.class));
	}

	/*
	 * 增加一个操作员
	 * @
	 */
	@Override
	public void insertConsole(Console1 console1) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("insert into console1 values(null , ?,?,?,?,?,?)" ,
				console1.getCid(),
				console1.getCname(),
				console1.getCsex(),
				console1.getCpassword(),
				console1.getCtel(),
				console1.getCcompany()
				);
	}

}
