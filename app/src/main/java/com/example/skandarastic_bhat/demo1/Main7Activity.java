package com.example.skandarastic_bhat.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Main7Activity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        TextView text;
        text = findViewById(R.id.text);
        Bundle KEY=getIntent().getExtras();
        mTextView = findViewById(R.id.button_animate);

        TextView buttonAnimate = findViewById(R.id.button_animate);
        buttonAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Shake)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });





    }
}
