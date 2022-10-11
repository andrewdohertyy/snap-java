import java.util.Scanner;

public class PlayerChoice {
    public void chooseNumOfPlayers() {

        boolean numChoice = false;

        System.out.println("Enter number 1 for a single player game");
        System.out.println("Enter number 2 for a multiplayer game");

        while (!numChoice) {

            Scanner scannerMain = new Scanner(System.in);
            String playerNum = scannerMain.nextLine();

            if (playerNum.equals("1")) {
                Snap snap = new Snap();
                snap.startSnap();
                numChoice = true;
            } else if (playerNum.equals("2")) {
                Player player = new Player();
                player.startTwoPlayerGame();
                numChoice = true;
            }
        }
    }
}
