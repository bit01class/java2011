package kr.co.joy;
/*
Q1.
★★★
★★
★
Q2.
  ★
 ★★
★★★
Q3.
가위 바위 보 게임 (ver 0.0.1)
가위(1),바위(2),보(3),종료(0)>>>1
com : 바위 , you : 가위
졌습니다(0승0무1패)

가위(1),바위(2),보(3),종료(0)>>>1
com : 보 , you : 가위
이겼습니다(1승0무1패)

가위(1),바위(2),보(3),종료(0)>>>0
 총 전적 1승0무1패
이용해 주셔서 감사합니다


*/
public class Ex13{

  public static void main(String[] args){
	System.out.println("★★★");
	System.out.println("★★");
	System.out.println("★");
	System.out.println("--------------------------");
	int su=3;	
	for(int j=2; j>=0; j--){
	for(int i=0; i<3; i++){
		if(i<j){System.out.print('★');}
		else{System.out.print('@');}
        }
	System.out.println();
	su--;
	}
	System.out.println("--------------------------");
	System.out.println("@@★");
	System.out.println("@★★");
	System.out.println("★★★");
	System.out.println("--------------------------");
	su=2;
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			if(j<su){System.out.print(' ');
			}else{System.out.print('★');}
		}
		su--;
		System.out.println();
	}
  }

}








