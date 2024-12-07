package com.example.checkcust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button b1;
    RadioGroup rbgp;
    RadioButton r1,r2;

TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.chc);
        c2=findViewById(R.id.chcpp);
        c3=findViewById(R.id.chj);
        b1=findViewById(R.id.btnsub);
        t1=findViewById(R.id.tvdisp);
        r1=findViewById(R.id.rbtnmale);
        r2=findViewById(R.id.rbtnfemale);
        rbgp=findViewById(R.id.rbtngender);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int amt=0;
            int dis,total=0;
            if(c1.isChecked())
            {
                amt+=5000;
            }
            if(c2.isChecked())
            {
                amt+=6000;
            }
            if(c3.isChecked())
            {
                amt+=7000;
            }
                //t1.setText("Your amt is :"+amt);
                //Toast.makeText(MainActivity.this, "The total amt is "+amt, Toast.LENGTH_SHORT).show();

                if(rbgp.getCheckedRadioButtonId()==R.id.rbtnmale)
                {
                    dis=(amt*10)/100;
                }
                else
                {
                    dis=(amt*20)/100;
                }
                total=amt-dis;
                t1.setText("Your amt: "+total);
            }
        });
    }
}