package work_08_08_2025;

public class Elephant extends Animal{

    public Elephant(int age, String name){
        super(age,name);
    }

    @Override
    public void makeSound() {
        System.out.println("Уууу!");
    }

    @Override
    public void eat() {
        System.out.println("Чав чав!");

    }
}
