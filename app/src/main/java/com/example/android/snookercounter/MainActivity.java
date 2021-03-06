package com.example.android.snookercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button redButtonA;
    public Button redButtonB;
    int playerAScore = 0;
    int playerBScore = 0;
    int roundsCounterA = 0;
    int roundsCounterB = 0;
    int foulsCounterA = 0;
    int foulsCounterB = 0;
    int snookersCounterA = 0;
    int snookersCounterB = 0;
    int redBallCounter = 0;
    private EditText playerAName;
    private EditText playerBName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerAName = (EditText) findViewById(R.id.playerAName);
        playerBName = (EditText) findViewById(R.id.playerBName);
        redButtonA = (Button) findViewById(R.id.red_A);
        redButtonB = (Button) findViewById(R.id.red_B);

//        Saving values when rotating
        if (savedInstanceState != null) {
            playerAScore = savedInstanceState.getInt("playerAScore");
            playerBScore = savedInstanceState.getInt("playerBScore");
            roundsCounterA = savedInstanceState.getInt("roundsCounterA");
            roundsCounterB = savedInstanceState.getInt("roundsCounterB");
            foulsCounterA = savedInstanceState.getInt("foulsCounterA");
            foulsCounterB = savedInstanceState.getInt("foulsCounterB");
            snookersCounterA = savedInstanceState.getInt("snookersCounterA");
            snookersCounterB = savedInstanceState.getInt("snookersCounterB");
            redBallCounter = savedInstanceState.getInt("redBallCounter");
            if (redBallCounter >= 15) {
                redButtonA.setClickable(false);
                redButtonA.setBackgroundResource(R.drawable.gray_buttons);

                redButtonB.setClickable(false);
                redButtonB.setBackgroundResource(R.drawable.gray_buttons);
            }
            displayForPlayerA(playerAScore);
            displayForPlayerB(playerBScore);
            displayRoundsPlayerA(roundsCounterA);
            displayRoundsPlayerB(roundsCounterB);
            displayFoulsPlayerA(foulsCounterA);
            displayFoulsPlayerB(foulsCounterB);
            displaySnookersPlayerA(snookersCounterA);
            displaySnookersPlayerB(snookersCounterB);
        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("playerAScore", playerAScore);
        outState.putInt("playerBScore", playerBScore);
        outState.putInt("roundsCounterA", roundsCounterA);
        outState.putInt("roundsCounterB", roundsCounterB);
        outState.putInt("foulsCounterA", foulsCounterA);
        outState.putInt("foulsCounterB", foulsCounterB);
        outState.putInt("snookersCounterA", snookersCounterA);
        outState.putInt("snookersCounterB", snookersCounterB);
        outState.putInt("redBallCounter", redBallCounter);
    }

    /**
     * Displays the given score for player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRoundsPlayerA(int rounds) {
        TextView roundsView = (TextView) findViewById(R.id.rounds_counterA);
        roundsView.setText(String.valueOf(rounds));
    }

    public void displayFoulsPlayerA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.fouls_counterA);
        foulsView.setText(String.valueOf(fouls));
    }

    public void displaySnookersPlayerA(int snookers) {
        TextView snookersView = (TextView) findViewById(R.id.snookers_counterA);
        snookersView.setText(String.valueOf(snookers));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRoundsPlayerB(int rounds) {
        TextView scoreView = (TextView) findViewById(R.id.rounds_counterB);
        scoreView.setText(String.valueOf(rounds));
    }

    public void displayFoulsPlayerB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_counterB);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displaySnookersPlayerB(int snookers) {
        TextView scoreView = (TextView) findViewById(R.id.snookers_counterB);
        scoreView.setText(String.valueOf(snookers));
    }


    /**
     * Displaying points for player A
     */


    public void displayRedPlayerA(View view) {

        if (redBallCounter < 15) {
            redBallCounter = redBallCounter + 1;
        }

        if (redBallCounter >= 15) {
            redButtonA.setClickable(false);
            redButtonA.setBackgroundResource(R.drawable.gray_buttons);

            redButtonB.setClickable(false);
            redButtonB.setBackgroundResource(R.drawable.gray_buttons);
        }


        playerAScore = playerAScore + 1;
        displayForPlayerA(playerAScore);
    }

    public void displayYellowPlayerA(View view) {
        playerAScore = playerAScore + 2;
        displayForPlayerA(playerAScore);
    }

    public void displayBrownPlayerA(View view) {
        playerAScore = playerAScore + 3;
        displayForPlayerA(playerAScore);
    }

    public void displayGreenPlayerA(View view) {
        playerAScore = playerAScore + 4;
        displayForPlayerA(playerAScore);
    }

    public void displayBluePlayerA(View view) {
        playerAScore = playerAScore + 5;
        displayForPlayerA(playerAScore);
    }

    public void displayPinkPlayerA(View view) {
        playerAScore = playerAScore + 6;
        displayForPlayerA(playerAScore);
    }

    public void displayBlackPlayerA(View view) {
        playerAScore = playerAScore + 7;
        displayForPlayerA(playerAScore);
    }

    public void displayFoulFourPlayerA(View view) {
        playerBScore = playerBScore + 4;
        displayForPlayerB(playerBScore);
        foulsCounterA = foulsCounterA + 1;
        displayFoulsPlayerA(foulsCounterA);
    }

    public void displayFoulFivePlayerA(View view) {
        playerBScore = playerBScore + 5;
        displayForPlayerB(playerBScore);
        foulsCounterA = foulsCounterA + 1;
        displayFoulsPlayerA(foulsCounterA);
    }

    public void displayFoulSixPlayerA(View view) {
        playerBScore = playerBScore + 6;
        displayForPlayerB(playerBScore);
        foulsCounterA = foulsCounterA + 1;
        displayFoulsPlayerA(foulsCounterA);
    }

    public void displayFoulSevenPlayerA(View view) {
        playerBScore = playerBScore + 7;
        displayForPlayerB(playerBScore);
        foulsCounterA = foulsCounterA + 1;
        displayFoulsPlayerA(foulsCounterA);
    }

    public void displaySnookersForPlayerA(View view) {
        snookersCounterA = snookersCounterA + 1;
        displaySnookersPlayerA(snookersCounterA);
    }


    /**
     * Displaying points for player B
     */
    public void displayRedPlayerB(View view) {

        if (redBallCounter < 15) {
            redBallCounter = redBallCounter + 1;
        }

        if (redBallCounter >= 15) {
            redButtonA.setClickable(false);
            redButtonA.setBackgroundResource(R.drawable.gray_buttons);

            redButtonB.setClickable(false);
            redButtonB.setBackgroundResource(R.drawable.gray_buttons);
        }

        playerBScore = playerBScore + 1;
        displayForPlayerB(playerBScore);
    }

    public void displayYellowPlayerB(View view) {
        playerBScore = playerBScore + 2;
        displayForPlayerB(playerBScore);
    }

    public void displayBrownPlayerB(View view) {
        playerBScore = playerBScore + 3;
        displayForPlayerB(playerBScore);
    }

    public void displayGreenPlayerB(View view) {
        playerBScore = playerBScore + 4;
        displayForPlayerB(playerBScore);
    }

    public void displayBluePlayerB(View view) {
        playerBScore = playerBScore + 5;
        displayForPlayerB(playerBScore);
    }

    public void displayPinkPlayerB(View view) {
        playerBScore = playerBScore + 6;
        displayForPlayerB(playerBScore);
    }

    public void displayBlackPlayerB(View view) {
        playerBScore = playerBScore + 7;
        displayForPlayerB(playerBScore);
    }

    public void displayFoulFourPlayerB(View view) {
        playerAScore = playerAScore + 4;
        displayForPlayerA(playerAScore);
        foulsCounterB = foulsCounterB + 1;
        displayFoulsPlayerB(foulsCounterB);
    }

    public void displayFoulFivePlayerB(View view) {
        playerAScore = playerAScore + 5;
        displayForPlayerA(playerAScore);
        foulsCounterB = foulsCounterB + 1;
        displayFoulsPlayerB(foulsCounterB);
    }

    public void displayFoulSixPlayerB(View view) {
        playerAScore = playerAScore + 6;
        displayForPlayerA(playerAScore);
        foulsCounterB = foulsCounterB + 1;
        displayFoulsPlayerB(foulsCounterB);
    }

    public void displayFoulSevenPlayerB(View view) {
        playerAScore = playerAScore + 7;
        displayForPlayerA(playerAScore);
        foulsCounterB = foulsCounterB + 1;
        displayFoulsPlayerB(foulsCounterB);
    }

    public void displaySnookersForPlayerB(View view) {
        snookersCounterB = snookersCounterB + 1;
        displaySnookersPlayerB(snookersCounterB);
    }

    public void endRound(View view) {
        if (playerAScore > playerBScore) {
            roundsCounterA = roundsCounterA + 1;
        } else {
            roundsCounterB = roundsCounterB + 1;
        }

//        resetting values
        playerAScore = 0;
        playerBScore = 0;
        redBallCounter = 0;
        redButtonA.setClickable(true);
        redButtonA.setBackgroundResource(R.drawable.red_buttons);
        redButtonB.setClickable(true);
        redButtonB.setBackgroundResource(R.drawable.red_buttons);
        displayForPlayerA(playerAScore);
        displayForPlayerB(playerBScore);
        displayRoundsPlayerA(roundsCounterA);
        displayRoundsPlayerB(roundsCounterB);
    }

    public void endMatch(View view) {
        //        resetting values
        playerAScore = 0;
        playerBScore = 0;
        roundsCounterA = 0;
        roundsCounterB = 0;
        foulsCounterA = 0;
        foulsCounterB = 0;
        snookersCounterA = 0;
        snookersCounterB = 0;
        redBallCounter = 0;
        redButtonA.setClickable(true);
        redButtonA.setBackgroundResource(R.drawable.red_buttons);
        redButtonB.setClickable(true);
        redButtonB.setBackgroundResource(R.drawable.red_buttons);
        playerAName.setText(null);
        playerBName.setText(null);

        displayForPlayerA(playerAScore);
        displayForPlayerB(playerBScore);
        displayRoundsPlayerA(roundsCounterA);
        displayRoundsPlayerB(roundsCounterB);
        displayFoulsPlayerA(foulsCounterA);
        displayFoulsPlayerB(foulsCounterB);
        displaySnookersPlayerA(snookersCounterA);
        displaySnookersPlayerB(snookersCounterB);
    }


}
