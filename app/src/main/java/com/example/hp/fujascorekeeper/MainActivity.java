package com.example.hp.fujascorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3TeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        display1(scoreTeamA);
    }

    public void add2TeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        display1(scoreTeamA);
    }

    public void add1TeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        display1(scoreTeamA);
    }

    public void add3TeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        display2(scoreTeamB);
    }

    public void add2TeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        display2(scoreTeamB);
    }

    public void add1TeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        display2(scoreTeamB);
    }


    public void display1(int record) {
        TextView newTextView = (TextView) findViewById(R.id.recordTeamA);
        newTextView.setText(String.valueOf(record));
    }

    public void display2(int record) {
        TextView newTextView = (TextView) findViewById(R.id.recordTeamB);
        newTextView.setText(String.valueOf(record));
    }


    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        display1(scoreTeamA);
        display2(scoreTeamB);
    }


}
