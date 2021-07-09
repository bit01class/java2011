package kr.co.joy;

public class Ex09 {
	public static void find(String msg,int start,int end){
		char[] arr=msg.toCharArray();
		char[] target=new char[end-start];	//2,3
		for(int i=start; i<end; i++){		//4,6
			target[i-start]=arr[i];		//6,9
		}
		String result=new String(target);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// arg 첫번째  0,1,2,3,4
		// arg 두번째  1,2,3,4,5
		
		String st1="JavaDBWebFramwork";
		find(st1,4,6);
		System.out.println(st1.substring(4, 6));
		
	}

}
