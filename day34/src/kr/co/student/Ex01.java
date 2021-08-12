package kr.co.student;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 extends JFrame {
	TextField[] tfs=new TextField[5];
	oracle.jdbc.driver.OracleDriver driver=new OracleDriver();
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	java.util.Properties info=new Properties();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		info.setProperty("user", "scott");
		info.setProperty("password", "tiger");
		for(int i=0; i<tfs.length; i++){
			tfs[i]=new TextField();
		}
		contentPane = new JPanel();
		JPanel top = new JPanel();
		JPanel center = new JPanel();

		Button addBtn=new Button("입력");
		
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String num=tfs[0].getText();
				String name=tfs[1].getText();
				String kor=tfs[2].getText();
				String eng=tfs[3].getText();
				String math=tfs[4].getText();
				
				String sql="insert into stu01 values ("
				+num+",'"+name+"',"+kor+","+eng+","+math+")";
				
				Connection conn=null;
				Statement stmt=null;
				try {
					conn=DriverManager.getConnection(url, info);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				for(int i=0; i<tfs.length; i++){
					tfs[i].setText("");
					tfs[i].setText("");
				}
				
			}
		});
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		contentPane.add(top, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("\uB9AC\uC2A4\uD2B8");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				center.setLayout(new GridLayout(1,1));
				center.removeAll();
				TextArea ta=new TextArea();
				
				
				
				String sql="select num,name,kor,eng,math from stu01";
				java.sql.Connection conn=null;
				java.sql.Statement stmt=null;
				java.sql.ResultSet rs=null;
				try {
					conn=java.sql.DriverManager.getConnection(url, info);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()){
						ta.append(rs.getString(1));
						ta.append("\t");
						ta.append(rs.getString(2));
						ta.append("\t");
						ta.append(rs.getString(3));
						ta.append("\t");
						ta.append(rs.getString(4));
						ta.append("\t");
						ta.append(rs.getString(5));
						ta.append("\n");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				
				
				center.add(ta);
				center.revalidate();
			}
		});
		top.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("\uC785\uB825");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				center.removeAll();
				center.setLayout(new GridLayout(6,2));
				center.add(new Label("학번"));
				center.add(tfs[0]);
				center.add(new Label("이름"));
				center.add(tfs[1]);
				center.add(new Label("국어"));
				center.add(tfs[2]);
				center.add(new Label("영어"));
				center.add(tfs[3]);
				center.add(new Label("수학"));
				center.add(tfs[4]);
				center.add(new Label());
				center.add(addBtn);
				center.revalidate();
			}
		});
		top.add(btnNewButton_1);
		
		JButton button_1 = new JButton("\uC218\uC815");
		top.add(button_1);
		
		JButton btnNewButton_2 = new JButton("\uC0AD\uC81C");
		top.add(btnNewButton_2);
		
		JButton button = new JButton("\uC885\uB8CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		top.add(button);
		
		contentPane.add(center, BorderLayout.CENTER);
	}

}
