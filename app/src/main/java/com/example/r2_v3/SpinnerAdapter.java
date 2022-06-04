package com.example.r2_v3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SpinnerAdapter extends ArrayAdapter<Team> {

    LayoutInflater layoutInflater;

    public SpinnerAdapter(@NonNull Context context, int resource, @NonNull List<Team> teams) {
        super(context, resource, teams);
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = layoutInflater.inflate(R.layout.custom_spinner_adapter, null, true);
        Team team = getItem(position);
        TextView textView = (TextView) rowView.findViewById(R.id.teamnametextview);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.teamlogoimageview);
        textView.setText(team.getName());
        imageView.setImageResource(team.getImage());
        return rowView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.custom_spinner_adapter, parent, false);
        Team team = getItem(position);
        TextView textView = (TextView) convertView.findViewById(R.id.teamnametextview);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.teamlogoimageview);
        textView.setText(team.getName());
        imageView.setImageResource(team.getImage());
        return convertView;
    }
}
