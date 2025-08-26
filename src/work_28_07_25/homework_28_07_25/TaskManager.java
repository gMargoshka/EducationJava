package work_28_07_25.homework_28_07_25;

public interface TaskManager {
    void createTask(String name, String description);
    void watchTask();
    void deleteTask(int currentId);
}
