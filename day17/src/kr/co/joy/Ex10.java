package kr.co.joy;

import java.util.LinkedList;

public class Ex10 {

	public static void main(String[] args) {
		// deque
		java.util.Deque dq=new LinkedList();
		// head -> head
		dq.offerFirst("첫번째");
		dq.offerFirst("두번째");
		dq.offerFirst("세번째");
		dq.offerFirst("네번째");
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
		dq.offerFirst("첫번째");
		dq.offerFirst("두번째");
		dq.offerFirst("세번째");
		dq.offerFirst("네번째");
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
		dq.offerLast("첫번째");
		dq.offerLast("두번째");
		dq.offerLast("세번째");
		dq.offerLast("네번째");
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
		dq.offerLast("첫번째");
		dq.offerLast("두번째");
		dq.offerLast("세번째");
		dq.offerLast("네번째");
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












