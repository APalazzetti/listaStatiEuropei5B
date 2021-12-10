package com.example.listastatieuropei5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listaf;
    Button btnEsci;
    String[] Film = {"Spiderman","Top gun","Megamind","Frankenstein"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaf=(ListView)findViewById(R.id.listaFilm);
        btnEsci =(Button)findViewById(R.id.btnEsci);
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Film);
        listaf.setAdapter(aaFilm);

        btnEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Stai per uscire",Toast.LENGTH_LONG).show();
            }
        });

    }
}