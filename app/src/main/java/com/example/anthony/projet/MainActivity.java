package com.example.anthony.projet;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {


    public static ImageView bateau;
    public static ImageView camion;
    public static ImageView fusee;
    public static ImageView taxi;
    public static ImageView velo;

    public static ImageView black;
    public static ImageView blue;
    public static ImageView green;
    public static ImageView yellow;
    public static ImageView red;

    public static TextView un;
    public static TextView deux;
    public static TextView trois;
    public static TextView quatre;
    public static TextView cinq;

    private static Button jouer;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bateau = (ImageView) findViewById(R.id.img1);
        camion = (ImageView) findViewById(R.id.img2);
        fusee = (ImageView) findViewById(R.id.img3);
        taxi = (ImageView) findViewById(R.id.img6);
        velo = (ImageView) findViewById(R.id.img7);

        black = (ImageView) findViewById(R.id.img10);
        blue = (ImageView) findViewById(R.id.img11);
        green = (ImageView) findViewById(R.id.img12);
        yellow = (ImageView) findViewById(R.id.img13);
        red = (ImageView) findViewById(R.id.img14);

        un = (TextView) findViewById(R.id.textView);
        deux = (TextView) findViewById(R.id.textView3);
        trois = (TextView) findViewById(R.id.textView4);
        quatre = (TextView) findViewById(R.id.textView5);
        cinq = (TextView) findViewById(R.id.textView6);

        jouer = (Button) findViewById(R.id.button);

        bateau.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bateau.getScaleX() == 1.5f){
                    bateau.setScaleX(1);
                    bateau.setScaleY(1);

                }
                if(camion.getScaleX() == 1.5f){
                    camion.setScaleX(1);
                    camion.setScaleY(1);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setScaleX(1);
                    fusee.setScaleY(1);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setScaleX(1);
                    taxi.setScaleY(1);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setScaleX(1);
                    velo.setScaleY(1);
                }

                    bateau.setScaleX(1.5f);
                    bateau.setScaleY(1.5f);

                if(bateau.getScaleX() == 1){
                    bateau.setColorFilter(Color.BLACK);
                }
                if(camion.getScaleX() == 1){
                    camion.setColorFilter(Color.BLACK);
                }
                if(fusee.getScaleX() == 1){
                    fusee.setColorFilter(Color.BLACK);
                }
                if(taxi.getScaleX() == 1){
                    taxi.setColorFilter(Color.BLACK);
                }
                if(velo.getScaleX() == 1){
                    velo.setColorFilter(Color.BLACK);
                }

                if(black.getScaleX() == 1.5f && bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.BLACK);
                }
                if(blue.getScaleX() == 1.5f && bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.BLUE);
                }
                if(green.getScaleX() == 1.5f && bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.GREEN);
                }
                if(yellow.getScaleX() == 1.5f && bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.YELLOW);
                }
                if(red.getScaleX() == 1.5f && bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.RED);
                }

            }
        });

        camion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bateau.getScaleX() == 1.5f){
                    bateau.setScaleX(1);
                    bateau.setScaleY(1);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setScaleX(1);
                    camion.setScaleY(1);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setScaleX(1);
                    fusee.setScaleY(1);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setScaleX(1);
                    taxi.setScaleY(1);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setScaleX(1);
                    velo.setScaleY(1);
                }
                  camion.setScaleX(1.5f);
                  camion.setScaleY(1.5f);

                if(bateau.getScaleX() == 1){
                    bateau.setColorFilter(Color.BLACK);
                }
                if(camion.getScaleX() == 1){
                    camion.setColorFilter(Color.BLACK);
                }
                if(fusee.getScaleX() == 1){
                    fusee.setColorFilter(Color.BLACK);
                }
                if(taxi.getScaleX() == 1){
                    taxi.setColorFilter(Color.BLACK);
                }
                if(velo.getScaleX() == 1){
                    velo.setColorFilter(Color.BLACK);
                }

                if(black.getScaleX() == 1.5f && camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.BLACK);
                }
                if(blue.getScaleX() == 1.5f && camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.BLUE);
                }
                if(green.getScaleX() == 1.5f && camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.GREEN);
                }
                if(yellow.getScaleX() == 1.5f && camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.YELLOW);
                }
                if(red.getScaleX() == 1.5f && camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.RED);
                }


            }
        });

        fusee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(bateau.getScaleX() == 1.5f){
                    bateau.setScaleX(1);
                    bateau.setScaleY(1);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setScaleX(1);
                    camion.setScaleY(1);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setScaleX(1);
                    fusee.setScaleY(1);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setScaleX(1);
                    taxi.setScaleY(1);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setScaleX(1);
                    velo.setScaleY(1);
                }
                    fusee.setScaleX(1.5f);
                    fusee.setScaleY(1.5f);

                if(bateau.getScaleX() == 1){
                    bateau.setColorFilter(Color.BLACK);
                }
                if(camion.getScaleX() == 1){
                    camion.setColorFilter(Color.BLACK);
                }
                if(fusee.getScaleX() == 1){
                    fusee.setColorFilter(Color.BLACK);
                }
                if(taxi.getScaleX() == 1){
                    taxi.setColorFilter(Color.BLACK);
                }
                if(velo.getScaleX() == 1){
                    velo.setColorFilter(Color.BLACK);
                }

                if(black.getScaleX() == 1.5f && fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.BLACK);
                }
                if(blue.getScaleX() == 1.5f && fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.BLUE);
                }
                if(green.getScaleX() == 1.5f && fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.GREEN);
                }
                if(yellow.getScaleX() == 1.5f && fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.YELLOW);
                }
                if(red.getScaleX() == 1.5f && fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.RED);
                }
            }
        });

        taxi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bateau.getScaleX() == 1.5f){
                    bateau.setScaleX(1);
                    bateau.setScaleY(1);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setScaleX(1);
                    camion.setScaleY(1);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setScaleX(1);
                    fusee.setScaleY(1);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setScaleX(1);
                    taxi.setScaleY(1);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setScaleX(1);
                    velo.setScaleY(1);
                }
                    taxi.setScaleX(1.5f);
                    taxi.setScaleY(1.5f);

                if(bateau.getScaleX() == 1){
                    bateau.setColorFilter(Color.BLACK);
                }
                if(camion.getScaleX() == 1){
                    camion.setColorFilter(Color.BLACK);
                }
                if(fusee.getScaleX() == 1){
                    fusee.setColorFilter(Color.BLACK);
                }
                if(taxi.getScaleX() == 1){
                    taxi.setColorFilter(Color.BLACK);
                }
                if(velo.getScaleX() == 1){
                    velo.setColorFilter(Color.BLACK);
                }

                if(black.getScaleX() == 1.5f && taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.BLACK);
                }
                if(blue.getScaleX() == 1.5f && taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.BLUE);
                }
                if(green.getScaleX() == 1.5f && taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.GREEN);
                }
                if(yellow.getScaleX() == 1.5f && taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.YELLOW);
                }
                if(red.getScaleX() == 1.5f && taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.RED);
                }

            }
        });

        velo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bateau.getScaleX() == 1.5f){
                    bateau.setScaleX(1);
                    bateau.setScaleY(1);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setScaleX(1);
                    camion.setScaleY(1);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setScaleX(1);
                    fusee.setScaleY(1);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setScaleX(1);
                    taxi.setScaleY(1);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setScaleX(1);
                    velo.setScaleY(1);
                }
                    velo.setScaleX(1.5f);
                    velo.setScaleY(1.5f);

                if(bateau.getScaleX() == 1){
                    bateau.setColorFilter(Color.BLACK);
                }
                if(camion.getScaleX() == 1){
                    camion.setColorFilter(Color.BLACK);
                }
                if(fusee.getScaleX() == 1){
                    fusee.setColorFilter(Color.BLACK);
                }
                if(taxi.getScaleX() == 1){
                    taxi.setColorFilter(Color.BLACK);
                }
                if(velo.getScaleX() == 1){
                    velo.setColorFilter(Color.BLACK);
                }

                if(black.getScaleX() == 1.5f && velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.BLACK);
                }
                if(blue.getScaleX() == 1.5f && velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.BLUE);
                }
                if(green.getScaleX() == 1.5f && velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.GREEN);
                }
                if(yellow.getScaleX() == 1.5f && velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.YELLOW);
                }
                if(red.getScaleX() == 1.5f && velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.RED);
                }

            }
        });


        black.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(black.getScaleX() == 1.5f){
                    black.setScaleX(1);
                    black.setScaleY(1);
                }
                if(blue.getScaleX() == 1.5f){
                    blue.setScaleX(1);
                    blue.setScaleY(1);
                }
                if(green.getScaleX() == 1.5f){
                    green.setScaleX(1);
                    green.setScaleY(1);
                }
                if(yellow.getScaleX() == 1.5f){
                    yellow.setScaleX(1);
                    yellow.setScaleY(1);
                }
                if(red.getScaleX() == 1.5f){
                    red.setScaleX(1);
                    red.setScaleY(1);
                }

                black.setScaleX(1.5f);
                black.setScaleY(1.5f);

                if(bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.BLACK);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.BLACK);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.BLACK);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.BLACK);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.BLACK);
                }
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(black.getScaleX() == 1.5f){
                    black.setScaleX(1);
                    black.setScaleY(1);
                }
                if(blue.getScaleX() == 1.5f){
                    blue.setScaleX(1);
                    blue.setScaleY(1);
                }
                if(green.getScaleX() == 1.5f){
                    green.setScaleX(1);
                    green.setScaleY(1);
                }
                if(yellow.getScaleX() == 1.5f){
                    yellow.setScaleX(1);
                    yellow.setScaleY(1);
                }
                if(red.getScaleX() == 1.5f){
                    red.setScaleX(1);
                    red.setScaleY(1);
                }

                blue.setScaleX(1.5f);
                blue.setScaleY(1.5f);

                if(bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.BLUE);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.BLUE);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.BLUE);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.BLUE);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.BLUE);
                }

            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(black.getScaleX() == 1.5f){
                    black.setScaleX(1);
                    black.setScaleY(1);
                }
                if(blue.getScaleX() == 1.5f){
                    blue.setScaleX(1);
                    blue.setScaleY(1);
                }
                if(green.getScaleX() == 1.5f){
                    green.setScaleX(1);
                    green.setScaleY(1);
                }
                if(yellow.getScaleX() == 1.5f){
                    yellow.setScaleX(1);
                    yellow.setScaleY(1);
                }
                if(red.getScaleX() == 1.5f){
                    red.setScaleX(1);
                    red.setScaleY(1);
                }

                green.setScaleX(1.5f);
                green.setScaleY(1.5f);

                if(bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.GREEN);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.GREEN);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.GREEN);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.GREEN);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.GREEN);
                }
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(black.getScaleX() == 1.5f){
                    black.setScaleX(1);
                    black.setScaleY(1);
                }
                if(blue.getScaleX() == 1.5f){
                    blue.setScaleX(1);
                    blue.setScaleY(1);
                }
                if(green.getScaleX() == 1.5f){
                    green.setScaleX(1);
                    green.setScaleY(1);
                }
                if(yellow.getScaleX() == 1.5f){
                    yellow.setScaleX(1);
                    yellow.setScaleY(1);
                }
                if(red.getScaleX() == 1.5f){
                    red.setScaleX(1);
                    red.setScaleY(1);
                }

                yellow.setScaleX(1.5f);
                yellow.setScaleY(1.5f);

                if(bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.YELLOW);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.YELLOW);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.YELLOW);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.YELLOW);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.YELLOW);
                }
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(black.getScaleX() == 1.5f){
                    black.setScaleX(1);
                    black.setScaleY(1);
                }
                if(blue.getScaleX() == 1.5f){
                    blue.setScaleX(1);
                    blue.setScaleY(1);
                }
                if(green.getScaleX() == 1.5f){
                    green.setScaleX(1);
                    green.setScaleY(1);
                }
                if(yellow.getScaleX() == 1.5f){
                    yellow.setScaleX(1);
                    yellow.setScaleY(1);
                }
                if(red.getScaleX() == 1.5f){
                    red.setScaleX(1);
                    red.setScaleY(1);
                }

                red.setScaleX(1.5f);
                red.setScaleY(1.5f);

                if(bateau.getScaleX() == 1.5f){
                    bateau.setColorFilter(Color.RED);
                }
                if(camion.getScaleX() == 1.5f){
                    camion.setColorFilter(Color.RED);
                }
                if(fusee.getScaleX() == 1.5f){
                    fusee.setColorFilter(Color.RED);
                }
                if(taxi.getScaleX() == 1.5f){
                    taxi.setColorFilter(Color.RED);
                }
                if(velo.getScaleX() == 1.5f){
                    velo.setColorFilter(Color.RED);
                }
            }
        });

        un.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(un.getScaleX() == 1.5f){
                    un.setScaleX(1);
                    un.setScaleY(1);
                }
                if(deux.getScaleX() == 1.5f){
                    deux.setScaleX(1);
                    deux.setScaleY(1);
                }
                if(trois.getScaleX() == 1.5f){
                    trois.setScaleX(1);
                    trois.setScaleY(1);
                }
                if(quatre.getScaleX() == 1.5f){
                    quatre.setScaleX(1);
                    quatre.setScaleY(1);
                }
                if(cinq.getScaleX() == 1.5f){
                    cinq.setScaleX(1);
                    cinq.setScaleY(1);
                }

                un.setScaleX(1.5f);
                un.setScaleY(1.5f);
            }
        });

        deux.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(un.getScaleX() == 1.5f){
                    un.setScaleX(1);
                    un.setScaleY(1);
                }
                if(deux.getScaleX() == 1.5f){
                    deux.setScaleX(1);
                    deux.setScaleY(1);
                }
                if(trois.getScaleX() == 1.5f){
                    trois.setScaleX(1);
                    trois.setScaleY(1);
                }
                if(quatre.getScaleX() == 1.5f){
                    quatre.setScaleX(1);
                    quatre.setScaleY(1);
                }
                if(cinq.getScaleX() == 1.5f){
                    cinq.setScaleX(1);
                    cinq.setScaleY(1);
                }

                deux.setScaleX(1.5f);
                deux.setScaleY(1.5f);
            }
        });

        trois.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(un.getScaleX() == 1.5f){
                    un.setScaleX(1);
                    un.setScaleY(1);
                }
                if(deux.getScaleX() == 1.5f){
                    deux.setScaleX(1);
                    deux.setScaleY(1);
                }
                if(trois.getScaleX() == 1.5f){
                    trois.setScaleX(1);
                    trois.setScaleY(1);
                }
                if(quatre.getScaleX() == 1.5f){
                    quatre.setScaleX(1);
                    quatre.setScaleY(1);
                }
                if(cinq.getScaleX() == 1.5f){
                    cinq.setScaleX(1);
                    cinq.setScaleY(1);
                }

                trois.setScaleX(1.5f);
                trois.setScaleY(1.5f);
            }
        });

        quatre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(un.getScaleX() == 1.5f){
                    un.setScaleX(1);
                    un.setScaleY(1);
                }
                if(deux.getScaleX() == 1.5f){
                    deux.setScaleX(1);
                    deux.setScaleY(1);
                }
                if(trois.getScaleX() == 1.5f){
                    trois.setScaleX(1);
                    trois.setScaleY(1);
                }
                if(quatre.getScaleX() == 1.5f){
                    quatre.setScaleX(1);
                    quatre.setScaleY(1);
                }
                if(cinq.getScaleX() == 1.5f){
                    cinq.setScaleX(1);
                    cinq.setScaleY(1);
                }

                quatre.setScaleX(1.5f);
                quatre.setScaleY(1.5f);
            }
        });

        cinq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(un.getScaleX() == 1.5f){
                    un.setScaleX(1);
                    un.setScaleY(1);
                }
                if(deux.getScaleX() == 1.5f){
                    deux.setScaleX(1);
                    deux.setScaleY(1);
                }
                if(trois.getScaleX() == 1.5f){
                    trois.setScaleX(1);
                    trois.setScaleY(1);
                }
                if(quatre.getScaleX() == 1.5f){
                    quatre.setScaleX(1);
                    quatre.setScaleY(1);
                }
                if(cinq.getScaleX() == 1.5f){
                    cinq.setScaleX(1);
                    cinq.setScaleY(1);
                }

                cinq.setScaleX(1.5f);
                cinq.setScaleY(1.5f);
            }
        });

        jouer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                if(bateau.getScaleX() == 1 && camion.getScaleX() == 1 && fusee.getScaleX() == 1 && taxi.getScaleX() == 1 && velo.getScaleX() == 1 || black.getScaleX() == 1 && blue.getScaleX() == 1 && green.getScaleX() == 1 && yellow.getScaleX() == 1 && red.getScaleX() == 1 || un.getScaleX() == 1 && deux.getScaleX() == 1 && trois.getScaleX() == 1 && quatre.getScaleX() == 1 && cinq.getScaleX() == 1){

                    AlertDialog ad = new AlertDialog.Builder(MainActivity.this).create();
                    ad.setTitle("Erreur !");
                    ad.setMessage("Sélectionnez un objet, une couleur et un chiffre");
                    ad.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    ad.show();

                }

                else{
                    Intent i = new Intent(getApplicationContext(),jeu.class);
                    startActivity(i);
                }

            }
        });


    }

}
