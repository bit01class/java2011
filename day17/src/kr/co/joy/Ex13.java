package kr.co.joy;

public class Ex13 {

	public static void main(String[] args) {
		// setŸ�� (���� ���� - ����x, �ߺ�����(�ߺ����˻�))
		java.util.Set set1=new java.util.HashSet();
//		System.out.println(set1.add("ù��°"));
//		System.out.println(set1.add("�ι�°"));
//		System.out.println(set1.add("����°"));
//		System.out.println(set1.add("�׹�°"));
//		System.out.println(set1.add("�ι�°"));
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
