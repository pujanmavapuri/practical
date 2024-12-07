package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.etmainemail);
        e2=findViewById(R.id.etmainpass);
        b1=findViewById(R.id.etmainsub);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email= e1.getText().toString();
                String pass= e2.getText().toString();

                Intent i1= new Intent(MainActivity.this,signIn.class);
                i1.putExtra("email",email);
                i1.putExtra("pass",pass);
                startActivity(i1);
            }
        });
    }
}