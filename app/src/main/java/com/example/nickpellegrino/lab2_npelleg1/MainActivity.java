package com.example.nickpellegrino.lab2_npelleg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String teamNames[] = {"Ohio State", "Florida State","Wake Forest",
                                "Boston College", "North Carolina State", "Georgia Tech",
                                "North Virginia", "Chicago Sate"};

        String gameDates[] = {"Feb 11", "Feb 14", "Feb 18", "Feb 26", "Mar 1", "Mar 4", "Mar 6", "Mar 11"};

        int images[] = {R.drawable.osu, R.drawable.fsu, R.drawable.wf,
                R.drawable.bc, R.drawable.nc_state, R.drawable.gt, R.drawable.nova, R.drawable.csu};

        ScheduleAdapter scheduleAdapter = new ScheduleAdapter(this, teamNames, gameDates, images);
        ListView scheduleListView = (ListView) findViewById(R.id.scheduleListView);
        scheduleListView.setAdapter(scheduleAdapter);

    }
}
