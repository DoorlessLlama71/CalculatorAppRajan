package com.example.calculatorapprajan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v) {
        EditText firstInputTN = findViewById(R.id.firstInputTextNumber);
        EditText secondInputTN = findViewById(R.id.secondInputTextNumber);
        TextView enterTV = findViewById(R.id.resultTextView);
        Spinner operationSpin = findViewById(R.id.operationSelectorSpinner);
        String operation = operationSpin.getSelectedItem().toString();
        System.out.println(operation);
        int firstInput = Integer.parseInt(firstInputTN.getText().toString());
        int secondInput = Integer.parseInt(secondInputTN.getText().toString());
        if (operation.equals("+")) {
            enterTV.setText("" + (0.0 + firstInput + secondInput));
        } else if (operation.equals("-")) {
            enterTV.setText("" + (0.0 + firstInput - secondInput));
        } else if (operation.equals("*")) {
            enterTV.setText("" + (1.0 * firstInput * secondInput));
        } else if (operation.equals("MOD")) {
            enterTV.setText("" + (1.0 * firstInput * secondInput));
        } else {
            enterTV.setText("" + (1.0 * firstInput / secondInput));
        }
    }
    public void checkSpinner(View v){
            EditText firstInputTN = findViewById(R.id.firstInputTextNumber);
            EditText secondInputTN = findViewById(R.id.secondInputTextNumber);
            Spinner operationSpin = findViewById(R.id.operationSelectorSpinner);
            String operation = operationSpin.getSelectedItem().toString();
            if (operation.equals("square root") || operation.equals("cube root")) {
                firstInputTN.setHint("Single Input");
                firstInputTN.setText("");
                secondInputTN.setHint("Leave Blank(NC)");
                secondInputTN.setText("");
            }
    }
    public void switchToButtonCalc(View v){

    }

}