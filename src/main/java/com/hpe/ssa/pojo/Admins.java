package com.hpe.ssa.pojo;

public class Admins {

	private int aid;
	private String acount;
	private String apwd;
	private int a_pcid;
	private String aremarks;

	public Admins() {
	}

	public Admins(int aid, String acount, String apwd, int a_pcid, String aremarks) {
		this.aid = aid;
		this.acount = acount;
		this.apwd = apwd;
		this.a_pcid = a_pcid;
		this.aremarks = aremarks;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAcount() {
		return acount;
	}

	public void setAcount(String acount) {
		this.acount = acount;
	}

	public String getApwd() {
		return apwd;
	}

	public void setApwd(String apwd) {
		this.apwd = apwd;
	}

	public int getA_pcid() {
		return a_pcid;
	}

	public void setA_pcid(int a_pcid) {
		this.a_pcid = a_pcid;
	}

	public String getAremarks() {
		return aremarks;
	}

	public void setAremarks(String aremarks) {
		this.aremarks = aremarks;
	}

	@Override
	public String toString() {
		return "Admins{" +
				"aid=" + aid +
				", acount='" + acount + '\'' +
				", apwd='" + apwd + '\'' +
				", a_pcid=" + a_pcid +
				", aremarks='" + aremarks + '\'' +
				'}';
	}
}
