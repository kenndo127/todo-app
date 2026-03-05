package com.kenneth.todoApp.model.repositories;

import com.kenneth.todoApp.model.entity.Task;
import com.kenneth.todoApp.model.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class DBTaskRepository implements TaskRepository{

    @Override
    public void addTask(User user, Task task) {
        System.out.println(user.getUsername() + " has been added: " + task.getTitle());
    }

    @Override
    public void markTaskAsCompleted(User user, Task task) {
        System.out.println(user.getUsername() + " has been marked " + task.getTitle() + " as completed.");
    }

    @Override
    public void viewAllTasks(User user) {
        System.out.println("showing all tasks for " + user.getUsername());
    }

    @Override
    public void updateTask(User user, Task task) {
        System.out.println(task.getTitle() + " has been updated by " + user.getUsername());
    }

    @Override
    public void deleteTask(User user, Task task) {
        System.out.println(task.getTitle() + " has been deleted by " + user.getUsername());
    }
}
