package interfaceex;

public interface Calc {	//interface�� �ؼ� ���� �ȶ� 
	
	double PI = 3.14;	//�������̽����� ����� �߻�޼��尡 ����ȴ�
	int ERROR = -999999999;
	
	int add(int num1, int num2);	//interface�� �߻�޼��尡�� 
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
