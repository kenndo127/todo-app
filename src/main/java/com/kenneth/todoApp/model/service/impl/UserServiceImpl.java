package com.kenneth.todoApp.model.service.impl;

import com.kenneth.todoApp.model.entity.Task;
import com.kenneth.todoApp.model.entity.User;
import com.kenneth.todoApp.model.repositories.TaskRepository;
import com.kenneth.todoApp.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final TaskRepository taskRepository;

    @Autowired
    public UserServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    public void addTask(User user, Task task){
        taskRepository.addTask(user, task);
    }
    public void markTaskAsCompleted(User user, Task task){
        taskRepository.markTaskAsCompleted(user, task);
    }
    public void viewAllTasks(User user){
        taskRepository.viewAllTasks(user);
    }
    public void updateTask(User user, Task task){
        taskRepository.updateTask(user, task);
    }
    public void deleteTask(User user, Task task){
        taskRepository.deleteTask(user, task);
    }
}
