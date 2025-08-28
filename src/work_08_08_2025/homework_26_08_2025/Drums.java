package work_08_08_2025.homework_26_08_2025;

public class Drums extends Instrument implements Playable{
    public Drums(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Название инструмента: " + getName() + " \nТип инструмента: " + getType();
    }

    @Override
    public void play() {
        System.out.println("Бум бам Бух!");
    }
}
