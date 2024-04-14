package com.example.tiketsayaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInAct extends AppCompatActivity {

    TextView btn_new_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
            btn_new_account = findViewById(R.id.btn_new_account);

            btn_new_account.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent gotoRegisterOne = new Intent(SignInAct.this, RegisterOneAct.class);
                    startActivity(gotoRegisterOne);
                }
            });
    }
}