import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	private Player player1, player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() throws IOException {
		int randomNumber = (int)(Math.random() * 101);

		System.out.println("The game starting now! Try to guess the number!");

		while (true) {
			System.out.print(player1.getName() + " enter your number: ");
			player1.setNumber(Integer.parseInt(reader.readLine()));

			checkPlayerNumber(player1.getNumber(), randomNumber, player1.getName());
			if (player1.getNumber() == randomNumber) {
				break;
			}

			System.out.print(player2.getName() + " enter your number: ");
			player2.setNumber(Integer.parseInt(reader.readLine()));

			checkPlayerNumber(player2.getNumber(), randomNumber, player2.getName());
			if (player2.getNumber() == randomNumber) {
				break;
			}
		}
	}

	public static void checkPlayerNumber(int playerNumber, int randomNumber, String name) {
			if (playerNumber > 100 || playerNumber < 0) {
				System.out.println("Your number is not from 0 to 100. Try again!");
			} else if (playerNumber == randomNumber) {
				System.out.println(name + " you guessed the number!");
			} else if (playerNumber > randomNumber) {
				System.out.println("Your number is too big. Try again!");
			} else {
				System.out.println("Your number is too small. Try again!");
			}
	}
}