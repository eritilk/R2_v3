package com.example.r2_v3;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    private Spinner h_team_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Team.initTeam();
        h_team_spinner = (Spinner) findViewById(R.id.home_team_spinner);
        SpinnerAdapter customAdapter = new SpinnerAdapter(this, R.layout.custom_spinner_adapter, Team.getTeamArrayList());
        h_team_spinner.setAdapter(customAdapter);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.esake30th);
    }
}