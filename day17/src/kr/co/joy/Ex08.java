package kr.co.joy;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		// Queue (선입선출) - FIFO (First-In-First-Out)
		java.util.Queue que=new LinkedList();
		que.offer("첫번째");
		que.offer("두번째");
		que.offer("세번째");
		que.offer("네번째");
		
		while(que.peek()!=null){
			System.out.println(que.poll());
		}
		
//		String msg=null;
//		while((msg=(String)que.poll())!=null){
//			System.out.println(msg);
//		}
	}

}
