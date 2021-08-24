package kr.co.tjoeun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DockerOracle {
	private static Connection conn;
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@192.168.99.100:32769:xe";
	private static String user="scott";
	private static String password="tiger";
	
	private DockerOracle() {
	}
	
	public static Connection getConnection() throws SQLException{
		
		if(conn==null || conn.isClosed()){
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("ojdbc14.jar ª©∏‘¿Ω");
			}
			conn=DriverManager.getConnection(url, user, password);
		}
		return conn;
	}
}











