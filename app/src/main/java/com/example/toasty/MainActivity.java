package com.example.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.simpleDeepakToast(this,"My NeW gAME");
    }
}