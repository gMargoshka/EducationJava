package work_12_05_2025.homework_13_05_2025;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);
        //Задания
        //Напишите программу, которая с помощью цикла for выводит таблицу умножения на число 3 (3 × 1 = 3, 3 × 2 = 6, …, 3 × 10 = 30).
        int number = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + operations.getMulti(number,i));
        }

        //Напишите программу, которая с помощью switch выводит для заданного целого числа название дня недели (1 – Понедельник, 2 – Вторник, …, 7 – Воскресенье). Если число не от 1 до 7 – выводите "Некорректное значение".
        System.out.println("Введите число от 1 до 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            default:
                System.out.println("Некорректное значение");
        }

        //Напишите программу, которая с помощью цикла while выводит все нечётные числа от 1 до 9 (1, 3, 5, 7, 9).
        int m = 1;
        while (m<=9){
            System.out.println("Нечетное число: " + m);
            m=m+2;
        }


        //Напишите программу, которая с помощью цикла do-while считает количество цифр во введённом числе.
        System.out.println("Введите число: ");
        int chislo = scanner.nextInt();
        int i=0;

        do{ chislo = chislo/10;
            i++;
        }while(chislo> 0);

        System.out.println("В этом числе " + i + " цифр.");
        // Например, если число 1234, то ответ: 4. Указание : в задании с подсчётом цифр можно «делить число на 10» в цикле,
        // пока число не станет равным 0. Количество итераций цикла и будет количеством цифр.


    }
}

