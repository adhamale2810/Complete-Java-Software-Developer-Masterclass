package Section_7.Encapsulation;

public class Main {
	public static void main(String[] args) {
		// Player player = new Player();
		// player.name = "Tim";
		// player.weapon = "Knife";
		// player.health = 20;

		// player.loseHealth(10);
		// System.out.println("Health: " + player.healthRemaining());
		// player.loseHealth(10);
		// System.out.println("Health: " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer(200,"Tim", "Knife");
		System.out.println("Initial health: " + player.getHealth());
	}
}