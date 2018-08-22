package chap10_comm_class.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import chap05_object.clone.Employee;

/**
 * 
 * @ClassName:  DBUtilsTest   
 * @Description:QueryRunner 处理查询    ，BeanListHandler处理结果集  
 * @author: 谢洪伟 
 * @date:   2018年8月20日 上午9:32:20   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class DBUtilsTest {
	private static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/stu";
	private static String USER = "root";
	private static String PASS = "xhw" ;
	private static Connection conn=null;
	
	private static Connection getConnection(){
		DbUtils.loadDriver(DRIVER_CLASS);
		try {
			conn=DriverManager.getConnection(URL,USER,PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public List<Employee> name(String sql) {
		QueryRunner queryRunner = new QueryRunner();
		List<Employee> list=null;
		try {
			list = queryRunner.query(sql, new BeanListHandler<>(Employee.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
	}
}
