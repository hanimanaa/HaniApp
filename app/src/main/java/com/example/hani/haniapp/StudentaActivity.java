package com.example.hani.haniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class StudentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studenta);


        final   ArrayList<Student> Items=new  ArrayList<Student> ();
        Items.add(new Student("hussien","he is good man"));
        Items.add(new Student("ahmed","he is ban man"));
        Items.add(new Student("jasim","he is okey man"));
        Items.add(new Student("jena","he is well man"));
        final MyCustomAdapter myadpter= new MyCustomAdapter(Items);

        ListView ls=(ListView)findViewById(R.id.lvStudent);
        ls.setAdapter(myadpter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            

            }
        });

    }



        class MyCustomAdapter extends BaseAdapter {
            ArrayList<Student> Items = new ArrayList<Student>();

            MyCustomAdapter(ArrayList<Student> Items) {
                this.Items = Items;

            }


            @Override
            public int getCount() {
                return Items.size();
            }

            @Override
            public String getItem(int position) {
                return Items.get(position).getId();

            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                LayoutInflater linflater = getLayoutInflater();
                View view1 = linflater.inflate(R.layout.row_view, null);

                TextView txtname = (TextView) view1.findViewById(R.id.txtId);
                TextView txtdes = (TextView) view1.findViewById(R.id.txtFName);
                txtname.setText(Items.get(i).getId());
                txtdes.setText(Items.get(i).getfName());
                return view1;

            }


        }
    }
