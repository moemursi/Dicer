package com.mamapps.dicer;

import android.media.Image;
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
        ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","Button pressed !!!!! ");
                Random randomNum = new Random();
                int num = randomNum.nextInt(6);
                Log.d("dicee", "THE RANDOM NUMBER IS "+num);
            }
        });
    }
}
