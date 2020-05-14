package com.passionategeekz.learnpython;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        Button b= (Button)findViewById(R.id.lt);
        Button c= (Button)findViewById(R.id.da);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t= (TextView)findViewById(R.id.learn);
                TextView tt= (TextView)findViewById(R.id.py);
                t.setTextColor(Color.parseColor("#FFFFFF"));
                tt.setTextColor(Color.parseColor("#FFFFFF"));

                ConstraintLayout c = (ConstraintLayout)findViewById(R.id.back);
                c.setBackgroundColor(Color.parseColor("#ff252525"));
                Intent i = new Intent(Homescreen.this, darkact.class);
                startActivity(i);

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout c = (ConstraintLayout)findViewById(R.id.back);
                c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                TextView t= (TextView)findViewById(R.id.learn);
                TextView tt= (TextView)findViewById(R.id.py);
                t.setTextColor(Color.parseColor("#ff252525"));
                tt.setTextColor(Color.parseColor("#ff252525"));
                Intent i = new Intent(Homescreen.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
