package Section_4;

public class IfElse {
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		// if(score < 5000 && score > 1000){
		// System.out.println("Your Score was less than " + score + "but greater than
		// 1000");
		// }
		// else if(score < 1000){
		// System.out.println("Your Score was less than 1000");
		// }
		// else{
		// System.out.println("Into the Else Part");
		// }

		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Final Score: " + finalScore);
		}

		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("New Final Score: " + finalScore);
	}
}