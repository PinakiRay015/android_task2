package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class shareData extends AppCompatActivity {

    //setting variable for textView and Button

    EditText data;
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_data);

        //setting find view  by id for textView and button and implementing functions

        data = (EditText) findViewById(R.id.data);
        shareButton = (Button) findViewById(R.id.shareButton);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(shareButton.getText().toString() != "" && shareButton.getText().toString() != null)
                {
                    String str = data.getText().toString();
                    Log.d("str" , str);

                    if(str!="")
                    {
                        Intent intent = new Intent(shareData.this , finalShare.class);
                        intent.putExtra("message_key" , str);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Button was clicked!!", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Please enter data in it", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Enter in it first", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}