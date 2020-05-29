package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void buttonClick(View view){
        EditText txt = (EditText) findViewById(R.id.editText);
        Double doubleIndian = Double.parseDouble(txt.getText().toString());
        Double dollar = doubleIndian * 0.013;
        Toast.makeText(this,"$ "+dollar, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
