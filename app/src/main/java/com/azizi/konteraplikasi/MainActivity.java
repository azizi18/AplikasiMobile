package com.azizi.konteraplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsa(View view) {
        Intent intent= new Intent(MainActivity.this,Activityisipulsa.class);
        startActivity(intent);
    }

    public void data(View view) {
        Intent intent= new Intent(MainActivity.this,Activityisidata.class);
        startActivity(intent);
    }
}