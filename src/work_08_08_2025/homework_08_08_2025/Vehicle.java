package work_08_08_2025.homework_08_08_2025;

public abstract class Vehicle  {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return brand;
    }

}
