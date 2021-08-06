package kr.co.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TSender {

	public static void main(String[] args) {
		byte[] ip={127,0,0,1};
		int port =5000;
		String msg="1234567890";
		java.net.DatagramSocket sock=null;
		java.net.DatagramPacket pack=null;
		try {
			InetAddress addr=InetAddress.getByAddress(ip);
			sock=new DatagramSocket();
			pack=new DatagramPacket(msg.getBytes(), msg.length(),addr,port);
			sock.send(pack);
			
			pack=new DatagramPacket("abcdefghij".getBytes(), 10,addr,port);
			sock.send(pack);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null){sock.close();}
		}
	}

}
