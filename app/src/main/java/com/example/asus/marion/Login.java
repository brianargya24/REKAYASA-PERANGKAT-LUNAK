package com.example.asus.marion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText emaillog,passwordlog;
Button loginbtn,signupbtn,cabtn;
DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emaillog = (EditText)findViewById(R.id.emaillog);
        passwordlog = (EditText)findViewById(R.id.passwordlog);
        loginbtn = (Button)findViewById(R.id.loginbtn);
        signupbtn = (Button)findViewById(R.id.signupbtn);
        cabtn = (Button)findViewById(R.id.cabtn);
        db = new DatabaseHelper(this);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this , Signup.class);
                startActivity(intent);
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emlog = emaillog.getText().toString();
                String passlog = passwordlog.getText().toString();

            //    Boolean chkemailpass = db.emailpassword(emlog,passlog);
              //  if (chkemailpass == true)
                    Toast.makeText(getApplicationContext(),"Login successsssss",Toast.LENGTH_SHORT).show();
             //   else
                //    Toast.makeText(getApplicationContext(),"wrong email or password",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Login.this,Daftarbis.class);
                startActivity(intent);
            }
        });
           }
}
