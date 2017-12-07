package com.example.hani.haniapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }

    public void buGetAge(View view) {
        EditText etAge =(EditText)findViewById(R.id.etAge);
        int YearOfBirth=Integer.parseInt(etAge.getText().toString());
        int age=2017-YearOfBirth;

        Toast.makeText(this,"age:"+ String.valueOf(age),Toast.LENGTH_LONG).show();

    }

}
