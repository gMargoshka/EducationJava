package work_03_09_25.homework_07_09_2025;

public class Card {
    private CardIndex cardIndex;
    private CardSuit cardSuit;

    public Card(CardIndex cardIndex, CardSuit cardSuit) {
        this.cardIndex = cardIndex;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return "Карта: " + cardIndex.getIndex() + " " + cardSuit.getSuit();
    }


}
