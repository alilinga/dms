package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Goods;

/*
 * 针对学生表的数据访问
 */
public interface GoodsDao {

	/*
	 * 查询所有学生
	 */
	List<Goods> findAll() throws SQLException;
}
