package com.example.application; // Ensure this matches your project package

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int ch = 1;
    float font = 30f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = findViewById(R.id.textView);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font += 5;
                if (font > 50) font = 30;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch) {
                    case 1: t.setTextColor(Color.RED); break;
                    case 2: t.setTextColor(Color.GREEN); break;
                    case 3: t.setTextColor(Color.BLUE); break;
                    case 4: t.setTextColor(Color.CYAN); break;
                    case 5: t.setTextColor(Color.YELLOW); break;
                    case 6: t.setTextColor(Color.MAGENTA); break;
                }
                ch++;
                if (ch > 6) ch = 1;
            }
        });
    }
}
