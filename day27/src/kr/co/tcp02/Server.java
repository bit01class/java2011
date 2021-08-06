package kr.co.tcp02;

import java.util.ArrayList;
import java.io.*;
import java.net.*;

public class Server extends Thread{
	static ArrayList<Socket> list=new ArrayList<>();
	int idx;
	
	@Override
	public void run() {
		Socket sock=list.get(idx);
		InputStream is =null;
		BufferedReader br=null;
		try {
			is= sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			while(true){
				
				String msg=null;
				msg=br.readLine();
				System.out.println("server:"+msg);
				for(int i=0; i<list.size(); i++){
					Socket temp = list.get(i);
					if(temp!=null){
						BufferedWriter bw = new BufferedWriter(
											new OutputStreamWriter(
													temp.getOutputStream()));
						bw.write(msg);
						bw.newLine();
						bw.flush();
					}
				}
			}
		} catch (IOException e) {
			list.set(idx, null);
		}
	}

	public static void main(String[] args) {
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(5000);
			
			while(true){
				Socket sock=serv.accept();
				Server client=new Server();
				client.start();
				list.add(sock);
				client.idx=list.size()-1;
			}
			
		} catch (IOException e) {
			try {
				if(serv!=null){serv.close();}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}





