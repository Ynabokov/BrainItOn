package com.example.brainiton;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AddNewTaskActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;

    String name;
    String due_date;

    EditText nameInput;
    EditText dateInput;
    Button addTaskButton;

    DatePickerDialog datePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_task);

        databaseHelper = new DatabaseHelper(this);

        nameInput = findViewById(R.id.inputName);
        dateInput = findViewById(R.id.inputDueDate);
        addTaskButton = findViewById(R.id.createNewTaskButton);

        dateInput.setInputType(InputType.TYPE_NULL);
        dateInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                datePicker = new DatePickerDialog(AddNewTaskActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                dateInput.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
                            }
                        }, year, month, day);
                datePicker.show();
            }
        });
    }

    public void createTask(View v) {
        TextView inputName = findViewById(R.id.inputName);
        TextView inputDueDate = findViewById(R.id.inputDueDate);
        name = inputName.getText().toString();
        due_date = inputDueDate.getText().toString();

        String[] dates = due_date.split("-");
        String due_day = dates[2];
        String due_month = dates[1];
        String due_year = dates[0];
        Log.d("Time", due_day);
        Log.d("Time", due_month);
        Log.d("Time", due_year);
        Task new_task = new Task(name, due_day, due_month, due_year);

        databaseHelper.addTask(new_task);


        // Display toast
        Context context = getApplicationContext();
        CharSequence text = "Created task!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


        finish();
        // send to main view

    }
}
