package work_03_09_25.coffee;

public class Coffee {

    public static  final  int SIZE_SMALL = 0;
    public static  final  int SIZE_MEDIUM = 1;
    public static  final  int SIZE_BIG = 2;

    private CoffeeSize size;


    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    public void order(){
        CoffeeSize coffeeSize = CoffeeSize.MEDIUM;
        System.out.println("Заказан размер кофе: " +   coffeeSize);
    }
}
