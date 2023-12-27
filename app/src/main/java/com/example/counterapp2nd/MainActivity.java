package com.example.counterapp2nd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView counter_app, content_text;
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content_text = findViewById(R.id.content_text);
        counter_app = findViewById(R.id.counter_app);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content_text.setText("" + increaseCounter());
            }
        });
    }

    public int increaseCounter() {
        return ++counter;
    }
}