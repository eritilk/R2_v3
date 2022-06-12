package com.example.r2_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SecActivity extends AppCompatActivity {

    private Button back_button;
    private Spinner v_team_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sec);

        Team.initTeam();
        v_team_spinner = (Spinner) findViewById(R.id.visiting_team_spinner);
        SpinnerAdapter customAdapter = new SpinnerAdapter(this, R.layout.custom_spinner_adapter, Team.getTeamArrayList());
        v_team_spinner.setAdapter(customAdapter);

        Spinner v_p1_spinner = (Spinner) findViewById(R.id.v_player_1);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.players_paok, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        v_p1_spinner.setAdapter(adapter2);
        Spinner v_p2_spinner = (Spinner) findViewById(R.id.v_player_2);
        v_p2_spinner.setAdapter(adapter2);
        Spinner v_p3_spinner = (Spinner) findViewById(R.id.v_player_3);
        v_p3_spinner.setAdapter(adapter2);
        Spinner v_p4_spinner = (Spinner) findViewById(R.id.v_player_4);
        v_p4_spinner.setAdapter(adapter2);
        Spinner v_p5_spinner = (Spinner) findViewById(R.id.v_player_5);
        v_p5_spinner.setAdapter(adapter2);
        Spinner v_p6_spinner = (Spinner) findViewById(R.id.v_player_6);
        v_p6_spinner.setAdapter(adapter2);
        Spinner v_p7_spinner = (Spinner) findViewById(R.id.v_player_7);
        v_p7_spinner.setAdapter(adapter2);
        Spinner v_p8_spinner = (Spinner) findViewById(R.id.v_player_8);
        v_p8_spinner.setAdapter(adapter2);
        Spinner v_p9_spinner = (Spinner) findViewById(R.id.v_player_9);
        v_p9_spinner.setAdapter(adapter2);
        Spinner v_p10_spinner = (Spinner) findViewById(R.id.v_player_10);
        v_p10_spinner.setAdapter(adapter2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setIcon(R.drawable.esake30th);

        back_button = (Button) findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();

            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}