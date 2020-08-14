public class Calculator {

	private int numberOne;
	private int numberTwo;
	private char operator;

	public static void calculateTheValue(int numberOne, int numberTwo, char operator) {
		switch (operator) {
			case '+':
				System.out.println(numberOne + numberTwo);
				break;
			case '-':
				System.out.println(numberOne - numberTwo);
				break;
			case '*':
				System.out.println(numberOne * numberTwo);
				break;
			case '/':
				System.out.println((double) numberOne / numberTwo);
				break;
			case '^':
				long exponent = 1;
				for (int i = 1; i <= numberTwo; i++) {
					exponent *= numberOne;
				}
				System.out.println(exponent);
				break;
			case '%':
				System.out.println(numberOne % numberTwo);
				break;
			default:
				System.out.println("Wrong math operator!");
		}
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public char getOperator() {
		return operator;
	}
}