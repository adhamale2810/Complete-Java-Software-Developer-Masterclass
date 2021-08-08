package Section_7.Encapsulation;

public class EnhancedPlayer {
	private int health = 100;
	private String name;
	private String weapon;

	public EnhancedPlayer(int health, String name, String weapon) {
		this.name = name;
		if (health > 0 && health <= 100) {
			this.health = health;
		}
		this.weapon = weapon;
	}

	public void loseHealth(int damage) {
		this.health -= damage;
		if (health <= 0) {
			System.out.println("KO");
		}
	}

	public int getHealth() {
		return health;
	}
}