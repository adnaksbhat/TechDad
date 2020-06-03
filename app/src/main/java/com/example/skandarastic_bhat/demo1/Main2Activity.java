package com.example.skandarastic_bhat.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    Button button;
    Button button1;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        button = findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("KEY", "passData");
                startActivity(intent);

            }
        });
        button1 = findViewById(R.id.b3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Main7Activity.class);
                intent.putExtra("KEY", "passData");
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.nav_info)
        {
            Toast.makeText(this, "Info", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Main2Activity.this,Main6Activity.class);
            startActivity(intent);

        }
        else if(id==R.id.nav_star)
        {
            Toast.makeText(this, "Image Groove", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Main2Activity.this,Main5Activity.class);
            startActivity(intent);

        }
        else if(id==R.id.vdo)
        {
            Toast.makeText(this, "Clip", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Main2Activity.this,Main9Activity.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }
}



