package com.example.mmiltaskunitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String key = "MMIL_task.submit";
    EditText kg;
    EditText km;
    EditText l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kg = findViewById(R.id.kgEntry);
        km = findViewById(R.id.kmEntry);
        l = findViewById(R.id.lEntry);
    }

    public void submit(View V) {
        Intent isubmit = new Intent(this, submitActivity.class);
        if (kg.getText().toString().equals("")) kg.setText("0");
        if (km.getText().toString().equals("")) km.setText("0");
        if (l.getText().toString().equals("")) l.setText("0");
        float []arr = {Float.parseFloat(kg.getText().toString()) ,Float.parseFloat(km.getText().toString()) ,Float.parseFloat(l.getText().toString())};
        isubmit.putExtra(key, arr);
        startActivity(isubmit);
    }
}