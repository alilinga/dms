package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Goods;


public interface GoodsService {

	/*
	 * 查询所有学生
	 */
	List<Goods> findAll() throws SQLException;
}
