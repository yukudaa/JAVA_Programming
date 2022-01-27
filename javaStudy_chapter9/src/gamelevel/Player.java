package gamelevel;

public class Player {

	// level_1, level_2, level_3를 사용해도 이상함
	private PlayerLevel level; // 이렇게 사용해야 깔끔

	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgrageLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}

}
