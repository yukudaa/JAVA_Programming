package staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; //��������
		i++;
		System.out.println(i);
		
		//studentName = "ȫ�浿"; //�������, �ν��Ͻ� ����
		//static�޼��忡���� �ν��Ͻ� ���� ��� �Ұ�
		
		return serialNum; //static����, Ŭ��������
	}

	/*public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}*/ //�������Ը� ��
	
}
