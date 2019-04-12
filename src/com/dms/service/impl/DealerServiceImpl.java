package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.DealerDao;
import com.dms.dao.impl.DealerDaoImpl;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;
import com.dms.service.DealerService;
import com.dms.util.JDBCUtil;

public class DealerServiceImpl implements DealerService {

	@Override
	public List<Dealer> findAll() throws SQLException {

		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from dealer", new BeanListHandler<Dealer>(Dealer.class));

	}

}
