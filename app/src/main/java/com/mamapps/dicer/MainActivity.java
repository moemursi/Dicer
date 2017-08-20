package com.mamapps.dicer;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.roll_button);
        final int [] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.dice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","Button pressed !!!!! ");
                Random randomNum = new Random();
                int num = randomNum.nextInt(6);
                int num2 = randomNum.nextInt(6);
                Log.d("dicee", "THE RANDOM NUMBER IS "+num);

                leftDice.setImageResource(diceArray[num]);
                rightDice.setImageResource(diceArray[num2]);

                mp.start();

            }
        });
    }
}
