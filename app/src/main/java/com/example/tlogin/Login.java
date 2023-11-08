package com.example.tlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText edtuser = (EditText) findViewById(R.id.edtUser);
        EditText edtpass = (EditText) findViewById(R.id.edtPass);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        TextView link = (TextView) findViewById(R.id.txtlink);
        // link for signup
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),SignUp.class);
                startActivity(a);
            }
        });
        // button login click
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check condition username and password
                if(edtuser.getText().toString().trim().equals(emp.Username.trim()) &&
                        edtpass.getText().toString().trim().equals(emp.Password.trim())){
                   Intent i = new Intent(getApplicationContext(),MainActivity.class);
                   i.putExtra("username",edtuser.getText().toString());
                   startActivity(i);
                }else{
                    Toast.makeText(Login.this, "ກະລຸນາປ້ອນລະຫັດໃໝ່",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}