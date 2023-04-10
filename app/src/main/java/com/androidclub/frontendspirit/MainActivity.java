package com.androidclub.frontendspirit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnSignUpMain, btnLoginMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUpMain = findViewById(R.id.btnSignUpMain);
        btnLoginMain = findViewById(R.id.btnLoginMain);

        btnSignUpMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, SignUpPage.class);
                startActivity(i);

            }
        });

        btnLoginMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(k);

            }
        });



    }
}