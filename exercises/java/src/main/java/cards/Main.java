package cards;

public class Main {
    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.createDeck();
        String[] allCards = cards.dealCards();
        for (String card: allCards){
            System.out.println(card);
        }
    }
}
