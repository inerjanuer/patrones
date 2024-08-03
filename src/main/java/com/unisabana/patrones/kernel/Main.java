package com.unisabana.patrones.kernel;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Service addTaskService1 = new AddTaskService("Write Unit Tests");
        Service addTaskService2 = new AddTaskService("Refactor Code");
        Service listTasksService = new ListTasksService();
        Service removeTaskService = new RemoveTaskService("Write Unit Tests");

        addTaskService1.execute(taskManager);
        addTaskService2.execute(taskManager);
        listTasksService.execute(taskManager);
        removeTaskService.execute(taskManager);
        listTasksService.execute(taskManager);
    }
}
