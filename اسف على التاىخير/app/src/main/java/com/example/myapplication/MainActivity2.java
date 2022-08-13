package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView gam = findViewById(R.id.tex);
        TextView nam = findViewById(R.id.age);

        Bundle Bundle= getIntent().getExtras();
        String name =Bundle.getString("name");
        gam.setText(name);
        int f =Bundle.getInt("age");
        nam.setText(String.valueOf(f));
    }
}