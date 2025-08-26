package work_28_07_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankService {


    public static void bankMethod() {
        try (Scanner scanner = new Scanner(System.in);){ //try/catch с ресурсами () позволяют закрыть потоки без finally
            int number = scanner.nextInt();
            System.out.println(number);

            System.out.println("Урааа я тут");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            throw new BankException("ошибка при получении банковских счетов");
        }
    }
}
