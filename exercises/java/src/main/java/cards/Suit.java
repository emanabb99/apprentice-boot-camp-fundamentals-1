package cards;

public class Suit {
    String name;

    public Suit(int suit){
        switch(suit){
            case(0): this.name = "clubs";
            break;
            case(1): this.name = "diamonds";
            break;
            case(2): this.name = "hearts";
            break;
            case(3): this.name = "spades";
            break;
        }
    }
}
