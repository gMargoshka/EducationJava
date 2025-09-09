package work_04_09_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        int[] intArr = new int[5];

//        List<Integer> numbers = new ArrayList<>(); // []
//        List<Integer> numbers = Arrays.asList(1,2,3,444,5); // неизменяемый список
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,444,5)); // неизменяемый список
        numbers.add(1);// [1]
        numbers.add(11);// [1, 11]
        numbers.add(111);// [1, 11, 111]


        System.out.println(numbers.getFirst());
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));

        numbers.set(1,222);
        System.out.println(numbers);

        System.out.println("Есть ли 11: " + numbers.contains(11));
        numbers.size(); //размер листа

        List<String> names = new ArrayList<>();
        names.add("Ann");
        names.add("Petr1");
        names.add("Petr");

//        for(String name : names){
//            if(name.equals("Petr") ){
//                names.remove("Petr");
//            }
//        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("Petr")){
                iterator.remove();
            }
        }
        // или
        names.removeIf(item -> item.equals("Petr"));

        names.remove("Ann");
        names.remove(1);

        names.indexOf("Petr");
        names.lastIndexOf("Petr");
        names.getLast();
        names.get(names.size() - 1);

        String[] arrNames = names.toArray(new String[0]);

        names.clear();



    }
}
