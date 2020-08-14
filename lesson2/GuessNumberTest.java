import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GuessNumberTest {

    public static boolean restartGame = true;
    public static boolean checkNumber = true;
    public static boolean checkGame = true;
    public static boolean checkPlayer = false;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (restartGame) {

            int randomNumber = (int) (Math.random() * 101);

            Player player1 = new Player();
            Player player2 = new Player();

            System.out.print("Player-1 enter your name: ");
            player1.setName(reader.readLine());

            System.out.print("Player-2 enter your name: ");
            player2.setName(reader.readLine());

            System.out.println("The game starting now! Try to guess the number!");

            while (checkNumber) {
                System.out.print(player1.getName() + " enter your number: ");
                player1.setNumber(Integer.parseInt(reader.readLine()));

                GuessNumber.checkPlayerNumber(player1.getNumber(), randomNumber, player1.getName());
                if (checkPlayer) {
                    checkNumber = false;
                    continue;
                }

                System.out.print(player2.getName() + " enter your number: ");
                player2.setNumber(Integer.parseInt(reader.readLine()));

                GuessNumber.checkPlayerNumber(player2.getNumber(), randomNumber, player2.getName());
                if (checkPlayer) {
                    checkNumber = false;
                }
            }

            while (checkGame) {
                System.out.print("Do you want to continue? [yes/no]: ");
                String scan = reader.readLine();
                if (scan.equals("no")) {
                    restartGame = false;
                    break;
                } else if (scan.equals("yes") || scan.isEmpty()) {
                    checkGame = false;
                    checkPlayer = false;
                }
            }
        }
    }
}
