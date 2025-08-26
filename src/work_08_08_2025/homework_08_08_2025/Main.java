package work_08_08_2025.homework_08_08_2025;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movable[] vehicles = new Movable[3];
        vehicles[0] = new Car("Opel");
        vehicles[1] = new Bicycle("Lastochka");
        vehicles[2] = new ElectricCar("Tesla");

        for (Movable xxx : vehicles) {
            System.out.println("===================================================");
            System.out.println(xxx);
            xxx.getSpeed();
            xxx.move();
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        
    }


}
