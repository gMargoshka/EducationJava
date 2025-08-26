package work_08_08_2025.homework_08_08_2025v3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(8, 10);
        shapes[2] = new Triangle(10, 7, 9, 6);

        for (Shape shape : shapes) {
            System.out.println("============================");
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }


        System.out.println("++++++++++++++++++++");
        double res = (shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea());
        System.out.println("Общая площадь: " + res);
    }

}
