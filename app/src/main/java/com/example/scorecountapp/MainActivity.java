package com.example.scorecountapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;// declare the global variable so that we can use anytime and anywhere in the projects
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(0);
        displayScoreForTeamB(0);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeforTeamA(View view) // addded the methods for the adding 3 points in score
    {
        scoreTeamA = scoreTeamA + 3;
        displayScoreForTeamA(scoreTeamA);// print the score of the team A by adding the 3 points
    }

    public void addTwoforTeamA(View view)  //addded the methods for the adding 2 points in score
    {
        scoreTeamA = scoreTeamA + 2;        // print the score of the team A by adding the 2 points
        displayScoreForTeamA(scoreTeamA);
    }

    public void addOneforTeamA(View view) //addded the methods for the adding 1 points in score
    {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);  //print the score of the team A by adding the 1 points
    }
    //---------------------------------------------------------------------------------------------------

    public void addThreeforTeamB(View v) // addded the methods for the adding 3 points in score
    {
        scoreTeamB = scoreTeamB + 3;
        displayScoreForTeamB(scoreTeamB);// print the score of the team A by adding the 3 points
    }

    public void addTwoforTeamB(View v)  //addded the methods for the adding 2 points in score
    {
        scoreTeamB = scoreTeamB + 2;        // print the score of the team A by adding the 2 points
        displayScoreForTeamB(scoreTeamB);
    }

    public void addOneforTeamB(View v) //addded the methods for the adding 1 points in score
    {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);  //print the score of the team A by adding the 1 points
    }
    public void resetScore(View view){
        scoreTeamA =0;
        scoreTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);

    }

}