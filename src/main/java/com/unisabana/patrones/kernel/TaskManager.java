package com.unisabana.patrones.kernel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {
    private List<String> tasks = new ArrayList<>();

    private int currentId = 1;

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
        return new ArrayList<>(tasks);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }
}
