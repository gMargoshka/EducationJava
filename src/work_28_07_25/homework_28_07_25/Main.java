package work_28_07_25.homework_28_07_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManagerImpl taskManagerImpl = new TaskManagerImpl();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);


        try {
            System.out.println("""
                    Привет! Это программа ToDoList - трекер задач.
                    Выбери что необходимо сделать:
                    
                    1 - Ввод новой задачи
                    2 - Просмотр введеных задач
                    3 - Удаление задачи
                    4 - Выход""");

            while (true) {

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        //перейти в метод ввода задачи
                        System.out.println("Вводите название новой задачи: ");
                        String name = scanner1.nextLine();
                        System.out.println("Введите описание новой задачи: ");
                        String descriptoin = scanner2.nextLine();
                        taskManagerImpl.createTask(name, descriptoin);
                        break;
                    case 2:
                        //перейти в метод просмотра задач
                        System.out.println("Просмотр введеных задач");
                        taskManagerImpl.watchTask();
                        break;
                    case 3:
                        //перейти к методу удаления задачи
                        System.out.println("Введите номер задачи на удаление");
                        int currentId = scanner3.nextInt();
                        taskManagerImpl.deleteTask(currentId);
                        break;
                    case 4:
                        //выход
                        scanner.close();
                        System.out.println("Пока пока! Приходи когда появятся новые задачи :)");
                        return;
                    default:
                        System.out.println("Операция не найдена");
                }

            }
        } catch (InputMismatchException inp) {
            System.out.println(inp.getMessage());
            System.out.println(inp.fillInStackTrace());
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
        



    }
}
