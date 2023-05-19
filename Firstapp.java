package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ntn;
    private TextView txt;
    private EditText tdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ntn = findViewById(R.id.button);
        txt = findViewById(R.id.textView);
        tdt = findViewById(R.id.editTextText3);
        ntn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = tdt.getText().toString();
                if (name.length() > 0) {

                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "The name is empty please fill the name", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
