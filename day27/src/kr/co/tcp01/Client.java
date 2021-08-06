package kr.co.tcp01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;
import java.util.*;



public class Client extends Frame implements ActionListener {

	static BufferedWriter bw=null;
	
	public Client() {
		TextField tf=new TextField();
		tf.addActionListener(this);
		add(tf);
		setBounds(50,50,300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Client cl=new Client();
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		BufferedReader br=null;
		try {
			sock=new Socket("localhost",5000);
			
			is=sock.getInputStream();
			os=sock.getOutputStream();
			
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			
			while(true){
				String msg=br.readLine();
				
				System.out.println(msg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=e.getActionCommand();
		try {
			bw.write(msg);
			bw.newLine();
			bw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
