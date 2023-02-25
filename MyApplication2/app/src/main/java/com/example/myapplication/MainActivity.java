package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView title;
    private EditText email;
    private EditText password;
    private Button signIn;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.Title);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
        signIn = findViewById(R.id.SignIn);
        signUp = findViewById(R.id.SignUp);
        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == signIn && email.getText().toString().contains("@") && email.getText().toString().contains(".com")){
            password.setText(email.getText().toString());
        }
        if(v == signUp){
            Toast.makeText(getApplicationContext(),"Signup is under construction",Toast.LENGTH_SHORT).show();
        }


    }
}