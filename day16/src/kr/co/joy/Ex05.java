package kr.co.joy;

public class Ex05 {

	public static void main(String[] args) {
		// CRUD (CreateReadUpdateDelete)
		StringBuffer sb1=new StringBuffer("abcd");
		sb1.append("efg");	// concat, +
		sb1.insert(1, "A");
		sb1.insert(sb1.length(), "G");
		sb1.delete(0, 3+1);
		sb1.replace(0, 4, "DEFG");
		System.out.println(sb1);
	}

}
