package com.example.android.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public ImageButton but1;

    public void init() {
        but1 = (ImageButton) findViewById(R.id.but1);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent page = new Intent(MainActivity.this, second.class);

                startActivity(page);
            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
