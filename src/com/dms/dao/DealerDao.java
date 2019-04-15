package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Dealer;

/**
 * 针对经销商的数据访问
 */
public interface DealerDao {

	/**
	 * 查询所有经销商
	 * @return List<Dealer>
	 * @throws SQLException
	 */
	List<Dealer> findAll() throws SQLException;
	
	/**
	 * 根据经销商序列号查询单个商品对象
	 * @param dnumber
	 * @return Dealer
	 * @throws SQLException
	 */
	Dealer findDealerByDnumber(int dnumber) throws SQLException;		
	
	/**
	 * 插入经销商
	 * @param dealer
	 * @throws SQLException
	 */
	void insertDealer(Dealer dealer) throws SQLException;
	
	/**
	 * 根据经销商序列号删除商品
	 * @param dnumber
	 * @throws SQLException
	 */
	void deleteDealer(int dnumber) throws SQLException;
	
	/**
	 * 更新经销商信息
	 * @param dealer
	 * @throws SQLException
	 */
	void updateDealer(Dealer dealer) throws SQLException;	
	
	/**
	 * 模糊查询，根据姓名或者根据公司，或者两者兼有
	 * @param dname
	 * @param dcompany
	 * @return List<Dealer>
	 * @throws SQLException
	 */
	List<Dealer> searchDealer(String dname,String dcompany) throws SQLException;
}
