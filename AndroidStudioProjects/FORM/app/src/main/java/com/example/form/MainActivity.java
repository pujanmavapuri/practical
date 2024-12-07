package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText tvname,tvpass,tvmob,temail;
        Button btnsub,btnres;
        RadioButton rmale,rfe;
        RadioGroup rgrp;
        CheckBox csing,cdance,cckt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvname = findViewById(R.id.name);
        tvmob = findViewById(R.id.mob);
        tvpass = findViewById(R.id.pass);
        temail = findViewById(R.id.email);

        btnsub = findViewById(R.id.submit);
        btnres = findViewById(R.id.reset);

        rmale = findViewById(R.id.r_male);
        rfe = findViewById(R.id.r_female);

        rgrp = findViewById(R.id.r_grp);
        csing = findViewById(R.id.sing);
        cdance = findViewById(R.id.dance);
        cckt = findViewById(R.id.cricket);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gender="";
                if(rgrp.getCheckedRadioButtonId()==R.id.r_male)
                {
                    gender="male";
                }
                else
                {
                    gender="female";
                }
                String hobby="";

                if(csing.isChecked())
                {
                    hobby= hobby + "Singing";
                }
                if(cckt.isChecked())
                {
                    hobby= hobby + "Cricket";
                }
                if(cdance.isChecked())
                {
                    hobby= hobby + "Dance";
                }

                String k = tvname.getText().toString();
                String m = tvmob.getText().toString();
                Intent i1=new Intent(MainActivity.this,MainActivity2.class);
                i1.putExtra("nm",k);
                i1.putExtra("mob",m);
                startActivity(i1);
            }
        });

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvname.setText("");
                tvpass.setText("");
                tvmob.setText("");
                temail.setText("");
                cdance.setChecked(false);
                csing.setChecked(false);
                cckt.setChecked(false);
                rmale.setChecked(false);
                rfe.setChecked(false);

            }
        });

    }
}

