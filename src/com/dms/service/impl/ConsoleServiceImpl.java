package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.ConsoleDao;
import com.dms.dao.impl.ConsoleDaoImpl;
import com.dms.domain.Console1;
import com.dms.service.ConsoleService;
import com.dms.util.JDBCUtil;

/*
 * 操作员的业务实现
 */
public class ConsoleServiceImpl implements ConsoleService {

	@Override
	public List<Console1> findAll() throws SQLException {

		ConsoleDaoImpl dao = new ConsoleDaoImpl();
		return dao.findAll();
	}

	@Override
	public void insertConsole(Console1 console1) throws SQLException {
		ConsoleDao dao = new ConsoleDaoImpl();
		dao.insertConsole(console1);
		
	}

}
