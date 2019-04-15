package com.dms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dms.dao.ConsoleDao;
import com.dms.domain.Console1;
import com.dms.domain.Dealer;
import com.dms.util.JDBCUtil;
import com.dms.util.TextUtil;

public class ConsoleDaoImpl implements ConsoleDao {

	/*
	 * 查询所有操作员
	 * @throws SQLException
	 */
	@Override
	public List<Console1> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from console1", new BeanListHandler<Console1>(Console1.class));
	}

	/*
	 * 增加一个操作员
	 * @
	 */
	@Override
	public void insertConsole(Console1 console1) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("insert into console1 values(null , ?,?,?,?,?,?)" ,
				console1.getCid(),
				console1.getCname(),
				console1.getCsex(),
				console1.getCpassword(),
				console1.getCtel(),
				console1.getCcompany()
				);
	}

	@Override
	public void deleteConsole(int cnumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("delete from console1 where cnumber=?", cnumber);
		
	}

	@Override
	public Console1 findConsoleByCnumber(int cnumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from console1 where cnumber=?", new BeanHandler<Console1>(Console1.class),cnumber);
	}

	@Override
	public void updateConsole(Console1 console1) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("update console1 set cid=?, cname=?, csex=?, cpassword=?,ctel=?,ccompany=? where cnumber=?" ,
				console1.getCid(),
				console1.getCname(),
				console1.getCsex(),
				console1.getCpassword(),
				console1.getCtel(),
				console1.getCcompany(),
				console1.getCnumber()
				);		
	}

	@Override
	public List<Console1> searchConsole(String cname) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		String sql="select * from console1 where 1=1";
		List<String> list=new ArrayList<String>();
		
		//判断有没有姓名，如果有，就组拼到SQL语句里面
		if (!TextUtil.isEmpty(cname)) {
			sql=sql+" and cname like ?";
			list.add("%"+cname+"%");			
		}
		return runner.query(sql, new BeanListHandler<Console1>(Console1.class),list.toArray());
	}

	@Override
	public boolean login(String cid,String cpassword) {
		Connection conn=null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getConn();
			String sql="select * from console1 where cid=? and cpassword=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,cid);
			ps.setString(2,cpassword);
			rs = ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn,ps,rs);
		}
		return false;
	}

}
