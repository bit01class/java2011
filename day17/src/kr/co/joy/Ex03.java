package kr.co.joy;

public class Ex03 {

	public static void main(String[] args) {
		// list - ArrayList
		
		java.util.ArrayList list=new java.util.ArrayList();
//		list.add(1111);
//		list.add(3.14);
//		list.add('@');
//		list.add(true);
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		
		for(int i=0; i<list.size(); i++){
			String obj=(String)list.get(i);
			System.out.println(obj);
		}

	}

}
