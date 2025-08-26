package work_08_08_2025.homework_08_08_2025v3;

public class Triangle extends Shape {
    private int height;
    private int weight;
    private int sideA;
    private int sideB;

    public Triangle(int height, int weight, int sideA, int sideB) {
        this.height = height;
        this.weight = weight;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return (double) (height * weight) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + weight;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник");

    }
}
