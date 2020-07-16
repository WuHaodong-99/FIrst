package com.whd.jdbctemplate;

public class User {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private Integer age;
	private String descr;
	private Double height;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public String toString() {
		return "数据： [id = "+ id +"，姓名 = "+ name +"，用户名 =  "+ username +"，密码 = "+ password +"，年龄 = "+ age +",描述 = "+ descr +",身高 = "+ height +"]";
		
	}
	
	
	

}
