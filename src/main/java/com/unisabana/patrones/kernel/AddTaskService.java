package com.unisabana.patrones.kernel;

public class AddTaskService implements Service {
    private String task;

    public AddTaskService(String task) {
        this.task = task;
    }

    @Override
    public void execute(TaskManager taskManager) {
        taskManager.addTask(task);
        System.out.println("Task added: " + task);
    }
}
