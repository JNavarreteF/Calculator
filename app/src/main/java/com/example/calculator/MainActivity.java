package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isOperator = true;
    TextView editValue;
    String operators = "+";
    String initNumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editValue=findViewById(R.id.editText);
    }

    public void numberEvent(View view) {

        if(isOperator)
            editValue.setText("");
        isOperator = false;

        String keyPad = editValue.getText().toString();

        if(view.getId() == R.id.btnOne){
            keyPad += "1";
        }
        else if(view.getId() == R.id.btnTwo){
            keyPad += "2";
        }
        else if(view.getId() == R.id.btnThree){
            keyPad += "3";
        }
        else if(view.getId() == R.id.btnFour){
            keyPad += "4";
        }
        else if(view.getId() == R.id.btnFive){
            keyPad += "5";
        }
        else if(view.getId() == R.id.btnSix){
            keyPad += "6";
        }
        else if(view.getId() == R.id.btnSeven){
            keyPad += "7";
        }
        else if(view.getId() == R.id.btnEight){
            keyPad += "8";
        }
        else if(view.getId() == R.id.btnNine){
            keyPad += "9";
        }
        else if(view.getId() == R.id.btnZero){
            keyPad += "0";
        }
        else if(view.getId() == R.id.btnDot){
            keyPad += ".";
        }
        editValue.setText(keyPad);
    }
    public void operatorEvent(View view) {
        isOperator = true;
        initNumber = editValue.getText().toString();

        if(view.getId() == R.id.btnMultiply){
            operators = "*";}

        else if(view.getId() == R.id.btnMinus){
            operators = "-";}

        else if(view.getId() == R.id.btnDivide){
            operators = "/";}

        else if(view.getId() == R.id.btnPlus){
            operators = "+";
        }
    }

    public void equalEvent(View view) {
        String newNumber = editValue.getText().toString();
        double output = 0.0;

        if(operators == "+")
            output = Double.parseDouble(initNumber) + Double.parseDouble(newNumber);
        if(operators == "/")
            output = Double.parseDouble(initNumber) / Double.parseDouble(newNumber);
        if(operators == "*")
            output = Double.parseDouble(initNumber) * Double.parseDouble(newNumber);
        if(operators == "-")
            output = Double.parseDouble(initNumber) - Double.parseDouble(newNumber);
        editValue.setText(output+"");

    }

    public void clearEvent(View view) {
        editValue.setText("0");
        isOperator = true;
    }
}