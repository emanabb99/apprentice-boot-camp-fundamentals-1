package cards;

public class PlayingCard {
    Suit suit;
    int faceValue;

    public PlayingCard(Suit suit, int faceValue){
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String suitToString(){
        return suit.name;
    }

}
