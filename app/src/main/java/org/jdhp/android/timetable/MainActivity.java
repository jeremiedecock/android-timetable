package org.jdhp.android.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView timeTableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeTableView = (TextView) findViewById(R.id.tv_time_table);

        for(String timeStr: TimeTables.getTimeTable()) {
            timeTableView.append(timeStr + "\n");
        }
    }
}
