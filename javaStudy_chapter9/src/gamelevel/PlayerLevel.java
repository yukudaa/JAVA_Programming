package gamelevel;

public abstract class PlayerLevel {

	// if를 사용하면 run(), jump(), turn(), ... 마다 반복문을 만들어야함
	// 그래서 상속을 사용해야함
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
