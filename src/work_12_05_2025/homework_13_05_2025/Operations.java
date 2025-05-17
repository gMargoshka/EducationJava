package work_12_05_2025.homework_13_05_2025;

public class Operations {

    public void printSum(int a,int b) {
         System.out.println("Итого: " + (a+b));
    }
    public void printDiff(int a,int b) {
        System.out.println("Итого: " + (a-b));
           }
    public void printMulti(int a,int b) {
        System.out.println("Итого: " + (a*b));
    }
    public void printDivision(int a, int b) {
        System.out.println("Итого: " + (a/b));
    }
    public void printRemainder(int a, int b) {
        System.out.println("Итого: " + (a%b));
    }


    public int getMulti(int a,int b) {
        return a * b;
    }

    public double getSum(double a,double b) {
        return (a+b);
    }
    public double getDiff(double a,double b) {
        return (a-b);
    }
    public double getMulti(double a,double b) {
        return (a*b);
    }
    public double getDivision(double a, double b) {
        return (a/b);
    }

    public void printNubers() {
        int count = 5;
        System.out.println(count);
    }

    public void printVar(int a, int b) {
        if (a>b) {
            String c = " больше ";
            System.out.println(a + c + b);
        } else {
            System.out.println("Остальное не важно.");
        }
    }

}
