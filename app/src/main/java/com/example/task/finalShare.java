package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalShare extends AppCompatActivity {

    //setting function for textView

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_share);

        //setting find view by id and implementing function

        name = (TextView) findViewById(R.id.name);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        name.setText(str);
    }
}