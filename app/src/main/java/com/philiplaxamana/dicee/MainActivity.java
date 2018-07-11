package com.philiplaxamana.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                0,
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rng = new Random();
                int number = rng.nextInt(7-1)+1;
                int number2 = rng.nextInt(7-1)+1;

                int total = number + number2;

                Toast.makeText(MainActivity.this, "You rolled: "+total , Toast.LENGTH_SHORT).show();

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);
            }
        });
    }
}
