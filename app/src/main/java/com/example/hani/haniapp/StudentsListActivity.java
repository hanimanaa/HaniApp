package com.example.hani.haniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class StudentsListActivity extends AppCompatActivity {

    // Firebase var
    private DatabaseReference mDatabse;

    // Android layout
    private Button  btnAdd;
    private EditText etText;
    private ListView listView;

    //Array List
    private ArrayList<String> arrayList = new ArrayList<>();
    private ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        mDatabse = FirebaseDatabase.getInstance().getReference();
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);

        btnAdd=(Button)findViewById(R.id.btnAdd);
        etText=(EditText)findViewById(R.id.etText);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter((adapter));

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabse.push().setValue(etText.getText().toString());
            }
        });
        mDatabse.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String s1 = dataSnapshot.getValue(String.class);
                arrayList.add(s1);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
