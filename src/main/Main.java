package main;

import model.Task;
import service.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        int op;
        do {
            System.out.println("\n=== TASKUNI ===");
            System.out.println("1. Agregar");
            System.out.println("2. Listar");
            System.out.println("3. Completar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    manager.addTask(new Task(id, nombre, curso));
                    break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.print("ID: ");
                    manager.completeTask(Integer.parseInt(sc.nextLine()));
                    break;

                case 4:
                    System.out.print("ID: ");
                    manager.deleteTask(Integer.parseInt(sc.nextLine()));
                    break;
            }

        } while (op != 5);
    }
}