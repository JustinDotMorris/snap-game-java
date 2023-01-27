public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        System.out.println(cardGame.getDeckOfCards());
        System.out.println(cardGame.dealCard());
        System.out.println(cardGame.sortDeckInNumberOrder());
        System.out.println(cardGame.sortDeckIntoSuits());
        System.out.println(cardGame.shuffleDeck());
    }
}