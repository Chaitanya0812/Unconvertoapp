package com.example.unconvertoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import  android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    //private TextView textview;

    private EditText edittext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        edittext = findViewById(R.id.editTextText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = edittext.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = kg*2.205;
                Toast.makeText(MainActivity.this,  "The weight in pounds is:"+" "+pound , Toast.LENGTH_LONG).show();
            }
        });
    }
}