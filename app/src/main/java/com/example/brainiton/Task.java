package com.example.brainiton;

import java.util.Calendar;

public class Task {
    private String name;
    private String due_day;
    private String due_month;
    private String due_year;
    private boolean completed;


    public Task(String name, String due_day, String due_month, String due_year) {
        this(name, due_day, due_month, due_year, false);
    }
    public Task(String name, String due_day, String due_month, String due_year, boolean completed) {
        this.name = name;
        this.due_day = due_day;
        this.due_month= due_month;
        this.due_year = due_year;
        this.completed = completed;
    }
    //getName method - KC
    public Task(){
    }
    public void setName(String n){
        name = n;
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
    public boolean getCompleted() {
        return completed;
    }

    public String getDue_day() {
        return due_day;
    }

    public void setDue_day(String due_day) {
        this.due_day = due_day;
    }

    public String getDue_month() {
        return due_month;
    }

    public void setDue_month(String due_month) {
        this.due_month = due_month;
    }

    public String getDue_year() {
        return due_year;
    }

    public void setDue_year(String due_year) {
        this.due_year = due_year;
    }

    public boolean isCompleted() {
        return completed;
    }
}
