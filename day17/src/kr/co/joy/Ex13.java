package kr.co.joy;

public class Ex13 {

	public static void main(String[] args) {
		// set타입 (비선형 구조 - 순서x, 중복불허(중복값검사))
		java.util.Set set1=new java.util.HashSet();
//		System.out.println(set1.add("첫번째"));
//		System.out.println(set1.add("두번째"));
//		System.out.println(set1.add("세번째"));
//		System.out.println(set1.add("네번째"));
//		System.out.println(set1.add("두번째"));
		Ex14 ex=new Ex14(2);
		set1.add(new Ex14(1));
		set1.add(ex);
		set1.add(new Ex14(3));
		set1.add(ex);
		
		System.out.println(set1.size());
		
		java.util.Iterator ite= set1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
