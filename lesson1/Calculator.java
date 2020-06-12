public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		char operator = '^';

		if (operator == '+') {
			System.out.println(a + b);
		} else if (operator == '-') {
			System.out.println(a - b);
		} else if (operator == '*') {
			System.out.println(a * b);
		} else if (operator == '/') {
			System.out.println((double)a / b);
		} else if (operator == '^') {
			long exponent = 1;
			for (int i = 1; i <= b; i++) {
				exponent *= a;
			}
			System.out.println(exponent);
		} else if (operator == '%') {
			System.out.println(a % b);
		}
	}
}