package kr.co.joy;

public class Ex02 {

	public static void main(String[] args) {
		try{
			int su;
			su=Integer.parseInt("-12.34");
			System.out.println(su);
		}catch(NumberFormatException err){
			System.out.println(err.getClass());
			System.out.println(err.getMessage());
			System.out.println(err.toString());
			err.printStackTrace();
		}

	}

}
