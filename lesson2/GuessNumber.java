public class GuessNumber {

	public static void checkPlayerNumber(int playerNumber, int randomNumber, String name) {

			if (playerNumber > 100 || playerNumber < 0) {
				System.out.println("Your number is not from 0 to 100. Try again!");
			} else if (playerNumber == randomNumber) {
				System.out.println(name + " you guessed the number!");
				GuessNumberTest.checkPlayer = true;
			} else if (playerNumber > randomNumber) {
				System.out.println("Your number is too big. Try again!");
			} else {
				System.out.println("Your number is too small. Try again!");
			}
	}
}