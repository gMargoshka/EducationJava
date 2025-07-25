package work_25_07_25;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("гаф");
    }

    @Override
    public void run() {
        System.out.println("Очень быстро");
    }

    @Override
    public void eat() {
        System.out.println("Хрум-хрум");
    }
}
