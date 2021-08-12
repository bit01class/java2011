package kr.co.sql01;

import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {

	public static void main(String[] args) {
		oracle.jdbc.driver.OracleDriver driver=null;
		driver=new OracleDriver();
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		java.util.Properties info=null; 
		info=new Properties();
		info.setProperty("user", "scott");
		info.setProperty("password", "tiger");
		java.sql.Connection conn=null;
		java.sql.Statement stmt=null;
		java.sql.ResultSet rs=null;
		
		try {
			conn=java.sql.DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select dname,loc from dept");
			while(rs.next()){
				System.out.println(rs.getString(1)+"-"+rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}










