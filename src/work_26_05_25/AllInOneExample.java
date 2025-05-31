package work_26_05_25;

import java.util.Scanner;

public class AllInOneExample {
    public static void main(String[] args) {
        // сканер для чтение значений из терминала
        Scanner scanner = new Scanner(System.in);

        // считываем размер массива
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        // создаем массив
        int[] array = new int[n];

        // заполняем массив элементами из консоли
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // ищем сумму, минимальное, максимальное - в цикле
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // считаем среднее значение
        double average = 0;
        if (n > 0) {
            average = (double) sum / n;
        }

        //  выводим результат
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);

        // закрываем сканер
        scanner.close();
    }
}