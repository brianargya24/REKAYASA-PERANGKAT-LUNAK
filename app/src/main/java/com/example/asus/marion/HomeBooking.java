package com.example.asus.marion;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeBooking extends AppCompatActivity{
    Button kanan, kiri;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homebooking);
        kanan = (Button)findViewById(R.id.btnkanan);
        kiri = (Button)findViewById(R.id.btnkiri);

        kanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeBooking.this, )
            }
        });
    }
}
