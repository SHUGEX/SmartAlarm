package com.example.smartalarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class Tab3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab3);
    }
    public void tb1(View view) {
        startActivity(new Intent(this, Tab1.class));
    }
    public void tb2(View view) {
        startActivity(new Intent(this, Tab2.class));
    }
    public void tb4(View view) {
        startActivity(new Intent(this, Tab4.class));
    }
}
