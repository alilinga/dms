package com.dms.dao;


import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;

/*
 * 针对操作员的数据访问
 */
public interface ConsoleDao {
	/*
	 * 查询所有操作员
	 * @return List<Console>
	 */
	List<Console1> findAll() throws SQLException;
	
	/*
	 * 添加学生
	 * @param console 需要添加到数据库的操作员对象
	 * @throws SQLException
	 */
	void insertConsole(Console1 console1) throws SQLException;
}
