package kr.co.joy;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list1.add(2,5);
		
		ArrayList list2=new ArrayList();
		list2.add("기존데이터");
		list2.addAll(list1);
		
		Object[] arr=list1.toArray();
		int[] arr2=new int[arr.length];
		for(int i=0; i<arr.length; i++){
			arr2[i]=(int)arr[i];
		}
		System.out.println(java.util.Arrays.toString(arr));
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
//		System.out.println(list1.contains(6));
//		System.out.println(list1.indexOf(6));
//		boolean boo=list1.remove("aaa");
	}

}
