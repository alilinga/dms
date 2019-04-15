package com.dms.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.crypto.Data;

public class Orders {
	private int onumber;
	private String oid;
	private int gnumber;
	private int dnumber;	
	private String oquantity;
	private String oprice;
	private String odata;
	private String ostate;	
	private Goods goods;	
	private String gname;
	private String dname;
	public Orders() {
		super();
	}
	public Orders(String oid, int gnumber, int dnumber, String oquantity, String oprice,
			String odata, String ostate) {
		super();
		this.oid = oid;
		this.gnumber = gnumber;
		this.dnumber = dnumber;
		this.oquantity = oquantity;
		this.oprice = oprice;
		this.odata = odata;
		this.ostate = ostate;
	}
	public Orders(int onumber,String oid, int gnumber, int dnumber, String oquantity, String oprice,
			String odata, String ostate) {
		super();
		this.onumber=onumber;
		this.oid = oid;
		this.gnumber = gnumber;
		this.dnumber = dnumber;
		this.oquantity = oquantity;
		this.oprice = oprice;
		this.odata = odata;
		this.ostate = ostate;
	}
	public Orders(int onumber, String oid, String gname, String dname, String oquantity, String oprice,
			String odata, String ostate) {
		super();
		this.onumber=onumber;
		this.oid = oid;
		this.gname = gname;
		this.dname = dname;
		this.oquantity = oquantity;
		this.oprice = oprice;
		this.odata = odata;
		this.ostate = ostate;
	}
	
	public int getOnumber() {
		return onumber;
	}
	public void setOnumber(int onumber) {
		this.onumber = onumber;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getGnumber() {
		return gnumber;
	}
	public void setGnumber(int gnumber) {
		this.gnumber = gnumber;
	}

	public String getOquantity() {
		return oquantity;
	}
	public void setOquantity(String oquantity) {
		this.oquantity = oquantity;
	}
	public String getOprice() {
		return oprice;
	}
	public void setOprice(String oprice) {
		this.oprice = oprice;
	}
	public String getOdata() {
		return odata;
	}
	public void setOdata(String odata) {
		this.odata = odata;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}

	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}



	public int getDnumber() {
		return dnumber;
	}



	public void setDnumber(int dnumber) {
		this.dnumber = dnumber;
	}

	
}