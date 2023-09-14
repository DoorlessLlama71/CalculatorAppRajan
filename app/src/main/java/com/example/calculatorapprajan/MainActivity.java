package com.example.calculatorapprajan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstInputTN;
    EditText secondInputTN;
    Spinner operationSpin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //accessing text boxes
        firstInputTN = findViewById(R.id.firstInputTextNumber);
        secondInputTN = findViewById(R.id.secondInputTextNumber);
        operationSpin = findViewById(R.id.operationSelectorSpinner);
        /*
        operationSpin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                operationSpin = findViewById(R.id.operationSelectorSpinner);
                String operation = operationSpin.getSelectedItem().toString();
                if (operation.equals("square root") || operation.equals("cube root")) {
                    firstInputTN.setHint("Single Input");
                    secondInputTN.setHint("Leave Blank(NC)");
                    secondInputTN.setText("");
                }
            }
        });
        */
    }
    public void calculate(View v) {
        //performs the mathematical concepts and outputs it
        TextView enterTV = findViewById(R.id.resultTextView);
        String operation = operationSpin.getSelectedItem().toString();
        System.out.println(operation);
        int firstInput = Integer.parseInt(firstInputTN.getText().toString());
        int secondInput = Integer.parseInt(secondInputTN.getText().toString());
        if (operation.equals("square root") || operation.equals("cube root")) {
            firstInputTN.setHint("Single Input");
            secondInputTN.setHint("Leave Blank(NC)");
            secondInputTN.setText("");
        }
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
    public void switchToButtonCalc(View v){
        //switches the screen to the button calculator
        Intent intent = new Intent(this, ButtonCalc.class);
        startActivity(intent);
    }

}