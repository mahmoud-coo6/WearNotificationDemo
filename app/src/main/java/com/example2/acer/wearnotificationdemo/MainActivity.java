package com.example2.acer.wearnotificationdemo;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class MainActivity extends Activity {


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*


        NotificationCompat.Builder nBuilder=new NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.arrow_up_float)
                .setContentTitle("Notification Title")
                .setContentText("Hi Rod, How it's going?")
                .setContentIntent(pendingIntent);

        NotificationManagerCompat notificationManager=NotificationManagerCompat.from(this);
        notificationManager.notify(0,nBuilder.build());
         */
        Intent i=new Intent(this,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,i,0);

        NotificationCompat.Builder nBuilder=new NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.arrow_up_float)
                .setContentTitle("Notification Title")
                .setContentText("Hi Ali, How it's going?")
                .setContentIntent(pendingIntent);

        NotificationManagerCompat notificationManager=NotificationManagerCompat.from(this);
        notificationManager.notify(0,nBuilder.build());

    }
}
