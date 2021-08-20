package kr.co.tjoeun.bbs39;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class BbsList {
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="scott";
	private String password="tiger";		
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public ArrayList<BbsBean> getList(){
		ArrayList<BbsBean> list=new ArrayList<>();
		String sql="select num,sub,id,cnt from bbs39 order by num desc";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				BbsBean bean=new BbsBean();
				bean.setNum(rs.getInt(1));
				bean.setSub(rs.getString(2));
				bean.setId(rs.getString(3));
				bean.setCnt(rs.getInt(4));
				list.add(bean);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
		return list;
	}
	
	public BbsBean getOne(int num){
		BbsUpdate update=new BbsUpdate();
		update.cntPlus(num);
		
		BbsBean bean=new BbsBean();
		String sql="select num,nalja,id,cnt,sub,content from bbs39 where num="+num;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				bean.setNum(rs.getInt(1));
				bean.setNalja(rs.getDate(2));
				bean.setId(rs.getString(3));
				bean.setCnt(rs.getInt(4));
				bean.setSub(rs.getString(5));
				bean.setContent(rs.getString(6));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
		return bean;
	}

}







