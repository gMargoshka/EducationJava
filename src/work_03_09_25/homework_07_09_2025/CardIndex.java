package work_03_09_25.homework_07_09_2025;

public enum CardIndex {
    SIX ("6"),
    SEVEN ("7"),
    EIGHT ("8"),
    NINE ("9"),
    TEN ("10"),
    JACK ("Валет"),
    QUEEN ("Дама"),
    KING ("Король"),
    ACE ("Туз");

    private String index;

    CardIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
}
