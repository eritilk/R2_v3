package com.example.r2_v3;

import java.util.ArrayList;

public class Team {
    private static ArrayList<Team> teamArrayList = new ArrayList<>();

    private String id;
    private String name;

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void initTeam() {
        Team AEK = new Team( "0", "AEK" );
        teamArrayList.add(AEK);
        Team ARIS = new Team( "1", "ARIS" );
        teamArrayList.add(ARIS);
        Team PAOK = new Team( "2", "PAOK" );
        teamArrayList.add(PAOK);
        Team OLYMPIAKOS = new Team( "3", "OLYMPIAKOS" );
        teamArrayList.add(OLYMPIAKOS);
        Team PANATHINAIKOS = new Team( "4", "PANATHINAIKOS" );
        teamArrayList.add(PANATHINAIKOS);
        Team PROMITHEAS = new Team( "5", "PROMITHEAS" );
        teamArrayList.add(PROMITHEAS);
        Team KOLOSSOS = new Team( "6", "KOLOSSOS" );
        teamArrayList.add(KOLOSSOS);
        Team PERISTERI = new Team( "7", "PERISTERI" );
        teamArrayList.add(PERISTERI);
        Team IONIKOS = new Team( "8", "IONIKOS" );
        teamArrayList.add(IONIKOS);
        Team PANIONIOS = new Team( "9", "PANIONIOS" );
        teamArrayList.add(PANIONIOS);
    }
    public int getImage(){
        switch (getId())
        {
            case "0":
                return R.drawable.aek;
            case "1":
                return R.drawable.aris;
            case "2":
                return R.drawable.paok;
            case "3":
                return R.drawable.olympiakos;
            case "4":
                return R.drawable.pao;
            case "5":
                return R.drawable.promitheas;
            case "6":
                return R.drawable.kolossos;
            case "7":
                return R.drawable.peristeri;
            case "8":
                return R.drawable.ionikos;
            case "9":
                return R.drawable.panionios;
        }
        return R.drawable.aek;
    }



    public static ArrayList<Team> getTeamArrayList(){
        return teamArrayList;
    }

}
