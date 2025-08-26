package work_08_08_2025;

public abstract class Animal {
    private int age;
    private String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Возраст: " + age + " Имя: " + name;
    }

    public abstract void makeSound();
    public abstract void eat();
}
