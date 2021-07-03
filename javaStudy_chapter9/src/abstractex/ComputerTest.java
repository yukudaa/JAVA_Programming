package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer();	//abstract이여서 오류
		
		Computer c2 = new DeskTop();	//상속의 관계랑 같음 upcasting
		
		//Computer c3 = new NoteBook();	//NoteBook 클래스도 abstract 를 가지고 있으니깐 생성 안됨
		
		Computer c4 = new MyNoteBook();
		c2.display();
		c4.display();
	}

}
