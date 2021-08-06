package kr.co.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class TReceiver {

	public static void main(String[] args) {
		byte[] buf=new byte[10];
		DatagramSocket sock=null;
		DatagramPacket pack=null;
		try {
			sock=new DatagramSocket(5000);
			pack=new DatagramPacket(buf, buf.length);
			System.out.println("받기 위해 대기중...");
			sock.receive(pack);
			System.out.println("받았음");
			byte[] result = pack.getData();
			System.out.println(new String(result));
			
			pack=new DatagramPacket(buf, buf.length);
			System.out.println("받기 위해 대기중...");
			sock.receive(pack);
			System.out.println("받았음");
			result = pack.getData();
			System.out.println(new String(result));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(sock!=null){sock.close();}
		}

	}

}
