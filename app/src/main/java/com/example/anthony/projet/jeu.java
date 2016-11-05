package com.example.anthony.projet;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;

import static com.example.anthony.projet.MainActivity.bateau;
import static com.example.anthony.projet.MainActivity.black;
import static com.example.anthony.projet.MainActivity.blue;
import static com.example.anthony.projet.MainActivity.camion;
import static com.example.anthony.projet.MainActivity.cinq;
import static com.example.anthony.projet.MainActivity.deux;
import static com.example.anthony.projet.MainActivity.fusee;
import static com.example.anthony.projet.MainActivity.green;
import static com.example.anthony.projet.MainActivity.quatre;
import static com.example.anthony.projet.MainActivity.red;
import static com.example.anthony.projet.MainActivity.taxi;
import static com.example.anthony.projet.MainActivity.trois;
import static com.example.anthony.projet.MainActivity.un;
import static com.example.anthony.projet.MainActivity.velo;
import static com.example.anthony.projet.MainActivity.yellow;


/**
 * Created by Anthony on 30/10/2016.
 */

public class jeu extends Activity {

    LinearLayout mLinearLayout;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeu);

        mLinearLayout = new LinearLayout(this);

        final ImageView i = new ImageView(this);
        final ImageView i2 = new ImageView(this);
        final ImageView i3 = new ImageView(this);
        ImageView i4 = new ImageView(this);
        ImageView i5 = new ImageView(this);
        final ImageView i6 = new ImageView(this);

        Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random rand4 = new Random();
        Random rand5 = new Random();
        Random rand6 = new Random();

        final int x = rand.nextInt(850);
        final int y = rand.nextInt(850);
        final int z = rand.nextInt(1600);
        final int t = rand.nextInt(1600);

        final int x2 = rand2.nextInt(650 - (-200)+1) -200;
        final int y2 = rand2.nextInt(650 - (-200)+1) -200;
        final int z2 = rand2.nextInt(1600);
        final int t2 = rand2.nextInt(1600);

        final int x3 = rand3.nextInt(450 - (-400)+1) -400;
        final int y3 = rand3.nextInt(450 - (-400)+1) -400;
        final int z3 = rand3.nextInt(1600);
        final int t3 = rand3.nextInt(1600);

        int x4 = rand4.nextInt(250 - (-600)+1) -600;
        int y4 = rand4.nextInt(250 - (-600)+1) -600;
        int z4 = rand4.nextInt(1600);
        int t4 = rand4.nextInt(1600);

        int x5 = rand5.nextInt(50 - (-800)+1) -800;
        int y5 = rand5.nextInt(50 - (-800)+1) -800;
        int z5 = rand5.nextInt(1600);
        int t5 = rand5.nextInt(1600);

        int x6 = rand6.nextInt(800);
        int y6 = rand6.nextInt(800);
        int z6 = rand6.nextInt(1600);
        int t6 = rand6.nextInt(1600);

        if(bateau.getScaleX() == 1.5f) {

            if(black.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i5.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);
                    i5.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }

            if(blue.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i5.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);
                    i5.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(green.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.GREEN);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i5.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);
                    i5.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(yellow.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i5.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);
                    i5.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(red.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.bateau);
                    i2.setImageResource(R.drawable.bateau);
                    i3.setImageResource(R.drawable.bateau);
                    i4.setImageResource(R.drawable.bateau);
                    i5.setImageResource(R.drawable.bateau);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);
                    i5.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


        }

        if(camion.getScaleX() == 1.5f) {

            if(black.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i5.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);
                    i5.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }

            if(blue.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i5.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);
                    i5.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(green.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.GREEN);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i5.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);
                    i5.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(yellow.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i5.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);
                    i5.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(red.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.camion);
                    i2.setImageResource(R.drawable.camion);
                    i3.setImageResource(R.drawable.camion);
                    i4.setImageResource(R.drawable.camion);
                    i5.setImageResource(R.drawable.camion);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);
                    i5.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


        }

        if(fusee.getScaleX() == 1.5f) {

            if(black.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i5.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);
                    i5.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }

            if(blue.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i5.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);
                    i5.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(green.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.GREEN);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i5.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);
                    i5.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(yellow.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i5.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);
                    i5.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(red.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.fusee);
                    i2.setImageResource(R.drawable.fusee);
                    i3.setImageResource(R.drawable.fusee);
                    i4.setImageResource(R.drawable.fusee);
                    i5.setImageResource(R.drawable.fusee);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);
                    i5.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


        }



        if(taxi.getScaleX() == 1.5f) {

            if(black.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    TranslateAnimation move6 = new TranslateAnimation(x2, y2, z2, t2);
                    move6.setDuration(4000);
                    move6.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i6.setImageResource(R.drawable.taxi);
                    i.setAdjustViewBounds(true);
                    i6.setAdjustViewBounds(true);


                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i6.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);
                    i6.setColorFilter(Color.BLACK);

                    i.startAnimation(move);
                    i6.startAnimation(move6);

                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i6);
                    setContentView(mLinearLayout);

                   /* i6.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            taxi.setScaleX(2.5f);
                            taxi.setScaleY(2.5f);
                        }
                    });*/


                }


                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i5.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);
                    i5.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }

            if(blue.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);

                    i6.setImageResource(R.drawable.taxi);
                    i6.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i5.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);
                    i5.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(green.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.GREEN);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i5.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);
                    i5.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(yellow.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i5.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);
                    i5.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(red.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.taxi2);
                    i2.setImageResource(R.drawable.taxi2);
                    i3.setImageResource(R.drawable.taxi2);
                    i4.setImageResource(R.drawable.taxi2);
                    i5.setImageResource(R.drawable.taxi2);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);
                    i5.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


        }


        if(velo.getScaleX() == 1.5f) {

            if(black.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i5.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLACK);
                    i2.setColorFilter(Color.BLACK);
                    i3.setColorFilter(Color.BLACK);
                    i4.setColorFilter(Color.BLACK);
                    i5.setColorFilter(Color.BLACK);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }

            if(blue.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i5.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);
                    i3.setColorFilter(Color.BLUE);
                    i4.setColorFilter(Color.BLUE);
                    i5.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(green.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.GREEN);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.BLUE);
                    i2.setColorFilter(Color.BLUE);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i5.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.GREEN);
                    i2.setColorFilter(Color.GREEN);
                    i3.setColorFilter(Color.GREEN);
                    i4.setColorFilter(Color.GREEN);
                    i5.setColorFilter(Color.GREEN);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(yellow.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i5.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.YELLOW);
                    i2.setColorFilter(Color.YELLOW);
                    i3.setColorFilter(Color.YELLOW);
                    i4.setColorFilter(Color.YELLOW);
                    i5.setColorFilter(Color.YELLOW);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


            if(red.getScaleX() == 1.5f) {

                if (un.getScaleX() == 1.5f) {

                    TranslateAnimation move = new TranslateAnimation(x, y, z, t);
                    move.setDuration(4000);
                    move.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);

                    i.startAnimation(move);

                    mLinearLayout.addView(i);
                    setContentView(mLinearLayout);

                }

                if (deux.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    setContentView(mLinearLayout);

                }

                if (trois.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    setContentView(mLinearLayout);

                }

                if (quatre.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    setContentView(mLinearLayout);

                }

                if (cinq.getScaleX() == 1.5f) {

                    TranslateAnimation move1 = new TranslateAnimation(x, y, z, t);
                    move1.setDuration(4000);
                    move1.setFillAfter(true);

                    TranslateAnimation move2 = new TranslateAnimation(x2, y2, z2, t2);
                    move2.setDuration(4000);
                    move2.setFillAfter(true);

                    TranslateAnimation move3 = new TranslateAnimation(x3, y3, z3, t3);
                    move3.setDuration(4000);
                    move3.setFillAfter(true);

                    TranslateAnimation move4 = new TranslateAnimation(x4, y4, z4, t4);
                    move4.setDuration(4000);
                    move4.setFillAfter(true);

                    TranslateAnimation move5 = new TranslateAnimation(x5, y5, z5, t5);
                    move5.setDuration(4000);
                    move5.setFillAfter(true);

                    i.setImageResource(R.drawable.velo);
                    i2.setImageResource(R.drawable.velo);
                    i3.setImageResource(R.drawable.velo);
                    i4.setImageResource(R.drawable.velo);
                    i5.setImageResource(R.drawable.velo);
                    i.setAdjustViewBounds(true);
                    i2.setAdjustViewBounds(true);
                    i3.setAdjustViewBounds(true);
                    i4.setAdjustViewBounds(true);
                    i5.setAdjustViewBounds(true);

                    i.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i2.setLayoutParams(new Gallery.LayoutParams(200,
                            200));
                    i3.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i4.setLayoutParams(new Gallery.LayoutParams(200, 200));
                    i5.setLayoutParams(new Gallery.LayoutParams(200, 200));

                    i.setColorFilter(Color.RED);
                    i2.setColorFilter(Color.RED);
                    i3.setColorFilter(Color.RED);
                    i4.setColorFilter(Color.RED);
                    i5.setColorFilter(Color.RED);

                    i.startAnimation(move1);
                    i2.startAnimation(move2);
                    i3.startAnimation(move3);
                    i4.startAnimation(move4);
                    i5.startAnimation(move5);



                    mLinearLayout.addView(i);
                    mLinearLayout.addView(i2);
                    mLinearLayout.addView(i3);
                    mLinearLayout.addView(i4);
                    mLinearLayout.addView(i5);
                    setContentView(mLinearLayout);

                }

            }


        }

    }

}