package work_19_05_25;

import java.util.ArrayList;
import java.util.List;

public class PersonByConstructor {
    private final String name;
    private int age;

    public PersonByConstructor(String name) {
        this.name = name;
    }

    public PersonByConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


}
