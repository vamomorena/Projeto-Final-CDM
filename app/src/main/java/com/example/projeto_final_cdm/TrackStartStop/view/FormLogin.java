package com.example.projeto_final_cdm.TrackStartStop.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projeto_final_cdm.R;

public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        getSupportActionBar().hide();
    }

    public void goToMain(View view) {
        Intent intent = new Intent(FormLogin.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
