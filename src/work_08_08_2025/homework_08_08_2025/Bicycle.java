package work_08_08_2025.homework_08_08_2025;

public class Bicycle extends Vehicle implements Movable {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Крутим педали");
    }

    @Override
    public void getSpeed() {
        System.out.println("20км/ч");
    }
}
