package kr.co.joy;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		// Queue (���Լ���) - FIFO (First-In-First-Out)
		java.util.Queue que=new LinkedList();
		que.offer("ù��°");
		que.offer("�ι�°");
		que.offer("����°");
		que.offer("�׹�°");
		
		while(que.peek()!=null){
			System.out.println(que.poll());
		}
		
//		String msg=null;
//		while((msg=(String)que.poll())!=null){
//			System.out.println(msg);
//		}
	}

}
