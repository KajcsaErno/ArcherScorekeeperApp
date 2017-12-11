package com.example.android.archerscorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreArcher1 = 0;
    int scoreArcher2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayForArcher1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForArcher2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add10ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 10;
        displayForArcher1(scoreArcher1);

    }

    public void add10ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 10;
        displayForArcher2(scoreArcher2);

    }

    public void add9ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 9;
        displayForArcher1(scoreArcher1);

    }

    public void add9ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 9;
        displayForArcher2(scoreArcher2);

    }

    public void add8ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 8;
        displayForArcher1(scoreArcher1);

    }

    public void add8ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 8;
        displayForArcher2(scoreArcher2);

    }

    public void add7ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 7;
        displayForArcher1(scoreArcher1);

    }

    public void add7ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 7;
        displayForArcher2(scoreArcher2);

    }

    public void add6ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 6;
        displayForArcher1(scoreArcher1);

    }

    public void add6ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 6;
        displayForArcher2(scoreArcher2);

    }

    public void add5ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 5;
        displayForArcher1(scoreArcher1);

    }

    public void add5ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 5;
        displayForArcher2(scoreArcher2);

    }

    public void add4ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 4;
        displayForArcher1(scoreArcher1);

    }

    public void add4ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 4;
        displayForArcher2(scoreArcher2);

    }

    public void add3ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 3;
        displayForArcher1(scoreArcher1);

    }

    public void add3ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 3;
        displayForArcher2(scoreArcher2);

    }

    public void add2ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 2;
        displayForArcher1(scoreArcher1);

    }

    public void add2ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 2;
        displayForArcher2(scoreArcher2);

    }

    public void add1ForArch1(View view) {
        scoreArcher1 = scoreArcher1 + 1;
        displayForArcher1(scoreArcher1);

    }

    public void add1ForArch2(View view) {
        scoreArcher2 = scoreArcher2 + 1;
        displayForArcher2(scoreArcher2);

    }

    public void ResetAll(View view) {
        scoreArcher1 = 0;
        scoreArcher2 = 0;
        displayForArcher1(0);
        displayForArcher2(0);
    }

}
