package work_26_05_25;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {
        int[] array = readArray();

        int sum = calcSum(array);
        int min = calcMin(array);
        int max = calcMax(array);
        double average = calcAverage(array);

        printResult(sum, average, min, max);
    }

    private static void printResult(int sum, double average, int min, int max) {
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

    private static int[] readArray() {
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

        // закрываем сканер
        scanner.close();

        return array;
    }

    private static int calcSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    private static int calcMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int calcMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static double calcAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        return (double) calcSum(array) / array.length;

    }
}
