package work_04_09_2025.homework_08_09_2025;

import java.util.ArrayList;
import java.util.List;

public class Lessons {

    public static List getDates() {
        List<String> dates = new ArrayList<>();
        dates.add("01.08.2025");
        dates.add("05.08.2025");
        dates.add("08.08.2025");
        dates.add("21.08.2025");
        dates.add("03.09.2025");
        dates.add("04.09.2025");

        return dates;
    }
    public static List getTimeOfLesson() {
        List<String> timeOfLesson = new ArrayList<>();
        timeOfLesson.add("60");
        timeOfLesson.add("60");
        timeOfLesson.add("60");
        timeOfLesson.add("60");
        timeOfLesson.add("90");
        timeOfLesson.add("50");

        return timeOfLesson;
    }
    public static List getRemainingTime() {
        List<String> remainingTime = new ArrayList<>();
        remainingTime.add("540");
        remainingTime.add("480");
        remainingTime.add("420");
        remainingTime.add("360");
        remainingTime.add("270");
        remainingTime.add("220");

        return remainingTime;
    }

    public static void main(String[] args) {
        System.out.println(getDates());
        System.out.println(getTimeOfLesson());
        System.out.println(getRemainingTime());


    }
}
