package work_15_05_2025;

public class Lesson {

    public static void main(String[] args) {
        sayHello("Ann");
        sayHello("Vasya");
        sayHello("Petr");
        sayHello("Petr", "Ann");

        System.out.println(getDiff(getMulti(getDivision(100))));
    }


    public static int getDiff(int a) {
        int resultDiff = a - 10;
        return resultDiff;
    }

    public static  int getMulti(int a) {
        int resultMulti = a * 10;
        return resultMulti;
    }

    public static  int getDivision(int a) {
        int resultDiv = a / 2;
        return resultDiv;
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayHello(String name1, String name2) {
        System.out.println("Hello " + name1 + " and " + name2);
    }
}
