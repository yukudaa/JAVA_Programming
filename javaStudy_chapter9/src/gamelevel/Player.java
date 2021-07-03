package gamelevel;

public class Player {

	// level_1, level_2, level_3�� ����ص� �̻���
	private PlayerLevel level; // �̷��� ����ؾ� ���

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
