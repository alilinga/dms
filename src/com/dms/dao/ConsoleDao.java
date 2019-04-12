package com.dms.dao;


import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;

/*
 * ��Բ���Ա�����ݷ���
 */
public interface ConsoleDao {
	/*
	 * ��ѯ���в���Ա
	 * @return List<Console>
	 */
	List<Console1> findAll() throws SQLException;
	
	/*
	 * ���ѧ��
	 * @param console ��Ҫ��ӵ����ݿ�Ĳ���Ա����
	 * @throws SQLException
	 */
	void insertConsole(Console1 console1) throws SQLException;
}
