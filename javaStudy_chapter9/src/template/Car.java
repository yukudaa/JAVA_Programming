package template;


public abstract class Car {
	
	public abstract void dirve();
	public abstract void stop();
	
	public abstract void wiper();
	
	//�����ڵ� �ʿ� ���� , ���Ǹ� �Ȱ��� , ������ �ʿ����
	public void washCar() {}
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//final�� ����ϸ� ���� Ŭ�������� ������ �Ұ�
	//template�޼���
	public final void run() {
		startCar();
		dirve();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
