package com.example.rr.virtual_hospital;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VbActivity extends AppCompatActivity {
    EditText userName,passWord;
    Button submit,signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vb);
        userName=(EditText)findViewById(R.id.Username);
        passWord=(EditText)findViewById(R.id.Pass);
        submit=(Button)findViewById(R.id.Submit);
        signUp=(Button)findViewById(R.id.Sign);

       signUp.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
               startActivity(in);
           }
       });




}
    }
