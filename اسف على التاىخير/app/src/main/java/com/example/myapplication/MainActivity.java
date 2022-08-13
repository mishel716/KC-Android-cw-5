package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText a = findViewById(R.id.xag);
        EditText n = findViewById(R.id.xn);
        Button fly =findViewById(R.id.Button);
        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rna = a.getText().toString();
                int f =Integer.parseInt(n.getText().toString());
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",rna);
                intent.putExtra("age",f);
                startActivity(intent);


            }
        });
    }
}
