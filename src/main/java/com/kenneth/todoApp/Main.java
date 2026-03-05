package com.kenneth.todoApp;

import com.kenneth.todoApp.configuration.ProjectConfig;
import com.kenneth.todoApp.model.entity.*;

import com.kenneth.todoApp.model.service.UserService;
import com.kenneth.todoApp.model.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Create a Spring context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Create an entity
        User user = new User("kenzzy", "kenzzy@gmail.com", "kenzzy127", 1);
        Task task = new Task(1, "Learn Spring", "read chapter 3, read chapter 4");

        //get UserServiceImpl from the spring context using the interface
        UserService userService = context.getBean(UserService.class);

        //Use the service
        userService.addTask(user, task);
        userService.markTaskAsCompleted(user, task);
        userService.updateTask(user, task);
        userService.viewAllTasks(user);
        userService.deleteTask(user, task);

    }
}