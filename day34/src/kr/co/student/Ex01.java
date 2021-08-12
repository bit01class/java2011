package kr.co.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import oracle.jdbc.driver.OracleDriver;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Properties;

public class Ex01 extends JFrame {

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
		contentPane = new JPanel();
		JPanel top = new JPanel();
		JPanel center = new JPanel();
		
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
				
				oracle.jdbc.driver.OracleDriver driver;
				driver=new OracleDriver();
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				java.util.Properties info;
				info=new Properties();
				info.setProperty("user", "scott");
				info.setProperty("password", "tiger");
				
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
