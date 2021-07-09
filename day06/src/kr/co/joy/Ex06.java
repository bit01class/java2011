package kr.co.joy;
class Car06{
	public static int speed;
	public static int max=150;

	public static void speedUp(){
		if(speed+10<=max){
		speed+=10;
		}else{
		speed=max;
		}
	}
	public static void speedDown(){
		if(speed-13>=0){
		speed-=13;
		}else{
		speed=0;
		}
	}
	public static void showSpeed(){
		System.out.println("현재 속도는 "+speed+"km 입니다");
	}
}

public class Ex06{

  public static void main(String[] args){
	System.out.println("철수가 람보르기니를 뽑아서");
	Car06.max=300;
	Car06.showSpeed();
	Car06.speedUp();
	Car06.showSpeed();
	for(int i=0; i<35; i++){
		Car06.speedUp();
		Car06.showSpeed();
	}
	for(int i=0; i<36; i++){
		Car06.speedDown();
		Car06.showSpeed();
	}
  }

}