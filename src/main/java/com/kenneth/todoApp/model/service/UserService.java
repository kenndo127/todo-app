package com.kenneth.todoApp.model.service;

import com.kenneth.todoApp.model.entity.Task;

public interface UserService {
    void addTask(Task task);
    void markTaskAsCompleted(Task task);
    void viewAllTasks();
    void updateTask(Task task);
    void deleteTask(Task task);
}
