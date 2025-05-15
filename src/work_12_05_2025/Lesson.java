package work_12_05_2025;

public class Lesson {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(Person.counter);
        System.out.println(person.getName()); // System.out.println("Ann")


    }


    public static void test() {
        int sum = 0;
        String str = "";
        for (int i = 0; i < 5; i++) {
            int square = i * i; // переменная square видна только в данном блоке
            System.out.println(square);
        }

    }

}
