public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		String sex = "Man";
		double height = 1.85;
		String firstNameLetter = "M";

		if (age > 20) {
			System.out.println("Your age > 20");
		}

		if (sex.equals("Man")) {
			System.out.println("You are Man!");
		}
	
		if (!sex.equals("Man")) {
			System.out.println("You are not Man!");
		}

		if (height < 1.80) {
			System.out.println("You are Football-Man!");
		} else {
			System.out.println("You are Basketball-Man!");
		}

		if (firstNameLetter.equals("M")) {
			System.out.println("May be you are Matvey?");
		} else if (firstNameLetter.equals("N")) {
			System.out.println("May be you are Nikita?");
		} else {
			System.out.println("Who are you Man?");
		}
	}
}