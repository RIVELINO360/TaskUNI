package service;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void listTasks() {
        for (Task t : tasks) {
            System.out.println(t.getId() + " - " + t.getNombre() + " - " + t.getCurso());
        }
    }

    public void completeTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setCompletada(true);
                System.out.println("Tarea completada");
                return;
            }
        }
        System.out.println("No encontrada");
    }

    public void deleteTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
    }
}