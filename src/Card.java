public class Card implements Comparable <Card> {
    public final int value;
    private final int suit;

    public static  String[] values = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

    public static  String[] suits = {String.valueOf('\u2663'), String.valueOf('\u2666'), String.valueOf('\u2764'), String.valueOf('\u2660')};

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }
    public int getSuit() {
        return suit;
    }

    public String toString() {
        return values[this.value] + " of " + suits[this.suit];
    }

    @Override
    public int compareTo(Card other) {
        return this.value - other.value;
    }
}