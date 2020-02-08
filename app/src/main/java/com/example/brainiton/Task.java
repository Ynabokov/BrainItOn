package com.example.brainiton;

import java.util.Calendar;

public class Task {
    public String name;
    public String due_date;

    public Task(String n, String d) {
        name = n;
        due_date = d;
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
    public String getName(){
        return name;
    }
    public String getDueDate(){
        return due_date;
    }
}
