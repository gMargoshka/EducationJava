package work_08_08_2025.homework_21_08_2025;

public abstract class Employee implements Payable,Workable {
    protected String name;
    protected int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }



}
