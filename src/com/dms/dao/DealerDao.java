package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;

/*
 * 针对经销商的数据访问
 */
public interface DealerDao {

	/*
	 * 查询所有经销商
	 * @return List<Console>
	 */	
	List<Dealer> findAll() throws SQLException;
	
	/*
	 * 查询所有经销商
	 * @return List<Console>
	 */
	void insertDealer(Dealer dealer) throws SQLException;
}
