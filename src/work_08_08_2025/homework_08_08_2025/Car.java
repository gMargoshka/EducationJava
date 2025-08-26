package work_08_08_2025.homework_08_08_2025;

public class Car extends Vehicle implements Movable, FuelConsumer {

    public Car(String brand) {
        super(brand);
    }


    @Override
    public void move() {
        System.out.println("Врум Врум");
    }
    @Override
    public void getSpeed() {
        System.out.println("60км/ч");
    }

    @Override
    public void refuel(int liters) {
        System.out.println("Заправили бак на " + liters);
    }

    @Override
    public void getFuelLevel() {
        System.out.println("Уровень топлива");
    }
}
