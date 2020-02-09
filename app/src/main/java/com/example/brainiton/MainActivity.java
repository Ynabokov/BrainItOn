package com.example.brainiton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int size = 40;
    int n = 1;
    public void setBrainSize(View view){
        if(n<3) {
            size = size + 20;
            n++;
        } else if(n>=3){
            size = 40;
            n = 1;
        }
    }


    // Tag for debugging
    private static final String TAG = "BrainItOn";


    ListView listView;
    ArrayList<Task> listItem;

    Button allTasksButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called");
        setContentView(R.layout.activity_main);

        final DatabaseHelper databaseHelper = new DatabaseHelper(this);





        listView=(ListView)findViewById(R.id.mainList);
        listItem = databaseHelper.getAll3Tasks();

        ArrayList<String> names = new ArrayList<>();
        for (Task task : listItem) {
            String name = task.getName();
            names.add(task.getName());
        }


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, names);
        listView.setAdapter(adapter);


        allTasksButton = findViewById(R.id.allTasksButton);
        allTasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllTasksActivity.class);
                startActivity(intent);
            }
        });
    }




    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

}
