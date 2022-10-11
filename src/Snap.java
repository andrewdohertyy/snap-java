import java.util.Scanner;

public class Snap {

    public static boolean match;

    public void startSnap() {

        Deck deck = new Deck();
        String card2;
        String card1;

        System.out.println("-----------------------Rules-----------------------");
        System.out.println("Click enter to pick up a random card from the deck");
        System.out.println("When a number is matched the game is over and the player wins");

        deck.shuffleDeck();
        System.out.println("The deck is shuffled... click enter to start");

        Scanner scanner = new Scanner(System.in);

        while (!match) {

            scanner.nextLine();
            card1 = String.valueOf(deck.removeTopCard());
            System.out.println(card1);
            scanner.nextLine();
            card2 = String.valueOf(deck.removeTopCard());
            System.out.println(card2);

            if (card1.substring(0, 1).equals(card2.substring(0, 1))) {
                match = true;
                System.out.println("SNAP!!!");
                System.out.println("You win");
            }
            if (deck.deckLength() == 0){
                deck.shuffleDeck();
                System.out.println("End of the deck, re-shuffling");
                startSnap();
            }
        }
    }
}
