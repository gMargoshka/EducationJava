package homework_13_05_2025;

public class Calculator {
    public static void main(String[] args) {
        Operations operations = new Operations();

        int sum = operations.getSum(2, 3);
        //operations.getDiff(9,2);
       // operations.getMulti(9,4);
       // operations.getDivision(15,2);
       // operations.getRemainder(9,2);


        System.out.println("Сумма чисел: " + operations.getSum(2,3));
        System.out.println("Разница чисел: " + operations.getDiff(9,2));
        System.out.println("Перемножение чисел: " + operations.getMulti(3,7));
        System.out.println("Деление чисел: " + operations.getDivision(9,4));
        System.out.println("Целый остаток: " + operations.getRemainder(9,2));
    }

}
