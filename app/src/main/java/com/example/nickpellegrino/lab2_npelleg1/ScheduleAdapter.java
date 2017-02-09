package com.example.nickpellegrino.lab2_npelleg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nickpellegrino on 2/8/17.
 */

public class ScheduleAdapter extends ArrayAdapter<String> {

    String[] opponents;
    String[] times;
    int[] logos;

    ScheduleAdapter (Context context, String[] schedule, String[] dates, int[] images) {
        super(context, R.layout.schedule_item, schedule);
        opponents = schedule;
        times = dates;
        logos = images;
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater scheduleInflater = LayoutInflater.from(getContext());
        View scheduleView = scheduleInflater.inflate(R.layout.schedule_item, null, true);

        TextView teamName = (TextView) scheduleView.findViewById(R.id.teamTextView);
        TextView date = (TextView) scheduleView.findViewById(R.id.dateTextView);
        ImageView logo = (ImageView) scheduleView.findViewById(R.id.imageView1);

        teamName.setText(opponents[position]);
        date.setText(times[position]);
        int mDrawable = logos[position];

        logo.setImageResource(mDrawable);
        return scheduleView;
    }
}
