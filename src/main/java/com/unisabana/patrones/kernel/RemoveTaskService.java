package com.unisabana.patrones.kernel;

public class RemoveTaskService implements Service {
    private String task;

    public RemoveTaskService(String task) {
        this.task = task;
    }

    @Override
    public void execute(TaskManager taskManager) {
        taskManager.removeTask(task);
        System.out.println("Task removed: " + task);
    }
}
