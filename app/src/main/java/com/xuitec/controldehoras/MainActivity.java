package com.xuitec.controldehoras;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import com.shrikanthravi.collapsiblecalendarview.data.Day;
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    CollapsibleCalendar mCalendar;
    FloatingActionButton mAddButton;
    Calendar mCurrentDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalendar = findViewById(R.id.calendar);
//        mAddButton = findViewById(R.id.fbAdd);

        mCurrentDate = Calendar.getInstance();

        mCalendar.setCalendarListener(new CollapsibleCalendar.CalendarListener() {
            @Override
            public void onDaySelect() {
//                Day day = viewCalendar.getSelectedDay();
//                mCurrentDate.set(y,m,d);
            }

            @Override
            public void onItemClick(View view) {

            }

            @Override
            public void onDataUpdate() {

            }

            @Override
            public void onMonthChange() {

            }

            @Override
            public void onWeekChange(int i) {

            }
        });
//        mCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(CalendarView calendarView, int y, int m, int d) {
//
//            }
//        });
    }

    public void addHoras(View view) {
        Toast.makeText(this,mCurrentDate.get(Calendar.YEAR)+"-"
                +(mCurrentDate.get(Calendar.MONTH)+1)+"-"+mCurrentDate.get(Calendar.DAY_OF_MONTH)
                +"",Toast.LENGTH_SHORT).show();
    }
}
