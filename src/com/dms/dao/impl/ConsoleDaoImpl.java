package com.dms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.ConsoleDao;
import com.dms.domain.Console;
import com.dms.domain.Dealer;
import com.dms.util.JDBCUtil;

public class ConsoleDaoImpl implements ConsoleDao {

	@Override
	public List<Console> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from console", new BeanListHandler<Console>(Console.class));
	}

}
