package kr.co.joy;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		// stack - LIFO (Last-In-First-Out)
		java.util.Stack stack=new Stack();
		stack.push("ù��°");
		stack.push("�ι�°");
		stack.push("����°");
		stack.push("�׹�°");
		
		while(!stack.empty()){
		System.out.println(stack.peek());
		stack.pop();
		}
	}

}










