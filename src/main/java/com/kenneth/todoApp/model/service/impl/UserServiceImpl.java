package com.kenneth.todoApp.model.service.impl;

import com.kenneth.todoApp.model.entity.Task;
import com.kenneth.todoApp.model.repositories.DBTaskRepository;
import com.kenneth.todoApp.model.repositories.TaskRepository;
import com.kenneth.todoApp.model.service.UserService;

public class UserServiceImpl implements UserService {
    private final TaskRepository taskRepository;

    public UserServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    public void addTask(Task task){
        taskRepository.addTask(task);
    }
    public void markTaskAsCompleted(Task task){
        taskRepository.markTaskAsCompleted(task);
    }
    public void viewAllTasks(){
        taskRepository.viewAllTasks();
    }
    public void updateTask(Task task){
        taskRepository.updateTask(task);
    }
    public void deleteTask(Task task){
        taskRepository.deleteTask(task);
    }
}
