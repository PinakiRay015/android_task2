package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variable for button

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting find view by id

        startButton = (Button) findViewById(R.id.startButtton);

        //setting on click listener

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //setting function for intent

                Intent intent = new Intent(MainActivity.this , second.class);
                startActivity(intent);
            }
        });
    }
}