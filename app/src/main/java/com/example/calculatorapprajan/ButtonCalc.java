package com.example.calculatorapprajan;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_calc);
    }
    public void switchToNormalCalc(View v){
        //switch back to regular calculator screen
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void numberOperationButtonInput(View v) {
        double result = 1.0;
        
    }
    String typingNumber="";
    double num1=0;
    double num2=0;
    String tempOperation="+";

    public void calculateButton(View v) {
        //performs the mathematical concepts using buttons
        Button input = (Button)v;
        String inputString = input.getText().toString();
        System.out.println(inputString);
        TextView outputTV = findViewById(R.id.outputTextView);

         if (inputString.equals("Clear")) {
            num1=0;
            outputTV.setText("");
        }
        else if (inputString.equals("+")||inputString.equals("-")||inputString.equals("*")||inputString.equals("/")||inputString.equals("=")) {
            try {
                num2 = Integer.parseInt(typingNumber);
                typingNumber="";
            }
            catch(Exception e){

            }

            if(tempOperation.equals("+")){
                num1+=num2;
            }
            else if(tempOperation.equals("-")){
                num1-=num2;
            }
            else if(tempOperation.equals("*")){
                num1=num1*num2;
            }
            else if(tempOperation.equals("/")){
                num1=num1/num2;
            }
            if(inputString.equals("=")){
                outputTV.setText("" + num1);
            }
            else {
                tempOperation = inputString;
            }
        }
        else{
            typingNumber+=inputString;
        }
    }
}