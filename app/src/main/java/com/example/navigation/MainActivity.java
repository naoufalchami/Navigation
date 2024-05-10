package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4,editText5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.ed1);
        editText2 = findViewById(R.id.ed2);
        editText3 = findViewById(R.id.ed3);
        editText4 = findViewById(R.id.ed4);
        editText5 = findViewById(R.id.ed5);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e1 = editText1.getText().toString();
                String e2 = editText2.getText().toString();
                String e3 = editText3.getText().toString();
                String e4 = editText4.getText().toString();
                String e5 = editText5.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",e1);
                i.putExtra("email",e2);
                i.putExtra("phone",e3);
                i.putExtra("adresse",e4);
                i.putExtra("ville",e5);
                startActivity(i);
            }
        });

    }
}