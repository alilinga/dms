package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.domain.Goods;


public interface GoodsService {

	/*
	 * ��ѯ����ѧ��
	 */
	List<Goods> findAll() throws SQLException;
}
