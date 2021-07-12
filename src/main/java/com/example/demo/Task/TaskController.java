package com.example.demo.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @CrossOrigin(origins = "http://localhost:8080/tasks")
    @GetMapping("/tasks")
    private List getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    private Task getTask(@PathVariable("id") int id){
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/tasks/{id}")
    private void deleteTask(@PathVariable("id") int id){
        taskService.delete(id);
    }

    @PostMapping("/tasks")
    private int saveTask(@RequestBody Task task){
        taskService.saveOrUpdate(task);
        return task.getId();
    }

    @PutMapping("/ptasks/{id}")
    private Task updTask(@PathVariable("id") int id, @RequestBody Task task) {
        taskService.getTaskById(id);
        task.setId(task.getId());
        task.setName(task.getName());
        task.setWorker(task.getWorker());
        taskService.saveOrUpdate(task);
        return taskService.getTaskById(id);
    }
}
