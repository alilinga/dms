package com.dms.domain;

import java.util.HashSet;
import java.util.Set;

public class Dealer {
	public Dealer() {
		super();
	}
	public Dealer(String did, String dname, String dsex, String dpassword, String dtel, String demail, String daddress,
			String dcompany) {
		super();
		this.did = did;
		this.dname = dname;
		this.dsex = dsex;
		this.dpassword = dpassword;
		this.dtel = dtel;
		this.demail = demail;
		this.daddress = daddress;
		this.dcompany = dcompany;
	}
	public int getDnumber() {
		return dnumber;
	}
	public void setDnumber(int dnumber) {
		this.dnumber = dnumber;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDsex() {
		return dsex;
	}
	public void setDsex(String dsex) {
		this.dsex = dsex;
	}
	public String getDpassword() {
		return dpassword;
	}
	public void setDpassword(String dpassword) {
		this.dpassword = dpassword;
	}
	public String getDtel() {
		return dtel;
	}
	public void setDtel(String dtel) {
		this.dtel = dtel;
	}
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	public String getDcompany() {
		return dcompany;
	}
	public void setDcompany(String dcompany) {
		this.dcompany = dcompany;
	}
	private int dnumber;
	private String did;
	private String dname;
	private String dsex;
	private String dpassword;
	private String dtel;
	private String demail;
	private String daddress;
	private String dcompany;

		
}
