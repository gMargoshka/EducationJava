package work_08_08_2025.homework_26_08_2025;

public class Flute extends WindInstrument{
    public Flute(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Название инструмента: " + name + " \nТип инструмента: " + type;
    }

    @Override
    public void play() {
        System.out.println("Фиу фиу фиу фиу!");
    }
}
