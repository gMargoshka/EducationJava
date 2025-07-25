package work_25_07_25;

public class Calc {
    //Перегрузка (примеры):
    public void printSum(int a, int b){

    }
    public void printSum(double a, double b){
        printSum(a, b, null);
    }
    public void printSum(Double a, Double b, Double c){
          /*
        некая логика
         */
        if(c != null){
            /*

            + новая лгика под 3 параметр
             */
        }
    }

    public int recurs(int n) {

        if(n<=1){ // базисный случай
            return n;
        }

        return recurs(n-1)+recurs(n-2);
    }

}
