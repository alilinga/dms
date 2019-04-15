package com.dms.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.ConsoleDao;
import com.dms.dao.DealerDao;
import com.dms.dao.GoodsDao;
import com.dms.dao.impl.ConsoleDaoImpl;
import com.dms.dao.impl.DealerDaoImpl;
import com.dms.dao.impl.GoodsDaoImpl;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;
import com.dms.service.DealerService;
import com.dms.util.JDBCUtil;

public class DealerServiceImpl implements DealerService {

	@Override
	public List<Dealer> findAll() throws SQLException {

		DealerDaoImpl dao = new DealerDaoImpl();
		return dao.findAll();

	}

	@Override
	public void insertDealer(Dealer dealer) throws SQLException {
		DealerDao dao = new DealerDaoImpl();
		dao.insertDealer(dealer);
		
		
	}

	@Override
	public void deleteDealer(int dnumber) throws SQLException {
		DealerDao dao = new DealerDaoImpl();
		dao.deleteDealer(dnumber);
		
	}

	@Override
	public Dealer findDealerByDnumber(int dnumber) throws SQLException {
		DealerDao dao = new DealerDaoImpl();
		return dao.findDealerByDnumber(dnumber);
	}

	@Override
	public void updateDealer(Dealer dealer) throws SQLException {
		DealerDao dao = new DealerDaoImpl();
		dao.updateDealer(dealer);		
	}

	@Override
	public List<Dealer> searchDealer(String dname, String dcompany) throws SQLException {
		DealerDao dao = new DealerDaoImpl();
		return dao.searchDealer(dname,dcompany);
	}

}
