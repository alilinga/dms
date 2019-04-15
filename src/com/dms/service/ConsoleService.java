package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;

/**
 * ����Աҵ����ģ��
 * @author LiLing
 *
 */
public interface ConsoleService {
	
	/**
	 * ��ѯ���в���Ա
	 * @return List<Console1>
	 * @throws SQLException
	 */
	List<Console1> findAll() throws SQLException;

	/**
	 * ���ݲ���Ա���кŲ�ѯ��������Ա����
	 * @param cnumber
	 * @return Console1
	 * @throws SQLException
	 */
	Console1 findConsoleByCnumber(int cnumber) throws SQLException;		

	/**
	 * �������Ա
	 * @param console1 ��Ҫ��ӵ����ݿ�Ĳ���Ա����
	 * @throws SQLException
	 */
	void insertConsole(Console1 console1) throws SQLException;
	
	/**
	 * ���ݲ���Ա���к�ɾ����Ʒ
	 * @param cnumber
	 * @throws SQLException
	 */
	void deleteConsole(int cnumber) throws SQLException;
	
	/**
	 * ���²���Ա��Ϣ
	 * @param console1
	 * @throws SQLException
	 */
	void updateConsole(Console1 console1) throws SQLException;
	
	/**
	 * ģ����ѯ����������
	 * @param sname
	 * @param scompany
	 * @return List<Console1>
	 * @throws SQLException
	 */
	List<Console1> searchConsole(String cname) throws SQLException;

}
