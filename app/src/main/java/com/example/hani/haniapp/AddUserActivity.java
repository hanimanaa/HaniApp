package com.example.hani.haniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class AddUserActivity extends AppCompatActivity {

    private  Button buAdd;
    private  EditText editText;
    private Firebase mref;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        buAdd = (Button) findViewById(R.id.buAdd);
        editText = (EditText) findViewById(R.id.editText);

        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                editText.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Firebase.setAndroidContext(this);
        mref = new Firebase("https://haniapp-b3222.firebaseio.com/");

                buAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String value = editText.getText().toString();
                        Firebase mRefChild = mref.child("UserName");

                        mRefChild.setValue(value);


                    }
                });




    }

    public void buAdd(View view) {
        //  EditText txtuser =(EditText)findViewById(R.id.edUser);
        Button buAdd = (Button) findViewById(R.id.buAdd);



    }
}
