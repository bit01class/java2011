package kr.co.joy;

public class Ex09 {
	
	static class Ball{
		private final int num;
		boolean marking;
		String color;
		public Ball(int num) {
			this.num=num;
			marking=false;
			if(num<10){
				color="파랑색";
			}else if(num<20){
				color="녹색";
			}else if(num<30){
				color="빨강색";
			}else if(num<40){
				color="노랑색";
			}else{
				color="검정색";
			}
		}
		public void checking(){
			marking=true;
		}
	}

	public static void main(String[] args) {
		// 로또번호 생성기 (ver 0.3.0)
		Ball[] box=new Ball[45];
		String[] note=new String[6];
		for(int i=0; i<box.length; i++){
			box[i]=new Ball(i+1);
		}
		for(int i=0; i<6; i++){
			int ran=(int)(Math.random()*box.length);
			Ball ball=box[ran];
			if(ball.marking){
				i--;
			}else{
				note[i]=ball.color+"공 "+ball.num+"번";
				ball.checking();
			}
		}
		// sort
		for(int i=0; i<note.length; i++){
			System.out.println(note[i]);
		}
	}

}












