package kr.co.joy;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		// stack - LIFO (Last-In-First-Out)
		java.util.Stack stack=new Stack();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		
		while(!stack.empty()){
		System.out.println(stack.peek());
		stack.pop();
		}
	}

}










