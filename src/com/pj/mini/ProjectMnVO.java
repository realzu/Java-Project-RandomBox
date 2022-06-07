package com.pj.mini;

import java.io.Serializable;

public class ProjectMnVO implements Serializable{
	
	private String id;
	private String pw;
	private String name;
	private String address;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;	
	}
		
	@Override
	public String toString() {
		
		if(id==null || name==null) {
			return null;
		}
		String str = String.format("�̸� : %s\n���̵�: %s\n��й�ȣ : %s\n�ڵ��� ��ȣ : %s\n�ּ� : %s",name,id,pw,tel,address);
		
		return str;
	}

}

