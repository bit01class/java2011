package kr.co.joy;

import java.util.LinkedList;

public class Ex10 {

	public static void main(String[] args) {
		// deque
		java.util.Deque dq=new LinkedList();
		// head -> head
		dq.offerFirst("ù��°");
		dq.offerFirst("�ι�°");
		dq.offerFirst("����°");
		dq.offerFirst("�׹�°");
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		
		// head -> tail
		dq.offerFirst("ù��°");
		dq.offerFirst("�ι�°");
		dq.offerFirst("����°");
		dq.offerFirst("�׹�°");
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
		
		
		//tail -> head
		dq.offerLast("ù��°");
		dq.offerLast("�ι�°");
		dq.offerLast("����°");
		dq.offerLast("�׹�°");
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq.peekFirst());
		dq.pollFirst();

		//tail -> tail
		dq.offerLast("ù��°");
		dq.offerLast("�ι�°");
		dq.offerLast("����°");
		dq.offerLast("�׹�°");
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
		System.out.println(dq.peekLast());
		dq.pollLast();
	}
}












