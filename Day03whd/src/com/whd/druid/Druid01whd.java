package com.whd.druid;

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
		Properties pro = new Properties();
		InputStream resourceAsStream = Druid01whd.class.getClassLoader().getResourceAsStream("jdbc.properties");
		pro.load(resourceAsStream);
		
		String password = pro.getProperty("password");
		String property = pro.getProperty("username");
		System.out.println(password);
		System.out.println(property);
		DataSource datasource = DruidDataSourceFactory.createDataSource(pro);
		System.out.println(datasource.getConnection());
		Connection connection = datasource.getConnection();
		System.out.println("获取的连接:"+connection);
		Statement createStatement = connection.createStatement();
		String sql = "select *from xs";
		ResultSet rs = createStatement.executeQuery(sql);
		while(rs.next()) {
			String name = rs.getString("sname");
			String adress = rs.getString("sno");
			System.out.println(name+adress);
		}
		connection.close();
		
		
		
		
		
		
	}

}
