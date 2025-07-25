package work_25_07_25;

public abstract class AbAnimal {

    protected String name;
    protected int age;

    protected abstract void voice();
    protected abstract void run();

    protected void eat() {

        System.out.println("Хрум!");
    }

}
