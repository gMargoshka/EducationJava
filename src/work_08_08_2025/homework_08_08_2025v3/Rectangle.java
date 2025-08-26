package work_08_08_2025.homework_08_08_2025v3;

public class Rectangle extends Shape {
    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }


    @Override
    public double calculateArea() {
        return height * weight;
    }

    @Override
    public double calculatePerimeter() {
        return (height + weight) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник");

    }
}
