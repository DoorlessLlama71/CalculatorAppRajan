package com.example.calculatorapprajan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v){
        EditText firstInputTN = findViewById(R.id.firstInputTextNumber);
        int firstInput = Integer.parseInt(firstInputTN.getText().toString());
        EditText secondInputTN = findViewById(R.id.secondInputTextNumber);
        int secondInput = Integer.parseInt(secondInputTN.getText().toString());
    }

}