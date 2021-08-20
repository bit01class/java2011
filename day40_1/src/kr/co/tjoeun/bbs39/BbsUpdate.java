package kr.co.tjoeun.bbs39;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BbsUpdate {
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="scott";
	private String password="tiger";
	
	private Connection conn=null;
	private Statement stmt=null;
	
	public void insert(String sub,String id,String content){
		String sql="insert into bbs39 (num,sub,id,content) ";
		sql+="values (bbs39_seq.nextval,'"
				+sub+"','"+id+"','"+content+"')";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
	
	public void cntPlus(int num){
		String sql="update bbs39 set cnt=cnt+1 where num="+num;
		try {
			Class.forName(driver);
			try(
Connection conn=DriverManager.getConnection(url, user, password);
Statement stmt=conn.createStatement();
				){
					stmt.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateOne(String sub,String content,int num){
		String sql="update bbs39 set sub='"
					+sub+"',content='"+content+"' where num="+num;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
	public void deleteOne(int num){
		String sql="delete from bbs39 where num="+num;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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






