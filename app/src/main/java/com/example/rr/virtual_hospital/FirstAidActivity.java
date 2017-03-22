package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstAidActivity extends AppCompatActivity {
    Button algry,alzhmr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);
        algry=(Button)findViewById(R.id.Allergies);
        alzhmr=(Button)findViewById(R.id.Alzheimer);
        algry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(FirstAidActivity.this,AllgerActivity.class);
                startActivity(in);
            }
        });
        alzhmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(FirstAidActivity.this,AlzhActivity.class);
                startActivity(in);
            }
        });
    }
}
