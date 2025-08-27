package work_08_08_2025.homework_26_08_2025;

import work_28_07_25.BankException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Instrument[] orchestra = new Instrument[5];
            orchestra[0] = new Drums("Барабан", "ударные");
            orchestra[1] = new Guitar("Ибанез", "струнные", 7);
            orchestra[2] = new Violin("Виолончель", "струнные", 5);
            orchestra[3] = new Flute("Флейта", "духовые");
            orchestra[4] = new Saxophone("Саксофон", "духовые");

            StringInstrument[] tunable = new StringInstrument[2];
            tunable[0] = new Guitar("Ибанез", "струнные", 7);
            tunable[1] = new Violin("Виолончель", "струнные", 5);

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество струн");
            int strings = scanner.nextInt();

            for (StringInstrument instrument : tunable) {
                if (strings == instrument.numberOfStrings) {
                    System.out.println("**************************************");
                    System.out.println(instrument);
                    System.out.println("**************************************");
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
              throw new TunableException("Некорректно введено количество струн!");
        }


            System.out.println("Состав оркестра:");

            for (Instrument instrument : orchestra) {
                System.out.println("--------------------------------------");
                System.out.println(instrument.toString());
            }

            System.out.println(" \n ");

            System.out.println("Состав настраиваемых инструментов:");

            for (StringInstrument instrument : tunable) {
                System.out.println("++++++++++++++++++++++++++++++++++++++");
                System.out.println(instrument);
            }

    }
}
