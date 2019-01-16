package com.atw.signweb.pojo.db;

/**
 * @author Karl
 * @Description
 * @date 2019/1/9 22:02
 */
public class ManagerDo {

	private String id;
	private String name;
	private String pwd;
	private Integer role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
}
