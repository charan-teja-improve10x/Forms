package com.improve10X.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button signupBtn = findViewById(R.id.signup_btn);
        signupBtn.setOnClickListener(view -> {
            Toast.makeText(this, "Sign Up success", Toast.LENGTH_SHORT).show();
        });
    }
}