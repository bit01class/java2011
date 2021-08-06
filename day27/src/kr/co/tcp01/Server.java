package kr.co.tcp01;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server extends Thread {
	static ArrayList<BufferedWriter> list=new ArrayList<>();
	Socket sock;
	
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	@Override
	public void run() {
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			while(true){
				String msg=br.readLine();
				if(msg!=null){
					for(int i=0; i<list.size(); i++){
						BufferedWriter bw = list.get(i);
						
						bw.write(msg);
						bw.newLine();
						bw.flush();
					}
				}
			}
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

	public static void main(String[] args) {
		
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(5000);
			while(true){
				Socket sock = serv.accept();
				Server client=new Server(sock);
				client.start();
				
				OutputStream os = sock.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(os);
				BufferedWriter bw=new BufferedWriter(osw);
				list.add(bw);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serv!=null){serv.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}












