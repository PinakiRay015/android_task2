package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class webPage extends AppCompatActivity {

    //setting variable Button

    Button instagram , whatsapp , youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);

        //setting find view  by id button and implementing functions

        instagram = (Button) findViewById(R.id.instgram);
        whatsapp = (Button) findViewById(R.id.whatsapp);
        youtube = (Button) findViewById(R.id.youtube);

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com";
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse(url));
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com";
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse(url));
                startActivity(intent);
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.whatsapp.com";
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}