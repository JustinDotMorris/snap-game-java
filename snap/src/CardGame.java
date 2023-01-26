import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    //variables---------------------------------------
    private String[] suits = {"heart♥","club♣","diamond♦","spade♠"};
    private String[] symbols = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    private ArrayList<Card> deckOfCards = new ArrayList<>();

    public CardGame(){
        //for each suit give a value
        for(int i=0;i < suits.length;i++){
            for (int j=0; j <symbols.length;j++){
                deckOfCards.add(new Card(suits[i],symbols[j],values[j]));
            }
        }
    }
    public ArrayList<Card> getDeckOfCards() {
        //return full deck of cards
        return deckOfCards;
    }
    public Object dealCard(){
        //return the top (first) card
        return deckOfCards.get(0);
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
            public int compare(Card c1, Card c2,Card c3,Card c4) {
                return Integer.valueOf(c1.getSuit()).compareTo(c2.getSuit());
            }
        })
    }

}
