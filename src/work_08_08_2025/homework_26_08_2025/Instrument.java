package work_08_08_2025.homework_26_08_2025;

public abstract class Instrument {
    private String name;
    private String type;
    private String mat; //= "Дерево"; // отсебятина для проверки как работает статичная переменная.

    public Instrument(String name,String type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Название инструмента: " + getName() + " \nТип инструмента: " + getType() + " Тип материала: " + mat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String newMat) {
        this.mat = newMat;
    }
}
