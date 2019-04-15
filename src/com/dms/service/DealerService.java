package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Dealer;

/**
 * 经销商业务处理模范
 * @author LiLing
 *
 */
public interface DealerService {
	/**
	 * 查询所有经销商
	 * @return List<Dealer>
	 * @throws SQLException
	 */
	List<Dealer> findAll() throws SQLException;
	
	/**
	 * 根据经销商序列号查询单个商品对象
	 * @param dnumber
	 * @return
	 * @throws SQLException
	 */
	Dealer findDealerByDnumber(int dnumber) throws SQLException;		
	
	/**
	 * 查询所有经销商
	 * @param dealer 需要添加到数据库的经销商对象
	 * @throws SQLException
	 */
	void insertDealer(Dealer dealer) throws SQLException;

	/**
	 * 按经销商的序列号进行删除
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
