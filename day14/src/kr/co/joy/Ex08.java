package kr.co.joy;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1=' ';
		Character ch2=new Character('A');
//		Character ch3=new Character(65);
		/////////�����ڵ�/////
		System.out.println(Character.isDefined(ch1));
		/////////����////////
		System.out.println(Character.isLetter(ch1));
		System.out.println(Character.isAlphabetic(ch1));
		/////////����////////
		System.out.println(Character.isDigit(ch1));
		/////////���ĺ�-(��,��)//////
		System.out.println(Character.isLowerCase(ch1));
		System.out.println(Character.isUpperCase(ch1));
		/////////����///////////
		System.out.println(Character.isSpace(ch1));
		System.out.println(Character.isWhitespace(ch1));
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
	}

}
