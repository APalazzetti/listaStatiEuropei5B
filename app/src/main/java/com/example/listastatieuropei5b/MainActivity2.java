package com.example.listastatieuropei5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text=(TextView)findViewById(R.id.tit);
        Intent intent= getIntent();
        String titolo=intent.getStringExtra("title");
        Toast toast = Toast.makeText(getApplicationContext(),titolo,Toast.LENGTH_LONG);
        toast.show();
        text.setText(titolo);
    }
    }
