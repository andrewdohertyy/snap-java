import java.util.Scanner;

public class Player {
    public static boolean twoPlayer;
    public void startTwoPlayerGame() {

        Deck deck = new Deck();
        String playerOneCard;
        String playerTwoCard;

        System.out.println("-----------------------Rules-----------------------");
        System.out.println("Player 1 click enter to pick up a random card from the deck");
        System.out.println("player 2 you can pick up the second card by clicking enter");
        System.out.println("When a number is matched you have 2 seconds to type 'snap' to win and beat your opponent, so be quick!");

        deck.shuffleDeck();

        System.out.println("The deck is shuffled... click enter to start");

        Scanner scanner = new Scanner(System.in);

        while (!twoPlayer) {

            scanner.nextLine();
            playerOneCard = String.valueOf(deck.removeTopCard());
            System.out.println(playerOneCard);
            System.out.println("-------------------------------");
            scanner.nextLine();
            playerTwoCard = String.valueOf(deck.removeTopCard());
            System.out.println(playerTwoCard);
            System.out.println("-------------------------------");

            if (playerOneCard.substring(0, 1).equals(playerTwoCard.substring(0, 1))) {
                long startTime = System.currentTimeMillis();
                String snap = scanner.next();
                long stopTime = System.currentTimeMillis();
                long reactionTime = stopTime - startTime;
                if (snap.equals("snap") && reactionTime < 2000) {
                    twoPlayer = true;
                    System.out.println("SNAP!!!");
                    System.out.println("You win");
                }
                if (deck.deckLength() == 0) {
                    deck.shuffleDeck();
                    System.out.println("End of the deck, re-shuffling");
                    startTwoPlayerGame();
                }
            }
        }
    }
}
