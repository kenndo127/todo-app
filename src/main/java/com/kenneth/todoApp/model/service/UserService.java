package com.kenneth.todoApp.model.service;

import com.kenneth.todoApp.model.entity.Task;
import com.kenneth.todoApp.model.entity.User;

public interface UserService {
    void addTask(User user, Task task);
    void markTaskAsCompleted(User user, Task task);
    void viewAllTasks(User user);
    void updateTask(User user, Task task);
    void deleteTask(User user, Task task);
}
