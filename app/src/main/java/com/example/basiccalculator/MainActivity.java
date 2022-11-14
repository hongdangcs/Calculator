package com.example.basiccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText enterNumber;
    private EditText enterPercent;
    private Button buttonCalculate;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNumber = (EditText)findViewById(R.id.editNumber);
        enterPercent = (EditText) findViewById(R.id.editPercent);
        buttonCalculate = (Button) findViewById(R.id.btnCalculate);
        result = (TextView) findViewById(R.id.textResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float resultValue = Float.parseFloat(enterNumber.getText().toString())*Float.parseFloat(enterPercent.getText().toString())/100;
                result.setText(enterPercent.getText().toString() + " percent of " +enterNumber.getText().toString() + " is: " +Float.toString(resultValue));
            }
        });
    }
}