package work_08_08_2025.homework_21_08_2025;

public class Main {
    public static void main(String[] args) {
        Employee[] ipGorbatsevich = new Employee[5];
        ipGorbatsevich[0] = new Developer(1,"Edward",50000);
        ipGorbatsevich[1] = new Manager(2,"Bella",14,40000);
        ipGorbatsevich[2] = new Intern(3,"Jacob",184);
        ipGorbatsevich[3] = new Manager(4,"Karlail",21,80000);
        ipGorbatsevich[4] = new Manager(5, "Esma",20,80000);

        for (Employee employee : ipGorbatsevich) {
            System.out.println("=================================================");
            System.out.println(employee);
        }
        System.out.println();



        int allSalary = ipGorbatsevich[0].calculateSalary() + ipGorbatsevich[1].calculateSalary() + ipGorbatsevich[2].calculateSalary() + ipGorbatsevich[3].calculateSalary() + ipGorbatsevich[4].calculateSalary();

        System.out.println("Общий фонд ЗП составляет: " + allSalary);

        Manager charly = new Manager(6, "Charly", 22,100000);

        System.out.println("\n" + "++++++++++++++++++++++++++++++++++++++++++++++" + "\n");
        System.out.println(charly.name + " заработал в этом месяце: " + charly.calculateSalary() + ". Его табельный номер: " + charly.id + ". Чарли молодец, ведь он работает.");
        charly.work();
    }
}
