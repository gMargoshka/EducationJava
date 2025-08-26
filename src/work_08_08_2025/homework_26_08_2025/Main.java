package work_08_08_2025.homework_26_08_2025;

public class Main {
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[5];
        orchestra[0] = new Drums("Барабан","ударные");
        orchestra[1] = new Guitar("Ибанез", "струнные",7);
        orchestra[2] = new Violin("Виолончель","струнные",5);
        orchestra[3] = new Flute("Флейта","духовые");
        orchestra[4] = new Saxophone("Саксофон","духовые");

        StringInstrument[] tunable = new StringInstrument[2];
        tunable[0] = new Guitar("Ибанез", "струнные",7);
        tunable[1] = new Violin("Виолончель","струнные",5);

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
