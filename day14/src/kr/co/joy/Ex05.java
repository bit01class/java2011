package kr.co.joy;

public class Ex05 {

	public static void main(String[] args) {
		// Double
		double su1=3.14;
		Double su2=new Double(3.14);
		Double su3=new Double("3.14");
		
		System.out.println(su2);
		System.out.println(su3);
		double su4=Double.parseDouble("3.14");
		System.out.println(su4);
		double su5=Double.POSITIVE_INFINITY; 	//1.0/0.0;
		double su6=Double.NaN;					//0.0/0.0;
		System.out.println("-----------------------");
		System.out.println(Double.isInfinite(su5));
		System.out.println(Double.isNaN(su5));
		System.out.println(Double.isInfinite(su6));
		System.out.println(Double.isNaN(su6));
	}

}






