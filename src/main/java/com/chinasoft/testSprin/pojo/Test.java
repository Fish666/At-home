package com.chinasoft.testSprin.pojo;

public class Test {
	private int tid;
	private String tname;
	private String tpwd;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTpwd() {
		return tpwd;
	}
	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}
	@Override
	public String toString() {
		return "Test [id=" + tid + ", tname=" + tname + ", tpwd=" + tpwd + "]";
	}
	
}
