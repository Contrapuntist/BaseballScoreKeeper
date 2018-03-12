package com.example.android.baseballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//  global variables
    int scoreTeamA = 0;
    int hitsTeamA = 0;
    int errorsTeamA = 0;

    int scoreTeamB = 0;
    int hitsTeamB = 0;
    int errorsTeamB = 0;

    /*
     * Team A display score method
     */
    public void teamAScoreTotalDisplay (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Team B display score method
     */
    public void teamBScoreTotalDisplay (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Team A add run to score
     */
    public void addRunTeamA (View view) {
        scoreTeamA++;
        teamAScoreTotalDisplay(scoreTeamA);
    }

    public void addRunTeamB (View view) {
        scoreTeamB++;
        teamBScoreTotalDisplay(scoreTeamB);
    }

    public void displayTeamAHits (int hits) {
        TextView hitView = (TextView) findViewById(R.id.team_a_hits);
        hitView.setText(String.valueOf(hits));
    }

    public void displayTeamBHits (int hits) {
        TextView hitView = (TextView) findViewById(R.id.team_b_hits);
        hitView.setText(String.valueOf(hits));
    }

    public void addHitTeamA(View view) {
        hitsTeamA++;
        displayTeamAHits(hitsTeamA);
    }

    public void addHitTeamB(View view) {
        hitsTeamB++;
        displayTeamBHits(hitsTeamB);
    }

    public void displayTeamAErrors (int errors) {
        TextView errorView = (TextView) findViewById(R.id.team_a_errors);
        errorView.setText(String.valueOf(errors));
    }

    public void addErrorTeamA(View view) {
        errorsTeamA++;
        displayTeamAErrors(errorsTeamA);
    }

    public void displayTeamBErrors (int errors) {
        TextView errorView = (TextView) findViewById(R.id.team_b_errors);
        errorView.setText(String.valueOf(errors));
    }

    public void addErrorTeamB (View view) {
        errorsTeamB++;
        displayTeamBErrors(errorsTeamB);
    }

    public void gameReset (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        hitsTeamA = 0;
        hitsTeamB = 0;
        errorsTeamA = 0;
        errorsTeamB = 0;

        teamAScoreTotalDisplay(scoreTeamA);
        teamBScoreTotalDisplay(scoreTeamB);
        displayTeamAHits(hitsTeamA);
        displayTeamBHits(hitsTeamB);
        displayTeamAErrors(errorsTeamA);
        displayTeamBErrors(errorsTeamB);
    }
}
