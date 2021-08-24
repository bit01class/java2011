package kr.co.tjoeun.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kr.co.tjoeun.bean.BbsDto;
import kr.co.tjoeun.util.DockerOracle;

public class BbsDao {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public void readd(BbsDto bean) throws SQLException{
		String sql1="update bbs01 set lvl=lvl+1 where ord="+bean.getOrd()
					+" and lvl>="+bean.getLvl();
		String sql2="insert into bbs01 values (bbs01_seq.nextval,'"+bean.getName()
				+"','"+bean.getSub()+"','"+bean.getContent()+"',sysdate,"
				+bean.getOrd()+","+bean.getLvl()+","+bean.getDep()+")";
		System.out.println(sql2);
		try{
			conn=DockerOracle.getConnection();
			stmt=conn.createStatement();
			stmt.executeUpdate(sql1);
			stmt.close();
			stmt=conn.createStatement();
			stmt.executeUpdate(sql2);
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
	}
	
	public BbsDto getOne(BbsDto bean) throws SQLException{
		String sql="select * from bbs01 where num="+bean.getNum();
		try{
			conn=DockerOracle.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next()){
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setName(rs.getString("name"));
				bean.setSub(rs.getString("sub"));
				bean.setOrd(rs.getInt("ord"));
				bean.setLvl(rs.getInt("lvl"));
				bean.setDep(rs.getInt("dep"));
			}
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		return bean;
	}
	
	public void insertOne(BbsDto bean) throws SQLException{
		String sql="insert into bbs01 values (bbs01_seq.nextval,'"
					+bean.getName()+"','"+bean.getSub()
					+"','"+bean.getContent()+"',sysdate)";
		try{
			conn=DockerOracle.getConnection();
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
	}

	public ArrayList<BbsDto> getList() throws SQLException{
		ArrayList<BbsDto> list=new ArrayList<BbsDto>();
		String sql="select * from bbs01 order by ord desc, lvl desc";
		try{
			conn=DockerOracle.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				BbsDto bean=new BbsDto();
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setSub(rs.getString("sub"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setOrd(rs.getInt("ord"));
				bean.setLvl(rs.getInt("lvl"));
				bean.setDep(rs.getInt("dep"));
				list.add(bean);
			}
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
}



