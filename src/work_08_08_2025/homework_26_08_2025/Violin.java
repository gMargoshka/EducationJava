package work_08_08_2025.homework_26_08_2025;

public class Violin extends StringInstrument{
    public Violin(String name, String type, int numberOfStrings) {
        super(name, type, numberOfStrings);
    }

    @Override
    public String toString() {
        return "Название инструмента: " + name + " \nТип инструмента: " + type + " \nКоличество струн:  " + numberOfStrings;
    }


    @Override
    public void tune() {
        System.out.println("Я виолончель. Настрой меня полностью!");
    }

    @Override
    public void play() {
        System.out.println("Виу Вииииууу!");
    }
}
