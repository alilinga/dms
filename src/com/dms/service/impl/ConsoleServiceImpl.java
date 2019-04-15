package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.ConsoleDao;
import com.dms.dao.DealerDao;
import com.dms.dao.impl.ConsoleDaoImpl;
import com.dms.dao.impl.DealerDaoImpl;
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

	@Override
	public void deleteConsole(int cnumber) throws SQLException {
		ConsoleDao dao = new ConsoleDaoImpl();
		dao.deleteConsole(cnumber);
		
	}

	@Override
	public Console1 findConsoleByCnumber(int cnumber) throws SQLException {
		ConsoleDao dao = new ConsoleDaoImpl();
		return dao.findConsoleByCnumber(cnumber);
	}

	@Override
	public void updateConsole(Console1 console1) throws SQLException {
		ConsoleDao dao = new ConsoleDaoImpl();
		dao.updateConsole(console1);
	}

	@Override
	public List<Console1> searchConsole(String cname) throws SQLException {
		ConsoleDao dao = new ConsoleDaoImpl();
		return dao.searchConsole(cname);
	}

}
