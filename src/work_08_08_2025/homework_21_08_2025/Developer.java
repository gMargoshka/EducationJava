package work_08_08_2025.homework_21_08_2025;

public class Developer extends Employee implements Workable, Payable {
    private int bonus;
    private int fixSalary;

    //(фиксированная зарплата + бонус за проекты)
    public Developer(int id, String name, int bonus) {
        super(id,name);
        this.bonus = bonus;
        fixSalary = 300000;
    }

    public String toString() {
        return "Табельный номер: " + id + " Имя: " + name + " ЗП: " + calculateSalary();
    }



    @Override
    public int calculateSalary() {
        return fixSalary + bonus;
    }

    @Override
    public void work() {
        System.out.println("Я работаю разработчиком!");

    }

}
