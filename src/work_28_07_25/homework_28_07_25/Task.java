package work_28_07_25.homework_28_07_25;

public class Task {
    private int id;
    private String name;
    private boolean isCompleted;
    private String description;

    public Task (int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public boolean getIsCompleted () {
        return isCompleted;
    }
    public  String getDescription () {
        return description;
    }

    public void setIsCompleted (boolean isCompleted) {
         this.isCompleted = isCompleted;
    }

    @Override
    public String toString() { //alt+insert - to String
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isCompleted=" + isCompleted +
                ", description='" + description + '\'' +
                '}';
    }
}
