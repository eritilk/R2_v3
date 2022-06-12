package com.example.r2_v3;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    private Spinner h_team_spinner;
    private Button next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Team.initTeam();
        h_team_spinner = (Spinner) findViewById(R.id.home_team_spinner);
        SpinnerAdapter customAdapter = new SpinnerAdapter(this, R.layout.custom_spinner_adapter, Team.getTeamArrayList());
        h_team_spinner.setAdapter(customAdapter);

        Spinner h_p1_spinner = (Spinner) findViewById(R.id.h_player_1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.players_aek, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        h_p1_spinner.setAdapter(adapter);
        Spinner h_p2_spinner = (Spinner) findViewById(R.id.h_player_2);
        h_p2_spinner.setAdapter(adapter);
        Spinner h_p3_spinner = (Spinner) findViewById(R.id.h_player_3);
        h_p3_spinner.setAdapter(adapter);
        Spinner h_p4_spinner = (Spinner) findViewById(R.id.h_player_4);
        h_p4_spinner.setAdapter(adapter);
        Spinner h_p5_spinner = (Spinner) findViewById(R.id.h_player_5);
        h_p5_spinner.setAdapter(adapter);
        Spinner h_p6_spinner = (Spinner) findViewById(R.id.h_player_6);
        h_p6_spinner.setAdapter(adapter);
        Spinner h_p7_spinner = (Spinner) findViewById(R.id.h_player_7);
        h_p7_spinner.setAdapter(adapter);
        Spinner h_p8_spinner = (Spinner) findViewById(R.id.h_player_8);
        h_p8_spinner.setAdapter(adapter);
        Spinner h_p9_spinner = (Spinner) findViewById(R.id.h_player_9);
        h_p9_spinner.setAdapter(adapter);
        Spinner h_p10_spinner = (Spinner) findViewById(R.id.h_player_10);
        h_p10_spinner.setAdapter(adapter);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.esake30th);

        next_button = (Button) findViewById(R.id.next_button);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecActivity();

            }
        });
    }
    public void openSecActivity() {
        Intent intent = new Intent(this, SecActivity.class);
        startActivity(intent);
    }
}