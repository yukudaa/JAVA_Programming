package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer();	//abstract�̿��� ����
		
		Computer c2 = new DeskTop();	//����� ����� ���� upcasting
		
		//Computer c3 = new NoteBook();	//NoteBook Ŭ������ abstract �� ������ �����ϱ� ���� �ȵ�
		
		Computer c4 = new MyNoteBook();
		c2.display();
		c4.display();
	}

}
