package work_28_07_25.homework_28_07_25;

public class TaskManagerImpl implements TaskManager {
    private Task[] tasks = new Task[10];
    private int currentId = 1;

    @Override
    public void createTask(String name, String description) {

        Task task = new Task(currentId, name, description);
        currentId = currentId + 1;

        boolean isAdded = false;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
                isAdded = true;
                break;
            }
        }
        if (isAdded) {
            System.out.println("Задача успешно добавлена.");
        } else {
            System.out.println("Задача не была довалена. Надо удалить задачу, если необходимо.");
        }

    }

    @Override
    public void watchTask() {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null) {
                System.out.println("Задание " + (i + 1) + " " + tasks[i]);
            }
        }
    }


        @Override
        public void deleteTask ( int currentId){

        boolean isDeleted = false;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getId() == currentId) {
                tasks[i] = null;
                isDeleted = true;
                break;
            }
        }
        if (isDeleted) {
            System.out.println("Задача удалена.");
        } else {
            System.out.println("Задаче не была удалена. Такая задача не найдена.");
        }
    }

    }



