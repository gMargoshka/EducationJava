package work_08_08_2025.homework_21_08_2025;

public class Manager extends Employee implements Workable, Payable{

    private int salary;
    private int daysWorked;
    private int percentOfSale;

    //(зарплата + процент от продаж)

    public Manager(int id, String name, int daysWorked, int percentOfSale) {
        super(id,name);
        this.daysWorked = daysWorked;
        this.percentOfSale = percentOfSale;
        salary = 100000;
    }

    @Override
    public String toString() {
        return "Табельный номер: " + id + " Имя: " + name + " ЗП: " + calculateSalary();
    }

    @Override
    public int calculateSalary() {
        return (salary / 21 * daysWorked) + percentOfSale;
    }

    @Override
    public void work() {
        System.out.println("Я работаю манагером!");
    }


}
