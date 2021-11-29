package com.example.pam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
boolean checked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sprawdz(View view) {
        checked=!checked;
        Button tempButton = findViewById(R.id.przycisk);
        tempButton.setEnabled(checked);

    }
    public void dalej(View view){

    }
}