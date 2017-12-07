package com.example.hani.haniapp;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
    }

    NotificationManager nm;
    static int id=1;
    public void buAddNot(View view) {
        NotificationCompat.Builder nb= new NotificationCompat.Builder(this);
        nb
                .setContentTitle("Danger")
                .setContentText("The raining is comming soon")
                .setSmallIcon(R.drawable.notification);


        nm=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(1,nb.build());
        id++;
    }

    public void buDellNot(View view) {
        nm.cancelAll();
    }
}