package com.example.hani.haniapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView txtv=(TextView)findViewById(R.id.details);
        Bundle b = getIntent().getExtras();
        String user=b.getString("username");
        String pass=b.getString("password");

        txtv.setText("user:"+ user +"  password:"+pass);

        Toast.makeText(this,"wellcome: "+ String.valueOf(user),Toast.LENGTH_LONG).show();

    }

    public void buAge(View view) {

        Button btn = (Button)findViewById(R.id.buAge);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, AgeActivity.class));
            }
        });
    }

    public void buCalc(View view) {

        Button btn = (Button)findViewById(R.id.buCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, CalculatorActivity.class));
            }
        });
    }

    public void buNot(View view) {

        Button btn = (Button) findViewById(R.id.buNot);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, NotificationActivity.class));
            }
        });
    }

    public void browser(View view) {

        Button btn = (Button) findViewById(R.id.browser);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, BrowserActivity.class));
            }
        });
    }

    public void fireBase(View view) {

        Button btn = (Button) findViewById(R.id.buFireBase);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, AddUserActivity.class));
            }
        });
    }


    public void buChat(View view) {
        Button btn = (Button) findViewById(R.id.buChat);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ChatActivity.class));
            }
        });


    }

    public void buStudent(View view) {
        Button btn = (Button) findViewById(R.id.buStudent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, StudentsListActivity.class));
            }
        });


    }


}
