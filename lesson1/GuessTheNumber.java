public class GuessTheNumber{
	public static void main(String[] args){
		int computerNum = 25;
		int playerNum = 25;

		while(true){
			if(playerNum > 100 || playerNum < 0){
				System.out.println("Your number is not from 0 to 100. Try again!");
			}
			else if(playerNum > computerNum){
				System.out.println("Your number is too big. Try again!");
			}
			else if(playerNum < computerNum){
				System.out.println("Your number is too small. Try again!");
			}
			else{
				System.out.println("You guessed the number!");
				break;
			}
		}
	}
}