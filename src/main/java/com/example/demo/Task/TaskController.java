package com.example.demo.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    private List getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{task_id}")
    private Task getTask(@PathVariable("task_id") int id){
        return taskService.getTaskById(id);
    }


    @DeleteMapping("/tasks/{task_id}")
    private void deleteTask(@PathVariable("task_id") int id){
        taskService.delete(id);
    }

    @PostMapping("/tasks")
    private int saveTask(@RequestBody Task task){
        taskService.saveOrUpdate(task);
        return task.getId();
    }

    @PutMapping("/tasks/{task_id}")
    private Task updTask(@PathVariable("task_id") int id, @RequestBody Task task) {
        taskService.getTaskById(id);
        task.setTitle(task.getTitle());
        task.setWorker(task.getWorker());
        task.setTime_spent(task.getTime_spent());
        taskService.saveOrUpdate(task);
        return taskService.getTaskById(id);
    }
}
