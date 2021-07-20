package kr.co.joy;

class Tlinked{
	private class Node{
		int val;
		Node nxt;
	}
	private Node start;
	private int cnt;
	
	public int size(){
		return cnt;
	}
	
	public void add(int su){
		cnt++;
		Node node=new Node();
		node.val=su;
		/// 1
		if(cnt==1){
			start=node;
		}else{
			Node temp=start;
			while(true){
				if(temp.nxt==null){break;}
				temp=temp.nxt;
			}
			temp.nxt=node;
		}
	}
	
	public int get(int idx){
		Node temp=start;
		for(int i=0; i<idx; i++){
			temp=temp.nxt;
		}
		return temp.val;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Tlinked list=new Tlinked();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}









