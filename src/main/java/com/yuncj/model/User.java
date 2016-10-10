package com.yuncj.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private static final long serialVersionUID = -6812236955442766543L;
	private int id;
	private String name;
	private Date birthday;
	public User() {
		super();
	}
	public User(int id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}
	
	

}
