package com.whd.jdbctemplate;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class Druid01whd {
	public static void main(String[] args) throws Exception {
		//导入包
		//定义配置文件
		//加载配置文件
		Properties pro = new Properties();
		//加载器
		InputStream resourceAsStream = Druid01whd.class.getClassLoader().getResourceAsStream("jdbc.properties");
		//load
		pro.load(resourceAsStream);
		
		String property = pro.getProperty("name");
		String password = pro.getProperty("password");
		System.out.println(password);
		System.out.println(property);
		//数据库连接池对象
		DataSource datasource = DruidDataSourceFactory.createDataSource(pro);
		//数据库连接
		System.out.println(datasource.getConnection());
		//获取连接
		Connection connection = datasource.getConnection();
		System.out.println("获取的连接："+connection);
		//执行sql对象
		Statement createStatement = connection.createStatement();
		//声明sql
		String sql = "select *from xs";
		//执行查询
		ResultSet rs = createStatement.executeQuery(sql);
		//遍历结果
		while(rs.next()) {
			String name = rs.getString("sname");
			String adress = rs.getString("sno");
			System.out.println(name+adress);
		}
		//归还连接
		connection.close();
		
		
		
		
		
		
	}

}
