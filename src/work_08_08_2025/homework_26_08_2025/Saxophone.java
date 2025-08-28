package work_08_08_2025.homework_26_08_2025;

public class Saxophone extends WindInstrument{
    public Saxophone(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        setMat("Металл"); // некорректное использование статической переменной, надо использовать как обычную переменную.
        setName("Саксофон Игорь"); // корректная замена значения.
        return super.toString();
    }


    @Override
    public void play() {
        System.out.println("Тупиду пиду пиду пау!");
    }
}
