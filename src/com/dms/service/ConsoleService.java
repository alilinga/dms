package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;

/*
 * ����Աҵ����ģ��
 */
public interface ConsoleService {
	
	/*
	 * ��ѯ���в���Ա
	 * @return List<Console>
	 */
	List<Console1> findAll() throws SQLException;
	
	/*
	 * ��ѯ���в���Ա
	 * @param console ��Ҫ��ӵ����ݿ�Ĳ���Ա����
	 * @throws SQLException
	 */	
	void insertConsole(Console1 console1) throws SQLException;
}
