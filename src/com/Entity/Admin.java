package com.Entity;
/**
 * 用户实体类
 * @author songdu
 *
 */
public class Admin {
	private int no;
	private String adid;
	private String adpwd;

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAdid() {
		return adid;
	}
	public void setAdid(String adid) {
		this.adid = adid;
	}
	public String getAdpwd() {
		return adpwd;
	}
	public void setAdpwd(String adpwd) {
		this.adpwd = adpwd;
	}

	public Admin() {
		super();
	}
	public Admin(int no, String adid, String adpwd) {
		super();
		this.no = no;
		this.adid = adid;
		this.adpwd = adpwd;
	}
	@Override
	public String toString() {
		return "Admin [no=" + no + ", adid=" + adid + ", adpwd=" + adpwd + "]";
	}
}
