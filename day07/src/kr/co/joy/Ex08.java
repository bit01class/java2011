package kr.co.joy;

public class Ex08{
	public int speed;
	public final int max;
	public final String model;
	public String color="";

	public Ex08(){
		model="동네 지나다니는 차";max=100;
	}
	public Ex08(int a){
		// 1.모닝 2. 아반떼 3. 그렌져 
		if(a==1){
			model="모닝 ";max=140;
		}else if(a==2){
			model="아반떼";max=150;
		}else if(a==3){
			model="그렌져";max=180;
		}else{model="동네 지나다니는 차";max=100;}
	}
	
	public Ex08(int a,String b){
		color=b;
		// 1.모닝 2. 아반떼 3. 그렌져 
		if(a==1){
			model="모닝 ";max=140;
		}else if(a==2){
			model="아반떼";max=150;
		}else if(a==3){
			model="그렌져";max=180;
		}else{model="동네 지나다니는 차";max=100;}
	}

	public void speedUp(int a){
		if(speed+a<=max){
			speed+=a;
		}else{
			speed=max;
		}
		System.out.println(color+model+"의 현재 속도 : "+speed+"km");
	}
	public void speedDown(int a){
		if(speed-a>=0){
			speed-=a;
		}else{
			speed=0;
		}
		System.out.println(color+model+"의 현재 속도 : "+speed+"km");
	}

	public static void main(String[] args){
		Ex08 car;
		car=new Ex08(1,"형광색 ");
		for(int i=0; i<50; i++){
			car.speedUp(i);
		}
	}
}












