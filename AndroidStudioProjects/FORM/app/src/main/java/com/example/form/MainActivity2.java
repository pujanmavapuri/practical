package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i1 = getIntent();

        String name = i1.getStringExtra("nm");
        String mob = i1.getStringExtra("mob");


        Toast.makeText(this, "NAME : "+name, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "MOBILE : "+mob, Toast.LENGTH_SHORT).show();
    }
}