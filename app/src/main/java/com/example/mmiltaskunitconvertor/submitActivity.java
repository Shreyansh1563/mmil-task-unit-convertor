package com.example.mmiltaskunitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class submitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        Intent isubmit = getIntent();
        float []arr = isubmit.getFloatArrayExtra(MainActivity.key);
        TextView txt = findViewById(R.id.textView);
        txt.setText(arr[0] + " Kg = " + (arr[0] * 1000) + " g\n\n" + arr[1] + " Km = " + (arr[1] * 1000) + " m\n\n" + arr[2] + " L  = " + (arr[2] * 1000) + " ml");
    }
}