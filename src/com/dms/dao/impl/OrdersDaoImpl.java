package com.dms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.crypto.Data;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.dms.dao.OrdersDao;
import com.dms.domain.Console1;
import com.dms.domain.Goods;
import com.dms.domain.Orders;
import com.dms.util.JDBCUtil;
import com.dms.util.TextUtil;
import com.mysql.jdbc.Statement;

public class OrdersDaoImpl implements OrdersDao {
	@Override
	public List<Orders> findAll(Orders orders)  throws SQLException {
		Connection conn =null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		List<Orders> list=new ArrayList<Orders>();
		try {

			conn = JDBCUtil.getConn();
			String sql="SELECT onumber,oid,gname,dname,oquantity,oprice,odata,ostate FROM orders AS o,goods AS g,dealer AS d WHERE o.gnumber=g.gnumber AND o.dnumber=d.dnumber";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){				
				//另一个构造函数
				Orders orders1=new Orders(rs.getInt("onumber"), rs.getString("oid"),
						rs.getString("gname"),rs.getString("dname"),rs.getString("oquantity")
						,rs.getString("oprice"),rs.getString("odata"),rs.getString("ostate"));
				list.add(orders1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn,ps,rs);
		}		
		return list;		
	}

	@Override
	public void deleteOrders(int onumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("delete from orders where onumber=?", onumber);
		
	}

	@Override
	public void insertOrders(Orders orders) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("insert into orders values(null , ?,?,?,?,?,?,?)" ,				
				orders.getOid(),
				orders.getGnumber(),
				orders.getDnumber(),
				orders.getOquantity(),
				orders.getOprice(),
				orders.getOdata(),
				orders.getOstate()
				);		
	}
	
	@Override
	public List<Orders> searchOrders(String gname,String dname) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		String sql="SELECT onumber,oid,gname,dname,oquantity,oprice,odata,ostate FROM orders AS o,goods AS g,dealer AS d WHERE o.gnumber=g.gnumber AND o.dnumber=d.dnumber ";
		List<String> list=new ArrayList<String>();
				
		if (!TextUtil.isEmpty(gname)) {
			sql=sql+"and gname like ?";
			list.add("%"+gname+"%");			
		}
		if (!TextUtil.isEmpty(dname)) {
			sql=sql+" and dname like ?";
			list.add("%"+dname+"%");			
		}
		return runner.query(sql, new BeanListHandler<Orders>(Orders.class),list.toArray());
	}

	@Override
	public Orders findOrdersByOnumber(int onumber) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from orders where onumber=?", new BeanHandler<Orders>(Orders.class),onumber);
	}

	@Override
	public void updateOrders(Orders orders) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("update orders set oid=?, gnumber=?, dnumber=?, oquantity=?,oprice=?,odata=?,ostate=? where onumber=?" ,
				orders.getOid(),
				orders.getGnumber(),
				orders.getDnumber(),
				orders.getOquantity(),
				orders.getOprice(),
				orders.getOdata(),
				orders.getOstate(),
				orders.getOnumber());		
	}

}


