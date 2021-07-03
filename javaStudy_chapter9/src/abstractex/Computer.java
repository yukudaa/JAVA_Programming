package abstractex;

public abstract class Computer {

	public abstract void display(); // {}를 넣어서 구현부를 만들거나 abstract를 넣어라
									// abstract 메서드다 -> 추상클래스
									// 하위 클래스에서 구현해야함
	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
