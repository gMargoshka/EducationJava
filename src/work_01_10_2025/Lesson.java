package work_01_10_2025;

import java.util.*;

public class Lesson {

    public static void main(String[] args) {

        LinkedList<String> nums = new LinkedList<>();

        HashSet<String> setNum = new HashSet<>();
        setNum.add("1");
        setNum.add("2");
        setNum.add("3");
        setNum.add(null);
        setNum.add(null);

        System.out.println(setNum.size());
        for (String elem: setNum){
            System.out.println(elem);
        }

        System.out.println("===============");

//        TreeSet<String> treeNum = new TreeSet<>();
//        treeNum.add("1");
//        treeNum.add("2");
//        treeNum.add("3");
//        treeNum.add(null);
//        treeNum.add(null);
//
//        System.out.println(treeNum.size());
//        for (String elem: treeNum){
//            System.out.println(elem);
//        }


        Queue<String> queue = new LinkedList<>();
        Queue<String> queue1 = new PriorityQueue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        System.out.println(queue.poll());


        HashMap<Integer, List<String>> names = new HashMap<>();
        List<String> name1993 = new ArrayList<>();
        name1993.add("1");
        name1993.add("2");
        name1993.add("3");

        List<String> name1992 = new ArrayList<>();
        name1992.add("10");
        name1992.add("20");

        names.put(1993, name1993);
        names.put(1992, name1992);

        System.out.println(names.values());

        names.get(1993).add("666");

        System.out.println(names.values());
    }
}
