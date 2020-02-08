package com.example.brainiton;

import java.util.Calendar;

public class Task {
    public String name;
    public String due_date;
    public boolean completed;

    public Task(String n, String d) {
        this(n, d, false);
    }
    public Task(String n, String d, boolean c) {
        name = n;
        due_date = d;
        completed = c;
    }
    //getName method - KC
    public Task(){
    }
    public void setName(String n){
        name = n;
    }
    public void setDue_date(String d){
        due_date = d;
    }
    public void setCompleted() {
        completed = true;
    }
    public void setCompleted(boolean c) {
        completed = c;
    }
    public String getName(){
        return name;
    }
    public String getDueDate(){
        return due_date;
    }
    public boolean getCompleted() {
        return completed;
    }
}
