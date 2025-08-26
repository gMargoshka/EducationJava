package work_08_08_2025.homework_08_08_2025v3;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг!");

    }
}
