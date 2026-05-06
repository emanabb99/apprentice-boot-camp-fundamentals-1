package cards;

public class Cards {
    PlayingCard[] deck = new PlayingCard[52];

    public void createDeck() {
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Suit suits = new Suit(suit);
                PlayingCard playingCard = new PlayingCard(suits, faceValue);
                deck[suit * 13 + faceValue] = playingCard;
            }
        }
    }

    public String[] dealCards() {
        int cardNumber = 0;
        String[] result = new String[52];

        for (PlayingCard card : deck) {
            String faceValueName;
            if (card.faceValue == 0) {
                faceValueName = "ace";
            }
            else if (card.faceValue == 10) {
                faceValueName = "jack";
            }
            else if (card.faceValue == 11) {
                faceValueName = "queen";
            }
            else if (card.faceValue == 12) {
                faceValueName = "king";
            }
            else {
                faceValueName = Integer.toString(card.faceValue+1);
            }
            result[cardNumber] = faceValueName + " of " + card.suitToString();
            cardNumber++;
        }
        return result;
    }

    public String seeTopCard() {
        String [] result = dealCards();
        return result[0];
    }
}
