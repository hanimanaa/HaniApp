package com.example.hani.haniapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void buLogin(View view) {
        EditText txtuser =(EditText)findViewById(R.id.edUser);
        EditText txtpass =(EditText)findViewById(R.id.edPass);

        Intent in =new Intent(this, MenuActivity.class);
        Bundle  b=new Bundle();
        b.putString("username",txtuser.getText().toString());
        b.putString("password",txtpass.getText().toString());
        in.putExtras(b);
        startActivity(in);

    }
}
