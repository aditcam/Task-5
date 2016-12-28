package com.example.android.task5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button addition,subtract,multiply,divide,power,percentage,clear;
EditText no1,no2;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.sub);
        multiply=(Button)findViewById(R.id.mul);
        divide=(Button)findViewById(R.id.div);
        power=(Button)findViewById(R.id.pow);
        percentage=(Button)findViewById(R.id.per);
        clear=(Button)findViewById(R.id.clr);
        no1=(EditText)findViewById(R.id.tv);
        no2=(EditText)findViewById(R.id.tv2);
        textview=(TextView)findViewById(R.id.tv1);

       addition.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        power.setOnClickListener(this);
        percentage.setOnClickListener(this);
        clear.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String num1=no1.getText().toString();
        String num2=no2.getText().toString();
        Toast toast1=Toast.makeText(this,"Enter the first number",Toast.LENGTH_SHORT);
        Toast toast2=Toast.makeText(this,"Enter the second number",Toast.LENGTH_SHORT);
        Toast toast3=Toast.makeText(this,"Not possible",Toast.LENGTH_SHORT);
        if(no1.getText().toString().equals(""))
            toast1.show();
        else if(no2.getText().toString().equals(""))
            toast2.show();
        else{
        double x=Integer.parseInt(num1);
        double y=Integer.parseInt(num2);
        switch (v.getId()) {
            case R.id.add:
                textview.setText(String.valueOf(x + y));
                break;
            case R.id.sub:
                textview.setText(String.valueOf(x - y));
                break;
            case R.id.mul:
                textview.setText(String.valueOf(x * y));
                break;
            case R.id.div:
                if (y == 0) {
                    toast3.show();
                } else {
                    textview.setText(String.valueOf(x / y));
                }
                break;
            case R.id.pow:
                textview.setText(String.valueOf(Math.pow(x, y)));
                break;
            case R.id.per:
                textview.setText(String.valueOf(x * y / 100));
                break;
            case R.id.clr:
                no1.setText("");
                no2.setText("");
               textview.setText("");
                break;
        }
        }


    }
}
