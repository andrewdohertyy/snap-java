import java.util.*;

public class Deck {

    public ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private final Card[] cards;
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 13; j++) {
                this.cards[index] = new Card(j, i);
                index++;
                deckOfCards.add(new Card(j,i));
            }
        }
    }

    public String toString() {
        return Arrays.toString(this.cards);
    }

    public Card dealCard(){
        return deckOfCards.get(51);
    }

    public Card removeTopCard(){
        return deckOfCards.remove(deckOfCards.toArray().length -1);
    }

    public ArrayList<Card> sortDeckIntoSuitOrder(){
        Collections.sort(this.deckOfCards, Comparator.comparing(Card::getSuit));
        return this.deckOfCards;
    }
    public ArrayList<Card> sortDeckIntoNumberOrder(){
        Collections.sort(this.deckOfCards, Comparator.comparingInt(Card::getValue));
        return this.deckOfCards;
    }

    public ArrayList<Card> shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

    public int deckLength() {
        return deckOfCards.size();
    }
}