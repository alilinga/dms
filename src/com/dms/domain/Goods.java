package com.dms.domain;

import java.util.Date;

public class Goods {

	public int getGnumber() {
		return gnumber;
	}
	public void setGnumber(int gnumber) {
		this.gnumber = gnumber;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGtype() {
		return gtype;
	}
	public void setGtype(String gtype) {
		this.gtype = gtype;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	private int gnumber;
	private String gid;
	private String gname;
	private String gtype;
	private String gprice;
	public Goods() {
		super();
	}
	public Goods(String gid, String gname, String gtype, String gprice) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gtype = gtype;
		this.gprice = gprice;
	}

}
