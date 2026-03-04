package com.kenneth.todoApp.model.repositories;

import com.kenneth.todoApp.model.entity.Task;

public class DBTaskRepository implements TaskRepository{

    @Override
    public void addTask(Task task) {
        System.out.println(task.getTitle() + "has been added.");
    }

    @Override
    public void markTaskAsCompleted(Task task) {
        System.out.println(task.getTitle() + "has been marked as completed.");
    }

    @Override
    public void viewAllTasks() {
        System.out.println("showing all tasks: ");
    }

    @Override
    public void updateTask(Task task) {
        System.out.println(task.getTitle() + " has been updated.");
    }

    @Override
    public void deleteTask(Task task) {
        System.out.println(task.getTitle() + " has been deleted.");
    }
}
