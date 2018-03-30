package com.example.asus.marion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
Button button;
EditText email,fullname,password,noHP;
DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email = (EditText) findViewById(R.id.email);
        fullname = (EditText) findViewById(R.id.fullname);
        password = (EditText) findViewById(R.id.password);
        noHP = (EditText) findViewById(R.id.phonenumber);
        db = new DatabaseHelper(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        //        String em = email.getText().toString();
          //      String pass = password.getText().toString();
            //    if (email.equals("") || password.equals("")) {
              //      Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
 //               } else {
   //                 Boolean chkemail = db.emailpassword(em);
     //               if (chkemail == true) {
       //                 Boolean insert = db.insert(em, pass);
         //               if (insert == true) {
           //                 Toast.makeText(getApplicationContext(), "Registered succesfully", Toast.LENGTH_SHORT).show();
             //           }
               //     } else {
        //                Toast.makeText(getApplicationContext(), "Email Already Exists ", Toast.LENGTH_SHORT).show();
          //          }
            //    }
                Intent intent = new Intent(Signup.this, Login.class);
                startActivity(intent);

            }
        });


    }}