package work_03_09_25.homework_07_09_2025;

public enum CardSuit {
    HEARTS ("Черви"),
    SPADES ("Пики"),
    CLUBS ("Трефы"),
    DIAMONDS ("Бубы");

    private String suit;

    CardSuit(String suit) {
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }
}
