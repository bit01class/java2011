package kr.co.sql01;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class Ex03 {

	public static void main(String[] args) {
		OracleDataSource ods=null;
		try {
			ods = new OracleDataSource();
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			ods.setURL(url);
			ods.setUser("scott");
			ods.setPassword("tiger");
			Connection conn = ods.getConnection();
			System.out.println(conn);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
