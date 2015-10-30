package com.example.kittumadhu.homework02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        Bundle b=intent.getExtras();
         String name=  b.getString("Name");
       // int age= b.getInt("Age");
        TextView tv= (TextView)findViewById(R.id.textView);
        tv.setText(name);


    }
}
