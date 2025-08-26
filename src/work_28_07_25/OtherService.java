package work_28_07_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OtherService {


    public static void otherMethod() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        try {
            int number = scanner.nextInt();
            System.out.println(number);

            System.out.println("Урааа я тут");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            throw new OtherException("ошибка при обращении в сторонний сервис");
        }finally {
            scanner.close();
            sum+=1;
        }
    }
}
