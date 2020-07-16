package com.whd.jdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTempleTest {
	public static void main(String[] args) {
		
		
		findUserByall();
		
		
		
		
	}
	
	
	
	//查询
	private static void inquire() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "select * from xs";
		List<Student> list = jt.query(sql, new BeanPropertyRowMapper<>(Student.class));
		for(Student student :list) {
			System.out.println(student);
		}
	}
	
		//添加 
	private static void addUser() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "insert into person(id,name,username,password,age,descr,height) values (1001,'奥恩','aoen','1111',25,'坦克','188')";
		int update = jt.update(sql);
		System.out.println("成功插入"+ update +"条数据");
		
	}
	
	
	
	//添加（预编译）
	private static void addUser1() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	//update
		String sql ="insert into person(id,name,username,password,age,descr,height) values (?,?,?,?,?,?,?)";
		int update = jt.update(sql,1002,"亚索","yasuo","2222",29,"战士","175");
		System.out.println("成功插入"+ update +"条数据");
		
	}
	
	
	
	//修改
	private static void updateUser() {
		//添加sql
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		//update
		int update = jt.update("update person set name =?,username =?,password =?,age =?,descr =?,height =? where id=?","疾风剑豪","jifeng","0000",18,"托儿所","178",1002);
		System.out.println("成功更改"+ update +"条数据");
	}
	
	//根据id删除
	private static void deleUser(){
		//添加sql
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		//update
		int update = jt.update(" delete from person where id =?",1001);
		System.out.println("根据id成功删除"+ update +"条数据");
	}
	//根据姓名删除
	private static void deleUser1(){
		//添加sql
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		//update
		int update = jt.update(" delete from person where name =?","疾风剑豪");
		System.out.println("根据姓名成功删除"+ update +"条数据");
	}
	//通过id查询
	private static void findUserByid() {
		//添加sql
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		User user = jt.queryForObject(" select * from person where id=?",new BeanPropertyRowMapper<>(User.class),1001);
		System.out.println(user);
	}
	//查询所有英雄
	private static void findUserByall() {
		//添加sql
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "select * from person";
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<>(User.class));
		for(User user :list) {
			System.out.println(user);
		}
	}
	
	
}
