package kr.co.arr01;

import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		ArrayList<Double> list1=new ArrayList<>();
		list1.add(1.0);
		list1.add(2.2);
		list1.add(3.3);
		list1.add(4.4);
		
		list1.set(2, 3.0);
		list1.remove(2);
		System.out.println(list1.get(2));
		System.out.println(list1);
	}

}
