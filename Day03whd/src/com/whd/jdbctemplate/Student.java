package com.whd.jdbctemplate;

public class Student {
	private Integer sno;
	private String sname;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String toString() {
		return "学生表： [学号 = "+ sno +"，姓名 = "+ sname +"]";
		
	}


}
