package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn3point);
        b2=findViewById(R.id.btn2point);
        b3=findViewById(R.id.btnfreehit);
        b4=findViewById(R.id.btnreset);


        t1=findViewById(R.id.tvdisp);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int value= Integer.parseInt(t1.getText().toString());
                    value +=3;
                    t1.setText(String.valueOf(value));
                }
            });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int value= Integer.parseInt(t1.getText().toString());
                value +=3;
                t1.setText(String.valueOf(value));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int value= Integer.parseInt(t1.getText().toString());
                value +=2;
                t1.setText(String.valueOf(value));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int value= Integer.parseInt(t1.getText().toString());
                value +=1;
                t1.setText(String.valueOf(value));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //int value= Integer.parseInt(t1.getText().toString());
                int value =0;
                t1.setText(String.valueOf(value));
                Toast.makeText(getApplicationContext(),"game reset",Toast.LENGTH_LONG).show();
            }
        });

    }
}