package work_12_05_2025.homework_13_05_2025;

import java.util.Scanner;

public class CalculatorNew {

    public static void main(String[] args) {
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt(); //сохраняю введенное значение с консоли

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt(); //сохраняю введенное значение с консоли

        System.out.println("Введите оператор (+, -, *, /, %): ");
        String operator = scanner.next();

        switch (operator) {     //условие для вывода той или иной операции
            case "+":
                operations.printSum(number1,number2);
                break;
            case "-":
                operations.printDiff(number1,number2);
                break;
            case "*":
                operations.printMulti(number1,number2);
                break;
            case "/":
                operations.printDivision(number1,number2);
                break;
            case"%":
                operations.printRemainder(number1,number2);
                break;
            default:
                System.out.println("Операция не найдена");
        }




    }

}
