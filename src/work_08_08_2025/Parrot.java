package work_08_08_2025;

public class Parrot extends Animal{

    public Parrot(int age, String name) {
        super(age,name);
    }

    @Override
    public void makeSound() {
        System.out.println("Кукареку!");
    }

    @Override
    public void eat() {
        System.out.println("курлык");

    }
}
