package com.example.skandarastic_bhat.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView b1,b2,b3,b4,b5,b6,b7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView text;
        text = findViewById(R.id.text);
        Bundle KEY=getIntent().getExtras();
        b1=findViewById(R.id.iot);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Iot.class);
                startActivity(i1);
            }
        });
        b2=findViewById(R.id.ar);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Ar.class);
                startActivity(i1);
            }
        });
        b3=findViewById(R.id.machine);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Machine.class);
                startActivity(i1);
            }
        });
        b4=findViewById(R.id.automation);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Automation.class);
                startActivity(i1);
            }
        });
        b5=findViewById(R.id.humanized);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Humanized.class);
                startActivity(i1);
            }
        });
        b6=findViewById(R.id.physical);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Physical.class);
                startActivity(i1);
            }
        });
        b7=findViewById(R.id.everything);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Everything.class);
                startActivity(i1);
            }
        });





            }
}
