package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();

	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비엇습니다.");
			return null;
		}
		return arrayQueue.remove(0);//remove랑 get이랑 다름, get은 주는데 사라지진 않음
	}								//remove는 주고 arrayList에서 사라짐
	
}

public class QueueTest {

	public static void main(String[] args) {
		

	}

}
