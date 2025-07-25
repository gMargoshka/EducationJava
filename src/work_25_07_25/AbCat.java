package work_25_07_25;

public class AbCat extends AbAnimal implements Animal,Vehicle{
    @Override
    public void voice() {
        System.out.println("мяу");
    }

    @Override
    public void run() {
        System.out.println("slow");
    }

    @Override
    public void eat() {

    }
}
