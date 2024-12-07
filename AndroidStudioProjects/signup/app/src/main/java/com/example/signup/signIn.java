package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signIn extends AppCompatActivity {

    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        e1=findViewById(R.id.etsigninemail);
        e2=findViewById(R.id.etsigninpass);
        b1=findViewById(R.id.etsigninlogin);

        Intent i1=getIntent();
        String email=i1.getStringExtra("email");
        String pass=i1.getStringExtra("pass");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.equals(e1.getText().toString()) && pass.equals(e2.getText().toString()))
                {
                    Intent i2=new Intent(signIn.this,home_page.class);
                    startActivity(i2);
                                   }
                else
                {
                    Toast.makeText(signIn.this,"invalid input",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}