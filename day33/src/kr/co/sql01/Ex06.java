package kr.co.sql01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Ex06 {

	public static void main(String[] args) {

		oracle.jdbc.driver.OracleDriver driver;
		driver=new OracleDriver();

		String url="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
//		String sql="insert into dept values (91,'¿⁄¿Á2∆¿','∞Ê∫œ')";
		String sql="delete from dept where deptno=88";
//		String sql="update dept set dname='¿⁄¿Á∆¿' where deptno=90";
		System.out.println(sql);
		Connection conn=null;
		Statement stmt=null;
		try {
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}










