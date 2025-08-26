package work_08_08_2025;

public class Leon extends Animal {



    public Leon(int age, String name){
        super(age, name);

    }

    @Override
    public void makeSound() {
        System.out.println("Рррр.");
    }

    @Override
    public void eat() {
        System.out.println("Ням Ням");

    }


}
