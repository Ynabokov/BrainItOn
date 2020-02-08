package com.example.brainiton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;


public class AddNewTaskActivity extends AppCompatActivity {

    String name;
    String due_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_task);

    }

    public void createTask(View v) {
        final TextView inputName = findViewById(R.id.inputName);
        final TextView inputDueDate = findViewById(R.id.inputDueDate);
        name = inputName.getText().toString();
        //due_date = inputDueDate.getText().toString().split("-");
        due_date = inputDueDate.getText().toString();
        Task new_task = new Task(name, due_date);
        // send to main view
    }
}
