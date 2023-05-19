package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ntn;
    private EditText tdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ntn = findViewById(R.id.button);
        tdt = findViewById(R.id.editTextText);
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