package work_03_09_25.day;

import java.net.http.HttpClient;

public enum Day {
    MONDAY("Готов к работе"),
    TUESDAY("Надоело"),
    WEDNESDAY("Хочу субботу");

    private String myStatus;

    Day(String myStatus) {
        this.myStatus = myStatus;
    }

    public String getMyStatus() {

        return myStatus;
    }

    public static String getDayWorkStatus(Day day){
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY -> "Рабочая";
            default -> "Отдых";
        };
    }

}


//public final class Day extends Enum<Day> {
//
//    public static final Day MONDAY = new Day("MONDAY", 0);
//    public static final Day TUESDAY = new Day("TUESDAY", 1);;
//    public static final Day WEDNESDAY = new Day("WEDNESDAY", 2);;
//
//
//    /**
//     * Sole constructor.  Programmers cannot invoke this constructor.
//     * It is for use by code emitted by the compiler in response to
//     * enum class declarations.
//     *
//     * @param name    The name of this enum constant, which is the identifier
//     *                used to declare it.
//     * @param ordinal The ordinal of this enumeration constant (its position
//     *                in the enum declaration, where the initial constant is assigned
//     *                an ordinal of zero).
//     */
//    Day(String name, int ordinal) {
//        super(name, ordinal);
//    }
//}