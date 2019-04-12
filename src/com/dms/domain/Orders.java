package com.dms.domain;

import java.util.HashSet;
import java.util.Set;

public class Orders {

	public int getOnumber() {
		return onumber;
	}
	public void setOnumber(int onumber) {
		this.onumber = onumber;
	}
	public int getGnumber() {
		return gnumber;
	}
	public void setGnumber(int gnumber) {
		this.gnumber = gnumber;
	}
	public int getDnumber() {
		return dnumber;
	}
	public void setDnumber(int dnumber) {
		this.dnumber = dnumber;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
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
	private int onumber;
	private int gnumber;
	private int dnumber;
	private String oid;
	private String oquantity;
	private String oprice;
	private String odata;
	private String ostate;	

}
