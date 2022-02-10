package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class second extends AppCompatActivity {

    //setting variable for button

    Button shareButton , webButton , fileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //setting on find view by id

        shareButton = (Button) findViewById(R.id.button1);
        webButton = (Button) findViewById(R.id.button2);
        fileButton = (Button) findViewById(R.id.button3);

        //setting onClick listener and implementing functions to all the respective button

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(second.this , shareData.class);
               startActivity(intent);
            }
        });

        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(second.this , webPage.class);
                startActivity(intent);
            }
        });

        fileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(second.this , fileSend.class);
                startActivity(intent);
            }
        });
    }
}