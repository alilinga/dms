package com.dms.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.DealerDao;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;
import com.dms.util.JDBCUtil;
import com.dms.util.TextUtil;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class DealerDaoImpl implements DealerDao {

	/*
	 * ��ѯ���о�����
	 * @throws SQLException
	 */
	@Override
	public List<Dealer> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from dealer", new BeanListHandler<Dealer>(Dealer.class));
	}
	
	/*
	 * ���뾭����
	 * @throws SQLException
	 */	
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
	
	/*
	 * ɾ��������
	 * @throws SQLException
	 */
	@Override
	public void deleteDealer(int dnumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("delete from dealer where dnumber=?", dnumber);
	}
	
	
	@Override
	public Dealer findDealerByDnumber(int dnumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from dealer where dnumber=?", new BeanHandler<Dealer>(Dealer.class),dnumber);
	}
	
	@Override
	public void updateDealer(Dealer dealer) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("update dealer set did=?, dname=?, dsex=?, dpassword=?, dtel=?, demail=?, daddress=?, dcompany=? where dnumber=?" ,
				dealer.getDid(),
				dealer.getDname(),
				dealer.getDsex(),
				dealer.getDpassword(),
				dealer.getDtel(),
				dealer.getDemail(),
				dealer.getDaddress(),
				dealer.getDcompany(),
				dealer.getDnumber()
				);	
	}

	/*
	 * ֻ������select * from dealer where dname like ?
	 * ֻ�й�˾select * from dealer where dcompany like?
	 * ��������select * from dealer where dname like ? and dcompany like
	 * ��û�в�ѯ����
	 */
	@Override
	public List<Dealer> searchDealer(String dname, String dcompany) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		
		String sql="select * from dealer where 1=1";
		List<String> list=new ArrayList<String>();
		
		//�ж���û������������У�����ƴ��SQL�������
		if (!TextUtil.isEmpty(dname)) {
			sql=sql+" and dname like ?";
			list.add("%"+dname+"%");			
		}
		if (!TextUtil.isEmpty(dcompany)) {
			sql=sql+" and dcompany like ?";
			list.add("%"+dcompany+"%");			
		}
		return runner.query(sql,new BeanListHandler<Dealer>(Dealer.class),list.toArray());
	}

}
