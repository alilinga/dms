package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;
/*
 * 经销商业务处理模范
 */
public interface DealerService {
	/*
	 * 查询所有经销商
	 * @return List<Console>
	 */
	List<Dealer> findAll() throws SQLException;
	
	/*
	 * 查询所有经销商
	 * @param dealer 需要添加到数据库的经销商对象
	 * @throws SQLException
	 */	
	void insertDealer(Dealer dealer) throws SQLException;
}
