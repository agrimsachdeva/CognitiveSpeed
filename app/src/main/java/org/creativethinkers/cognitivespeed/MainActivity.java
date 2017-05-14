package org.creativethinkers.cognitivespeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int rand1;
    private int rand2;
    private int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // executed when the app loads up
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = 0;

        pickRandonMunbers();
    }

    private void pickRandonMunbers() {
        //pick random numbers
        Random random = new Random();
        rand1 = random.nextInt(10);
        while(true) {
            rand2 = random.nextInt(10);
            if (rand1 != rand2) {break;}
        }
        Button lbutt = (Button) findViewById(R.id.left_button);
        lbutt.setText(Integer.toString(rand1));
        Button rbutt = (Button) findViewById(R.id.right_button);
        rbutt.setText(Integer.toString(rand2));
    }


    public void leftButtonClick(View view) {
        if (rand1 > rand2) {
            points ++;
        } else {
            points --;
        }

        TextView tv = (TextView) findViewById(R.id.points_field);
        tv.setText("Points: " + points);

        pickRandonMunbers();
    }

    public void rightButtonClick(View view) {
        if (rand1 < rand2) {
            points ++;
        } else {
            points --;
        }

        TextView tv = (TextView) findViewById(R.id.points_field);
        tv.setText("Points: " + points);

        pickRandonMunbers();
    }
}
