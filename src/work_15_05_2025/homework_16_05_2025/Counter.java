package work_15_05_2025.homework_16_05_2025;

public class Counter {
    public static int STVAR = 1;
    public int notStVar = 1; // написала для сравнения результатов
    String counterName = "Ritos";

    int[] numbersInt = {11,22,33,44,55};



    public void printStatic() {
        System.out.println(STVAR);
        System.out.println(notStVar);// написала для сравнения результатов
        STVAR++;
        notStVar++;// написала для сравнения результатов
    }
    public void printCounterName() {
        String counterName = "Ritosik";
        int num = 1;
        System.out.println("Печатаю локальную переменную counterName: " + counterName);
        System.out.println("Печатаю переменную экземпляра counterName: " + this.counterName);
    }

    //метод заменяющий значения массива numbersInt:
    public void printSetNumbersInt () {

        for (int i = 0; i < numbersInt.length; i++) {
            numbersInt[i] = numbersInt[i] + 1;
            System.out.println(numbersInt[i]);
        }

    }
    public void printStatic2() {
        System.out.println(STVAR);
        STVAR++;

    }

}
