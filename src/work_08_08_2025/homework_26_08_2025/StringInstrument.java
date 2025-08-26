package work_08_08_2025.homework_26_08_2025;

public abstract class StringInstrument extends Instrument implements Tunable, Playable {
    protected int numberOfStrings;

    public StringInstrument(String name, String type, int numberOfStrings) {
        super(name, type);
        this.numberOfStrings=numberOfStrings;
    }
}
