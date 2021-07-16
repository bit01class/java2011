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
				color="�Ķ���";
			}else if(num<20){
				color="���";
			}else if(num<30){
				color="������";
			}else if(num<40){
				color="�����";
			}else{
				color="������";
			}
		}
		public void checking(){
			marking=true;
		}
	}

	public static void main(String[] args) {
		// �ζǹ�ȣ ������ (ver 0.3.0)
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
				note[i]=ball.color+"�� "+ball.num+"��";
				ball.checking();
			}
		}
		// sort
		for(int i=0; i<note.length; i++){
			System.out.println(note[i]);
		}
	}

}












