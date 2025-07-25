package work_25_07_25;

public class Main {

    public static void main(String[] args) {


        Animal barsik = new Cat();
        Animal sharik = new Dog();

//        barsik.voice();
//        sharik.voice();

        printAnimalVoice(barsik);
        printAnimalVoice(sharik);
    }

    public static void printAnimalVoice(Animal animal){
        animal.voice();
    }
}
