package com.example.smartalarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Tab2 extends AppCompatActivity {
    private final static String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2);
    }

    public void tb1(View view) {
            startActivity(new Intent(this, Tab1.class));
    }
    public void tb3(View view) {
        startActivity(new Intent(this, Tab3.class));
    }
    public void tb4(View view) {
        startActivity(new Intent(this, Tab4.class));
    }


}