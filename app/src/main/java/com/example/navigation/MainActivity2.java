package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);
        textView3 = findViewById(R.id.txt3);
        textView4 = findViewById(R.id.txt4);
        textView5 = findViewById(R.id.txt5);

        Intent i = getIntent();
        String t1 = i.getStringExtra("name");
        textView1.setText(t1);
        String t2 = i.getStringExtra("email");
        textView2.setText(t2);
        String t3 = i.getStringExtra("phone");
        textView3.setText(t3);
        String t4 = i.getStringExtra("adresse");
        textView4.setText(t4);
        String t5 = i.getStringExtra("ville");
        textView5.setText(t5);


    }
}