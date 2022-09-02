package com.example.assignment_1;

import static android.app.UiModeManager.MODE_NIGHT_NO;
import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES;
import static java.sql.DriverManager.println;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import org.mariuszgromada.math.*;
import org.mariuszgromada.math.mxparser.Expression;

import android.content.Context;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Stack;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultView, dataview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = findViewById(R.id.textView2);
        dataview = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button button0 = findViewById(R.id.button_0);
        Button buttonAC = findViewById(R.id.AC);
        Button buttonBracketOpen = findViewById(R.id.bracket_open);
        Button buttonBracketClose = findViewById(R.id.bracket_close);
        Button buttonMultiply = findViewById(R.id.multiply);
        Button buttonDivide = findViewById(R.id.divide);
        Button buttonPlus = findViewById(R.id.plus);
        Button buttonMinus = findViewById(R.id.minus);
        Button buttonPower = findViewById(R.id.power);
        Button buttonEqual = findViewById(R.id.equal);
        Button buttonPoint = findViewById(R.id.point);
        Button buttonmodulo = findViewById(R.id.modulo);
        Button buttonC = findViewById(R.id.button_c);

        button1.setOnClickListener(this::onClick);
        button2.setOnClickListener(this::onClick);
        button3.setOnClickListener(this::onClick);
        button4.setOnClickListener(this::onClick);
        button5.setOnClickListener(this::onClick);
        button6.setOnClickListener(this::onClick);
        button7.setOnClickListener(this::onClick);
        button8.setOnClickListener(this::onClick);
        button9.setOnClickListener(this::onClick);
        button0.setOnClickListener(this::onClick);
        buttonAC.setOnClickListener(this::onClick);
        buttonBracketOpen.setOnClickListener(this::onClick);
        buttonBracketClose.setOnClickListener(this::onClick);
        buttonMultiply.setOnClickListener(this::onClick);
        buttonMultiply.setOnClickListener(this::onClick);
        buttonDivide.setOnClickListener(this::onClick);
        buttonPlus.setOnClickListener(this::onClick);
        buttonMinus.setOnClickListener(this::onClick);
        buttonPower.setOnClickListener(this::onClick);
        buttonEqual.setOnClickListener(this::onClick);
        buttonPoint.setOnClickListener(this::onClick);
        buttonmodulo.setOnClickListener(this::onClick);
        buttonC.setOnClickListener(this::onClick);
        Switch dark_switch = findViewById(R.id.dark_mode);
        dark_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES);

                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        String btnText = btn.getText().toString();
        String data = dataview.getText().toString();




        Log.d("btn text", btnText);

        if (btnText.equals("AC")) {
            dataview.setText("");
            resultView.setText("0");
            return;
        }


        if (btnText.equals("=")) {
            dataview.setText("");
            Log.d("data", data);
            Expression exp = new Expression(data);
            Log.d("exp", String.valueOf(exp));
             Double result = exp.calculate();
            resultView.setText(result.toString());
            Log.d("result", String.valueOf(result));
        }
        else if(btnText.equals("C")){
        data = data.substring(0,data.length()-1);
        Log.d("data", data);
        }
        else{
            data = data + btnText;
        }
        dataview.setText(data);


    }
}

    
   

