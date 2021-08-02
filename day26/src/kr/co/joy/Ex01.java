package kr.co.joy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		// 네트워크 4단계 모델 - 인터넷계층
		// 0.0.0.0~255.255.255.255
		java.net.InetAddress addr1=null;
		InetAddress[] addrs=null;
		byte[] arr=new byte[]{(byte)223,(byte)130,(byte)195,95};
		try {
//			addr1=InetAddress.getByName("www.naver.com");
			addr1=InetAddress.getByAddress(arr);
			System.out.println(addr1.getHostAddress());
			System.out.println(addr1.getCanonicalHostName());
			System.out.println(addr1.getHostName());
			System.out.println("-------------------------------");
			addrs=InetAddress.getAllByName("www.naver.com");
			for(int i=0; i<addrs.length; i++){
				System.out.println(addrs[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
