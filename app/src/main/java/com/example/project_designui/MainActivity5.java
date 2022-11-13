package com.example.project_designui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(view->{
            Intent i = new Intent(MainActivity5.this,MainActivity6.class);
            startActivity(i);

        });
    }
}