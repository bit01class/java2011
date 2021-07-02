class Ex02{

 public static void main(String[] args){
	float su1;		//4byte
	double su2;	//8byte
	su1=3.14F;
	su2=3.14;
	su1=(float)su2;
	System.out.println(su1);
	System.out.println(su2);
	int su3=1;	//4byte
	long su4=2;	//8byte
	su2=su3;
	System.out.println(su2);
	su2=su4;
	System.out.println(su2);
	su4=(long)su1;
	System.out.println(su4);
 }

}






