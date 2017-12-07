package com.example.hani.haniapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        final EditText txt1;
        final EditText txt2;
        final EditText txt3;
        Button bu;
        txt1=(EditText)findViewById(R.id.edtext1);
        txt2=(EditText)findViewById(R.id.edtext2);
        txt3=(EditText)findViewById(R.id.edtext3);

        bu=(Button)findViewById(R.id.buCalc);
        bu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1=Integer.parseInt(txt1.getText().toString());
                int n2=Integer.parseInt(txt2.getText().toString());
                int nr = n1+n2;
                txt3.setText(String.valueOf(nr));

            }
        });


    }
}
