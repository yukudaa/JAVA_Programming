package template;


public abstract class Car {
	
	public abstract void dirve();
	public abstract void stop();
	
	public abstract void wiper();
	
	//구현코드 필요 없음 , 정의만 된거임 , 재정의 필요없음
	public void washCar() {}
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//final을 사용하면 하위 클래스에선 재정의 불가
	//template메서드
	public final void run() {
		startCar();
		dirve();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
