package com.example.demo.Task;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Task {
    @Id
    @GeneratedValue
    @JsonIgnore
    private int task_id;
    private String title;
    private String worker;
    private int time_spent;

    public int getId() {
        return task_id;
    }

    public void setId(int id) {
        this.task_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public int getTime_spent() {
        return time_spent;
    }

    public void setTime_spent(int time_spent) {
        this.time_spent = time_spent;
    }
}

