import java.util.Scanner;

public class PalindromeAllInOne {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Введите строку: ");
String input = scanner.nextLine();
String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
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
if (isPalindrome) {
System.out.println("Строка является палиндромом");
} else {
System.out.println("Строка не является палиндромом");
}
scanner.close();
}
}