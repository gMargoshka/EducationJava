package work_26_05_25;

import java.util.Scanner;

public class PalindromeAllInOne {
    public static void main(String[] args) {

        // чтение данных с терминала посредством сканнер:
        Scanner scanner = new Scanner(System.in);

        // ввод и сохранение строки:
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        //удаляем из введеной строки все символы, кроме русских и латинских букв и переводим в нижний регистр:
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

        //проверка равенства символов в веденном слове:
        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // вывод является ли полиндромом введеное слово:
        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }

        //закрываем ввод в консоли:
        scanner.close();
    }
}