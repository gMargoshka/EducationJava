package work_08_08_2025.homework_21_08_2025;

public class Intern extends Employee implements Workable, Payable{
    private int hourlyRate;
    private int hour;

    //(почасовая оплата)

    public Intern (int id, String name, int hour) {
        super(id,name);
        this.hour = hour;
        hourlyRate = 1000;
    }

    @Override
    public String toString() {
        return "Табельный номер: " + id + " Имя: " + name + " ЗП: " + calculateSalary();
    }

    @Override
    public int calculateSalary() {
        return hour * hourlyRate;
    }

    @Override
    public void work() {
        System.out.println("Я работаю новичком!");
    }


}
