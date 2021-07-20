package kr.co.joy;

public class Ex07 {

	public static void main(String[] args) {
		// StringBufferÀÇ bufferÇÒ´ç(16->34->70->142...)
		StringBuffer sb1=new StringBuffer();
		for(int i=0; i<40; i++){
			sb1.append('a');
		}
		sb1.trimToSize();
		sb1.append("b");
		sb1.setLength(3);
		System.out.println(sb1);
		System.out.println(sb1.capacity());

	}

}
