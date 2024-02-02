package com.isac.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;

import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity
               implements  TimePickerDialog.OnTimeSetListener {
    private TextInputLayout fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullName = findViewById(R.id.full_name);
    }

    public void clickMainButton(View view) {
        Calendar currentCalender = Calendar.getInstance();
        int currentHour = currentCalender.get(Calendar.HOUR);
        int currentMinute = currentCalender.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, this, currentHour, currentMinute, true);
        timePickerDialog.show();

    }
    @Override
    public void onTimeSet(TimePicker view, int hour, int minute) {
        String date = hour + ":" + minute;
        Toast.makeText(this, date, Toast.LENGTH_SHORT).show();
    }
}