package kr.co.tjoeun.util;

import java.sql.Connection;
import java.sql.SQLException;

public class MyOracle {
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="scott";
	private static String password="tiger";
	private static Connection conn;
	
	private MyOracle(){}
	
	public static Connection getConnection(){
		try{
			if(conn==null || conn.isClosed()){
					Class.forName(driver);
					conn=java.sql.DriverManager.getConnection(url, user, password);
			}
		}catch(SQLException e){
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

	
	
	
	
	
	
	
	