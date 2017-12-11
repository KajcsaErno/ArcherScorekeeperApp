package com.example.android.archerscorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String ARCHER_KEY1 = "archer1";
    private static final String ARCHER_KEY2 = "archer2";


    private  int scoreArcher1;
    private int scoreArcher2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            scoreArcher1 = savedInstanceState.getInt(ARCHER_KEY1,0);
            scoreArcher2 = savedInstanceState.getInt(ARCHER_KEY2,0);
        }

        displayForArcher1(scoreArcher1);
        displayForArcher2(scoreArcher2);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Save away the original text, so we still have it if the activity
        // needs to be killed while paused.
        super.onSaveInstanceState(outState);
        //  key - value pair
        outState.putInt(ARCHER_KEY1, scoreArcher1);
        outState.putInt(ARCHER_KEY2, scoreArcher2);

      /*  Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
        Log.d("onSaveInstanceState", "onSaveInstanceState()");*/

    }

    int newArcher1 = 0;
    int newArcher2 = 0;

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // restore saved values
        newArcher1 = savedInstanceState.getInt("archer1",0);
        newArcher2 = savedInstanceState.getInt("archer2",0);

       /* Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
        Log.i("onRestoreInstanceState", "onRestoreInstanceState()"); */

    }


    public void displayForArcher1(int score) {
        TextView scoreView =  findViewById(R.id.archer_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForArcher2(int score) {
        TextView scoreView = findViewById(R.id.archer_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add10ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 10;
        displayForArcher1(scoreArcher1);

    }

    public void add10ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 10;
        displayForArcher2(scoreArcher2);

    }
    public void add9ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 9;
        displayForArcher1(scoreArcher1);

    }

    public void add9ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 9;
        displayForArcher2(scoreArcher2);

    }
    public void add8ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 8;
        displayForArcher1(scoreArcher1);

    }

    public void add8ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 8;
        displayForArcher2(scoreArcher2);

    }
    public void add7ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 7;
        displayForArcher1(scoreArcher1);

    }

    public void add7ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 7;
        displayForArcher2(scoreArcher2);

    }

    public void add6ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 6;
        displayForArcher1(scoreArcher1);

    }

    public void add6ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 6;
        displayForArcher2(scoreArcher2);

    }

    public void add5ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 5;
        displayForArcher1(scoreArcher1);

    }

    public void add5ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 5;
        displayForArcher2(scoreArcher2);

    }
    public void add4ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 4;
        displayForArcher1(scoreArcher1);

    }

    public void add4ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 +4;
        displayForArcher2(scoreArcher2);

    }

    public void add3ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 3;
        displayForArcher1(scoreArcher1);

    }

    public void add3ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 3;
        displayForArcher2(scoreArcher2);

    }

    public void add2ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 2;
        displayForArcher1(scoreArcher1);

    }

    public void add2ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 2;
        displayForArcher2(scoreArcher2);

    }

    public void add1ForArch1 (View view) {
        scoreArcher1 = scoreArcher1 + 1;
        displayForArcher1(scoreArcher1);

    }

    public void add1ForArch2 (View view) {
        scoreArcher2 = scoreArcher2 + 1;
        displayForArcher2(scoreArcher2);

    }

    public void ResetAll (View view) {
        scoreArcher1 = 0;
        scoreArcher2 = 0;
        displayForArcher1(0);
        displayForArcher2(0);
    }



}
