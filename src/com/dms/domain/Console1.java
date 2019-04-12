package com.dms.domain;

public class Console1 {
	public int getCnumber() {
		return cnumber;
	}
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	public String getCcompany() {
		return ccompany;
	}
	public void setCcompany(String ccompany) {
		this.ccompany = ccompany;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	private int cnumber;
	public Console1(String cid, String csex, String cname, String cpassword, String ctel, String ccompany) {
		super();
		this.cid = cid;
		this.csex = csex;
		this.cname = cname;
		this.cpassword = cpassword;
		this.ctel = ctel;
		this.ccompany = ccompany;
	}

	public Console1() {
		super();
	}

	private String cid;
	private String csex;
	private String cname;
	private String cpassword;
	private String ctel;
	private String ccompany;
}
