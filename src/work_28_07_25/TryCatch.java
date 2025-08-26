package work_28_07_25;

import java.util.InputMismatchException;

import static work_28_07_25.BankService.bankMethod;
import static work_28_07_25.OtherService.otherMethod;

public class TryCatch {

    public static void main(String[] args) {
//        try{
//            Files.readAllBytes(Path.of(""));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        try {

            otherMethod();

            bankMethod();
        }catch (BankException e){
            System.out.println("Банковская ошибка "+ e.getMessage());
        }catch (OtherException e){
            System.out.println("другая ошибка "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Непредвиденная ошибка "+ e.getMessage());
        }

        /*
        try{
            код который может бросить исключение\вызвать ошибку
        }catch(Тип ошибки){
             какая-то логика обработки ошибки
        }finally{
            код, который обязан всегда выполнится
        }
         */


    }


}
