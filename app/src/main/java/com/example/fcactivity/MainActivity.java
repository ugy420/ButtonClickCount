package com.example.fcactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        Button reset = findViewById(R.id.button1);
        TextView textview = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("DefaultLocale")
            public void onClick(View v){
                i++;
                textview.setText(String.format("%d",i));
                // or Integer.toString(i);
                Toast.makeText(MainActivity.this, String.format("Button Clicked %d times", i), Toast.LENGTH_SHORT).show();
            }
        });

        reset.setOnClickListener(v -> {
            i = 0;
            textview.setText(Integer.toString(i));
            CharSequence text = "Reset happening la!!";
            int durrs = Toast.LENGTH_LONG;
            Toast tst = Toast.makeText(MainActivity.this, text, durrs);
            tst.show();
        });
        }
}