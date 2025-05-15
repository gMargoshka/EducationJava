package work_12_05_2025;

public class Person {
    public String name;
    public static int counter;



    public Person(){
//        this.name = name;
        counter++;
    }

    public void printName(String name){
        System.out.println("обычное имя " + name);
    }
    public String getName(){
        return name;
    }

    public static void getStaticName(){
        System.out.println("статичное имя");
    }

}
