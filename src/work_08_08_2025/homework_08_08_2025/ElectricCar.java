package work_08_08_2025.homework_08_08_2025;

public class ElectricCar extends Vehicle implements Movable {

    public ElectricCar(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Чик чик");
    }

    @Override
    public void getSpeed() {
        System.out.println("55км/ч");
    }
}
