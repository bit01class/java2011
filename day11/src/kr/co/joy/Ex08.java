package kr.co.joy;

public class Ex08 {

	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		Object obj2=obj;
		Object obj3=new Object();
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		System.out.println(obj==obj3);
		System.out.println(obj.equals(obj3));
		
		Ex08 me=new Ex08();
		Ex08 you=new Ex08();
		System.out.println(me==you);
		System.out.println(me.equals(you));
	}

}
