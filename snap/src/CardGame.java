import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {

    private String[] suits = {"hearts ♥","clubs ♣","diamonds ♦","spades ♠"};
    private String[] symbols = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    public Card currentCard;
    public Card previousCard;
    public boolean alive = true;

    public Card firstCard;

    public CardGame(){
        //for each suit give a value
        for(int i=0;i < suits.length;i++){
            for (int j=0; j <symbols.length;j++){
                deckOfCards.add(new Card(suits[i],symbols[j],values[j]));
            }
        }
    }
    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }
    public Card dealFirstCard(){
        firstCard=deckOfCards.get(1);
        deckOfCards.remove(1);
        return firstCard;
    }

    public Card dealCard(){
        currentCard = deckOfCards.get(0);
        return currentCard;
    }

    public void removeCardFromDeck(){
        deckOfCards.remove(0);
    }

    public Object sortDeckInNumberOrder(){
        Collections.sort(deckOfCards, new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                return Integer.valueOf(c1.getValue()).compareTo(c2.getValue());
            }
        });
        return deckOfCards;
    }
    public  Object sortDeckIntoSuits(){
        Collections.sort(deckOfCards, new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                return (c1.getSuit()).compareTo(c2.getSuit());
            }
        });
        return deckOfCards;
    }

    public Object shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

}
