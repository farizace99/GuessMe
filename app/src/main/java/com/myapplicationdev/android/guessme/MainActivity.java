package com.myapplicationdev.android.guessme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imgLeft, imgMiddle, imgRight;
    Button btnStartGame;
    List<Integer> answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartGame = findViewById(R.id.btnNewGame);

        imgLeft = findViewById(R.id.ivLeft);
        imgMiddle = findViewById(R.id.ivMiddle);
        imgRight = findViewById(R.id.ivRight);

        answers = new ArrayList<>();

        answers.add(107);
        answers.add(207);
        answers.add(407);

        Collections.shuffle(answers);

        btnStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(answers);

                imgLeft.setImageResource(R.drawable.questionmark);
                imgMiddle.setImageResource(R.drawable.questionmark);
                imgRight.setImageResource(R.drawable.questionmark);

                Animation animLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation animMiddle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation animRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                imgLeft.startAnimation(animLeft);
                imgMiddle.startAnimation(animMiddle);
                imgRight.startAnimation(animRight);
            }
        });

        imgLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answers.get(0) == 107) {
                    imgLeft.setImageResource(R.drawable.happyemoji);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else if (answers.get(0) == 207) {
                    imgLeft.setImageResource(R.drawable.upsetemoji);
                    Toast.makeText(MainActivity.this, "Oops you got it wrong!", Toast.LENGTH_SHORT).show();
                } else if (answers.get(0) == 407) {
                    imgLeft.setImageResource(R.drawable.upsetemoji);
                    Toast.makeText(MainActivity.this, "Oops you got it wrong!", Toast.LENGTH_SHORT).show();
                }

                if (answers.get(1) == 107) {
                    imgMiddle.setImageResource(R.drawable.happyemoji);
                } else if (answers.get(1) == 207) {
                    imgMiddle.setImageResource(R.drawable.upsetemoji);
                } else if (answers.get(1) == 407) {
                    imgMiddle.setImageResource(R.drawable.upsetemoji);
                }

                if (answers.get(2) == 107) {
                    imgRight.setImageResource(R.drawable.happyemoji);
                } else if (answers.get(2) == 207) {
                    imgRight.setImageResource(R.drawable.upsetemoji);
                } else if (answers.get(2) == 407) {
                    imgRight.setImageResource(R.drawable.upsetemoji);
                }
            }
        });

        imgMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answers.get(1) == 107) {
                    imgMiddle.setImageResource(R.drawable.happyemoji);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else if (answers.get(1) == 207) {
                    imgMiddle.setImageResource(R.drawable.upsetemoji);
                    Toast.makeText(MainActivity.this, "Oops you got it wrong!", Toast.LENGTH_SHORT).show();
                } else if (answers.get(1) == 407) {
                    imgMiddle.setImageResource(R.drawable.upsetemoji);
                    Toast.makeText(MainActivity.this, "Oops you got it wrong!", Toast.LENGTH_SHORT).show();
                }

                if (answers.get(0) == 107) {
                    imgLeft.setImageResource(R.drawable.happyemoji);
                } else if (answers.get(0) == 207) {
                    imgLeft.setImageResource(R.drawable.upsetemoji);
                } else if (answers.get(0) == 407) {
                    imgLeft.setImageResource(R.drawable.upsetemoji);
                }

                if (answers.get(2) == 107) {
                    imgRight.setImageResource(R.drawable.happyemoji);
                } else if (answers.get(2) == 207) {
                    imgRight.setImageResource(R.drawable.upsetemoji);
                } else if (answers.get(2) == 407) {
                    imgRight.setImageResource(R.drawable.upsetemoji);
                }
            }
        });

        imgRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answers.get(2) == 107) {
                    imgRight.setImageResource(R.drawable.happyemoji);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else if (answers.get(2) == 207) {
                    imgRight.setImageResource(R.drawable.upsetemoji);
                    Toast.makeText(MainActivity.this, "Oops you got it wrong!", Toast.LENGTH_SHORT).show();
                } else if (answers.get(2) == 407) {
                    imgRight.setImageResource(R.drawable.upsetemoji);
                    Toast.makeText(MainActivity.this, "Oops you got it wrong!", Toast.LENGTH_SHORT).show();
                }

                if (answers.get(1) == 107) {
                    imgMiddle.setImageResource(R.drawable.happyemoji);
                } else if (answers.get(1) == 207) {
                    imgMiddle.setImageResource(R.drawable.upsetemoji);
                } else if (answers.get(1) == 407) {
                    imgMiddle.setImageResource(R.drawable.upsetemoji);
                }

                if (answers.get(0) == 107) {
                    imgLeft.setImageResource(R.drawable.happyemoji);
                } else if (answers.get(0) == 207) {
                    imgLeft.setImageResource(R.drawable.upsetemoji);
                } else if (answers.get(0) == 407) {
                    imgLeft.setImageResource(R.drawable.upsetemoji);
                }
            }
        });
    }
}
