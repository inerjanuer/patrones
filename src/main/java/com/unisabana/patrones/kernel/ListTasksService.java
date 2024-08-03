package com.unisabana.patrones.kernel;

public class ListTasksService implements Service {

    @Override
    public void execute(TaskManager taskManager) {
        System.out.println("Tasks:");
        for (String task : taskManager.listTasks()) {
            System.out.println(task);
        }
    }
}
