package com.example.smartalarm;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Tab1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);
    }
    public void tb2(View view) {
        startActivity(new Intent(this, Tab2.class));
    }
    public void tb3(View view) {
        startActivity(new Intent(this, Tab3.class));
    }
    public void tb4(View view) {
        startActivity(new Intent(this, Tab4.class));
    }
    public void tb_time(View v){
        Calendar calendar=Calendar.getInstance();
        new TimePickerDialog( this,
                new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                String text="你选择了"+hourOfDay+"时"+minute+"分";
                Toast.makeText( Tab1.this, text, Toast.LENGTH_SHORT ).show();
            }
        }
                ,calendar.get(Calendar.HOUR_OF_DAY)
                ,calendar.get(Calendar.MINUTE),true).show();
        new DatePickerDialog( this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker,int year, int month, int dayOfMonth) {
                        String text = "你选择了：" + year + "年" + (month + 1) + "月" + dayOfMonth + "日";
                        Toast.makeText( Tab1.this, text, Toast.LENGTH_SHORT ).show();
                    }
                }
                ,calendar.get(Calendar.YEAR)
                ,calendar.get(Calendar.MONTH)
                ,calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

}
