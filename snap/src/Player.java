public class Player {
    public Boolean playerSwitch = true;
    public String currentPlayer;

    public String currentlyPlaying(){
        if (playerSwitch=true){
            currentPlayer="Player 1";
        } else if (playerSwitch=false) {
            currentPlayer="Player 2";
        }
        return currentPlayer;
    }
}
