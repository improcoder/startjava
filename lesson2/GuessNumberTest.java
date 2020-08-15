import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GuessNumberTest {

    public static boolean restartGame = true;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (restartGame) {
            System.out.print("Player-1 enter your name: ");
            Player player1 = new Player(reader.readLine());

            System.out.print("Player-2 enter your name: ");
            Player player2 = new Player(reader.readLine());

            GuessNumber guessNumber = new GuessNumber(player1, player2);

            guessNumber.startGame();

            while (true) {
                System.out.print("Do you want to continue? [yes/no]: ");
                String scan = reader.readLine();
                if (scan.equals("no")) {
                    restartGame = false;
                    break;
                } else if (scan.equals("yes") || scan.isEmpty()) {
                    break;
                }
            }
        }
    }
}
