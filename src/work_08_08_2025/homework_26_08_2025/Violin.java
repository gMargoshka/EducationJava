package work_08_08_2025.homework_26_08_2025;

public class Violin extends StringInstrument{
    public Violin(String name, String type, int numberOfStrings) {
        super(name, type, numberOfStrings);
    }


    @Override
    public String toString() {
        return super.toString() + "\nКоличество струн:  " + numberOfStrings;
    }

    @Override
    public String getName() {
        return "Струнная " + super.getName(); //переопределяю метод getName т.к. добавляю в реализацию еще и текст именно для виолончели и вызываем super.getName - непереопределенный метод, а родительский.
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
