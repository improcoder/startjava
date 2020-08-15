import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		boolean restartGame = true;

		while (restartGame) {
			Scanner scanner = new Scanner(System.in);
			Calculator calculator = new Calculator();

			System.out.print("Enter the first number: ");
			calculator.setNumberOne(scanner.nextInt());

			System.out.print("Enter math operator: ");
			calculator.setMathSign(scanner.next().charAt(0));

			System.out.print("Enter the second number: ");
			calculator.setNumberTwo(scanner.nextInt());

			System.out.print("Calculation result: ");
			calculator.calculate();

			boolean checkGame = true;

			while (checkGame) {
				System.out.print("Do you want to continue? [yes/no]: ");
				String scan = scanner.next();
				if (scan.equals("no")) {
					restartGame = false;
					break;
				} else if (scan.equals("yes") || scan.isEmpty()) {
					checkGame = false;
				}
			}
		}
	}
}