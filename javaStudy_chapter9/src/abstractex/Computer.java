package abstractex;

public abstract class Computer {

	public abstract void display(); // {}�� �־ �����θ� ����ų� abstract�� �־��
									// abstract �޼���� -> �߻�Ŭ����
									// ���� Ŭ�������� �����ؾ���
	public abstract void typing();

	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
