package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Console;
import com.dms.service.ConsoleService;
import com.dms.util.JDBCUtil;

public class ConsoleServiceImpl implements ConsoleService {

	@Override
	public List<Console> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from console", new BeanListHandler<Console>(Console.class));
	}

}
