package com.example.connectivity_emp1;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText eno,ename,esalary,deptno;
    Button btnsubmit;
    Button btnsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eno = findViewById(R.id.eno);
        ename = findViewById(R.id.ename);
        esalary = findViewById(R.id.esalary);
        deptno = findViewById(R.id.deptno);
        btnsubmit = findViewById(R.id.btnsubmit);
        btnsearch = findViewById(R.id.btnsearch);

        DbHelper dbHelper = new DbHelper(this);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = ename.getText().toString();
                int j = Integer.parseInt(esalary.getText().toString());
                int k = Integer.parseInt(deptno.getText().toString());

                long eno = dbHelper.EmpInsert(i,j,k);

                Toast.makeText(MainActivity.this, "Record Inserted......" +eno, Toast.LENGTH_SHORT).show();
            }
        });

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Eno=Integer.parseInt(eno.getText().toString());
                Cursor c=dbHelper.Empsearch(Eno);
                if(c.getCount()>0)
                {
                    c.moveToFirst();
                    ename.setText(c.getString(1));
                    esalary.setText(c.getString(2));
                    deptno.setText(c.getString(3));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Record not found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}