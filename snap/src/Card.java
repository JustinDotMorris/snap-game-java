import java.util.Arrays;

public class Card{
    //variables---------------------------------------
    private String suit;
    private String symbol;
    private int value;

    public Card(String suit,String symbol,int value){
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    //constructors-----------------------------------

    //Getters & Setters------------------------------

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    //methods----------------------------------------


    //toString

    @Override
    public String toString() {
        return "Cards{" +
                "suit=" + suit +
                ", symbol=" + symbol +
                ", value=" + value +
                '}';
    }


    //black
    //spade=♠
    //club=♣
    //diamond=♦
    //heart=♥
    //Red
    //spade=♤
    //club=♧
    //diamond=♢
    //heart=♡
    //    public String[] symbol={"♣","♠","♦","♥","♧","♤","♢","♡"};
}
