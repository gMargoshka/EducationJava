package work_08_08_2025;

public class Main {
    public static void main(String[] args) {
       Animal[] zoo = new Animal[3];

       zoo[0] = new Leon(1,"Leon");
       zoo[1] = new Elephant(2,"Elephant");
       zoo[2] = new Parrot(3,"Parrot");

       for (int i=0;i<zoo.length;i++) {
           System.out.println("========================");
           System.out.println(zoo[i]);
           zoo[i].eat();
           zoo[i].makeSound();
       }

    }
}
