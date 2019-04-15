package com.dms.dao;


import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console1;
import com.dms.domain.Dealer;
import com.dms.domain.Goods;

/**
 * ��Բ���Ա�����ݷ���
 * @author LiLing
 *
 */
public interface ConsoleDao {
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
	 * ��Ӳ���Ա
	 * @param console1
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
	
	/**
	 * ��¼
	 * @return
	 */
	boolean login(String cid,String cpassword);

}
