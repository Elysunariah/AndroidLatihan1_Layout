package com.rizki.androidlatihan1layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_login2);
//        username = findViewById(R.id.username);
//        password = findViewById(R.id.password);
//        button = findViewById(R.id.login);
//
//        button.setOnClickListener(v -> {
//
//        });

    }

    public void pencet(View v){

    }

}
