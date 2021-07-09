package kr.co.joy;

public class Ex07{
  public String color="쥐색";
  public String model="자동차";
  public int speed;
  public int max=150;

  public void speedUp(){
	if(speed+10<=max){
		speed+=10;
	}else{
		speed=max;
	}
  }

  public void speedDown(){
	if(speed-13>=0){	
		speed-=13;
	}else{
		speed=0;
	}
  }

  public void showSpeed(){
	System.out.println(color+model+"의 현재 속도는 "+speed+"km 입니다.");
  }

  public static void main(String[] args){
	Ex07 bongbong=null;
	bongbong=new Ex07();
	bongbong.model="모닝";
	bongbong.color="흰색";
	bongbong.max=140;

	bongbong.showSpeed();

	for(int i=0; i<20; i++){
		bongbong.speedUp();
		bongbong.showSpeed();
	}

	bongbong=new Ex07();
	bongbong.model="소나타";
	bongbong.color="검정색";
	bongbong.max=180;

	bongbong.showSpeed();

	for(int i=0; i<20; i++){
		bongbong.speedUp();
		bongbong.showSpeed();
	}

  }
}








