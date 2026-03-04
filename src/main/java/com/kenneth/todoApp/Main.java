package com.kenneth.todoApp;

import com.kenneth.todoApp.model.entity.*;
import com.kenneth.todoApp.model.repositories.DBTaskRepository;
import com.kenneth.todoApp.model.repositories.TaskRepository;
import com.kenneth.todoApp.model.service.UserService;
import com.kenneth.todoApp.model.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        //Create an entity
        User user = new User("kenzzy", "kenzzy@gmail.com", "kenzzy127", 1);
        Task task = new Task(1, "Learn Spring", "read chapter 3, read chapter 4");

        //create dependencies
        TaskRepository dbTaskRepository = new DBTaskRepository();

        //Create the service
        UserService userService = new UserServiceImpl(dbTaskRepository);

        //Use the service
        userService.addTask(task);
        userService.markTaskAsCompleted(task);
        userService.updateTask(task);
        userService.viewAllTasks();
        userService.deleteTask(task);



    }
}