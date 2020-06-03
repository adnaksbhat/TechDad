package com.example.skandarastic_bhat.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        TextView text;
        text = findViewById(R.id.text);
        Bundle KEY=getIntent().getExtras();

    }
}
