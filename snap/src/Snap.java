import java.util.Objects;
import java.util.Scanner;

public class Snap extends CardGame{
    public Snap(){
        Scanner scanner = new Scanner(System.in);

        shuffleDeck();
        System.out.println("Press ENTER key to draw a card");
        previousCard=dealFirstCard();

        while (alive=true){
            System.out.println("Current Player: ");
            currentCard=dealCard();
            removeCardFromDeck();

            scanner.nextLine();
            currentCard=dealCard();
            System.out.println("Previous card: "+previousCard.getSymbol()+" of "+previousCard.getSuit());
            System.out.println("Chosen card: "+currentCard.getSymbol()+" of "+currentCard.getSuit());

            if (Objects.equals(previousCard.getSymbol(), dealCard().getSymbol())){
                System.out.println("SNAP!!! You won!");
                alive=false;
                break;
            }
            if (getDeckOfCards().size() == 0){
                System.out.println("No cards left, you lost!");
                alive=false;
                break;
            }
            previousCard=currentCard;

            System.out.println("---------------------------------------------------------------------");
        }
    }
}
