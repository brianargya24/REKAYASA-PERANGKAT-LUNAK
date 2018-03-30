package com.example.asus.marion;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plash);

        Toast toast = Toast.makeText(this, "loading", Toast.LENGTH_LONG);
        toast.show();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(PlashActivity.this, "Selamat Datang", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), PlashActivity.class));
                Intent intent = new Intent(PlashActivity.this, HomeBooking.class);
                startActivity(intent);
                finish();
            }
        },3000L);
    }
}
