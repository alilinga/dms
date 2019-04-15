package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;

/**
 * 操作员业务处理模范
 * @author LiLing
 *
 */
public interface ConsoleService {
	
	/**
	 * 查询所有操作员
	 * @return List<Console1>
	 * @throws SQLException
	 */
	List<Console1> findAll() throws SQLException;

	/**
	 * 根据操作员序列号查询单个操作员对象
	 * @param cnumber
	 * @return Console1
	 * @throws SQLException
	 */
	Console1 findConsoleByCnumber(int cnumber) throws SQLException;		

	/**
	 * 插入操作员
	 * @param console1 需要添加到数据库的操作员对象
	 * @throws SQLException
	 */
	void insertConsole(Console1 console1) throws SQLException;
	
	/**
	 * 根据操作员序列号删除商品
	 * @param cnumber
	 * @throws SQLException
	 */
	void deleteConsole(int cnumber) throws SQLException;
	
	/**
	 * 更新操作员信息
	 * @param console1
	 * @throws SQLException
	 */
	void updateConsole(Console1 console1) throws SQLException;
	
	/**
	 * 模糊查询，根据姓名
	 * @param sname
	 * @param scompany
	 * @return List<Console1>
	 * @throws SQLException
	 */
	List<Console1> searchConsole(String cname) throws SQLException;

}
