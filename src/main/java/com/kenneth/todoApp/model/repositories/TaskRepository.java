package com.kenneth.todoApp.model.repositories;

import com.kenneth.todoApp.model.entity.Task;

public interface TaskRepository {
    void addTask(Task task);
    void markTaskAsCompleted(Task task);
    void viewAllTasks();
    void updateTask(Task task);
    void deleteTask(Task task);
}
