package com.us.mattfein.ushistory;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;

public class  Quiz extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, question, highscore;
    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0, adCount;
    private int wrongCount = 0;
    private int mQuestionlength = mQuestions.mQuestions.length;
    ImageView wrong, right, wrong2, wrong3, incorrect;
    AlertDialog alert;
    InterstitialAd ad;
    Random r;
    MediaPlayer correctSound, wrongSound, gameover;
    ConstraintLayout questionbuttons;
    ConstraintLayout questionCard;
    SharedPreferences highscoreshare;
    SharedPreferences.Editor sharededitor;
    public static final String highscorekey = "HighFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ad = new InterstitialAd(this);
        ad.setAdUnitId("ca-app-pub-9642471534613521/5072090173");
        final AdRequest request = new AdRequest.Builder().build();
        ad.loadAd(request);
        ad.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                ad.loadAd(request);
            }
        });
        setContentView(R.layout.activity_quiz);
        setTitle("Trivia");

        correctSound = MediaPlayer.create(this, R.raw.correctsound);
        wrongSound = MediaPlayer.create(this, R.raw.wrongsound);
        gameover = MediaPlayer.create(this, R.raw.gameover);

        adCount = 0;
        r = new Random();
        highscoreshare = getSharedPreferences(highscorekey, Context.MODE_PRIVATE);
        sharededitor = highscoreshare.edit();
        questionCard = (ConstraintLayout) findViewById(R.id.questioncard);
        questionbuttons = (ConstraintLayout) findViewById(R.id.buttonslay);
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        wrong = (ImageView) findViewById(R.id.wrong);
        wrong2 = (ImageView) findViewById(R.id.wrong2);
        wrong3 = (ImageView) findViewById(R.id.wrong3);
        right = (ImageView) findViewById(R.id.correct);
        incorrect = (ImageView) findViewById(R.id.incorrect);


        score = (TextView) findViewById(R.id.score);
        highscore = (TextView) findViewById(R.id.high);
        question = (TextView) findViewById(R.id.question);
        setHigh();
        final AlertDialog alert = setUpAlert();
        score.setText("" + mScore);

        updateQuestion(r.nextInt(mQuestionlength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adCount++;
                turnofflisteners();
                if (answer1.getText() == mAnswer) {
                    correctSound.start();
                    mScore++;
                    score.setText("" + mScore);
                    right.setVisibility(View.VISIBLE);
                    new correctAsync().execute("");
                } else {
                    wrongSound.start();
                    answer1.setTextColor(getResources().getColor(R.color.colorAccent));
                    wrongCount = wrongCount + 1;
                    if (answer2.getText() == mAnswer) {
                        answer2.setTextColor(getResources().getColor(R.color.green));
                        answer2.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer3.getText() == mAnswer) {
                        answer3.setTextColor(getResources().getColor(R.color.green));
                        answer3.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer4.getText() == mAnswer) {
                        answer4.setTextColor(getResources().getColor(R.color.green));
                        answer4.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }


                }
                if(adCount%4 == 0) {
                    if (ad.isLoaded()) {
                        ad.show();
                    }
                }


            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adCount++;
                if(adCount%4 == 0) {
                    if (ad.isLoaded()) {
                        ad.show();
                    }
                }
                turnofflisteners();
                if (answer2.getText().toString() == mAnswer) {
                    correctSound.start();
                    mScore++;
                    score.setText("" + mScore);
                    right.setVisibility(View.VISIBLE);
                    new correctAsync().execute("");
                } else {
                    wrongSound.start();
                    answer2.setTextColor(getResources().getColor(R.color.colorAccent));
                    wrongCount = wrongCount + 1;
                    if (answer1.getText() == mAnswer) {
                        answer1.setTextColor(getResources().getColor(R.color.green));
                        answer1.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer3.getText() == mAnswer) {
                        answer3.setTextColor(getResources().getColor(R.color.green));
                        answer3.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer4.getText() == mAnswer) {
                        answer4.setTextColor(getResources().getColor(R.color.green));
                        answer4.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }


                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                adCount++;
                if(adCount%6 == 0) {
                    if (ad.isLoaded()) {
                        ad.show();
                    }
                }
                turnofflisteners();
                if (answer3.getText() == mAnswer) {
                    correctSound.start();
                    mScore++;
                    score.setText("" + mScore);
                    right.setVisibility(View.VISIBLE);
                    new correctAsync().execute("");

                } else {
                    wrongSound.start();
                    answer3.setTextColor(getResources().getColor(R.color.colorAccent));
                    wrongCount = wrongCount + 1;
                    if (answer1.getText() == mAnswer) {
                        answer1.setTextColor(getResources().getColor(R.color.green));
                        answer1.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer2.getText() == mAnswer) {
                        answer2.setTextColor(getResources().getColor(R.color.green));
                        answer2.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer4.getText() == mAnswer) {
                        answer4.setTextColor(getResources().getColor(R.color.green));
                        answer4.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }



                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adCount++;
                if(adCount%4 == 0) {
                    if (ad.isLoaded()) {
                        ad.show();
                    }
                }
                turnofflisteners();
                if (answer4.getText() == mAnswer) {
                    correctSound.start();
                    mScore++;
                    score.setText("" + mScore);
                    right.setVisibility(View.VISIBLE);

                    new correctAsync().execute("");

                } else {
                    wrongSound.start();
                    wrongCount = wrongCount + 1;
                    answer4.setTextColor(getResources().getColor(R.color.colorAccent));
                    if (answer1.getText() == mAnswer) {
                        answer1.setTextColor(getResources().getColor(R.color.green));
                        answer1.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer2.getText() == mAnswer) {
                        answer2.setTextColor(getResources().getColor(R.color.green));
                        answer2.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }
                    if (answer3.getText() == mAnswer) {
                        answer3.setTextColor(getResources().getColor(R.color.green));
                        answer3.setTextSize(18);
                        new wrongAsync().execute("");
                        checkNeg(alert);
                    }


                }
            }

        });


    }


    private void turnofflisteners(){
        answer1.setClickable(false);
        answer2.setClickable(false);
        answer3.setClickable(false);
        answer4.setClickable(false);

    }

    private void turnonListeners(){
        answer1.setClickable(true);
        answer2.setClickable(true);
        answer3.setClickable(true);
        answer4.setClickable(true);
    }

    private void checkNeg(AlertDialog alert) {
        if (wrongCount == 3) {
            gameover.start();
            turnofflisteners();
            showAlert(alert);
            highScore();

        }
    }

    private void showAlert(AlertDialog alert) {
        alert.show();
    }

    private void highScore(){
        int highvalue = highscoreshare.getInt("highvalue", 0);
        if(mScore > highvalue){
            sharededitor.putInt("highvalue", mScore);
            sharededitor.apply();
            String highest = Integer.toString(mScore);
            highscore.setText(highest);
        }

    }

    private void setHigh(){
        if(!highscoreshare.contains("initialized")){
            sharededitor.putBoolean("initialized", true);
            sharededitor.putInt("highvalue", 0);
            highscore.setText("0");
            sharededitor.apply();
        }
        else{
            int highvalue = highscoreshare.getInt("highvalue", 0);
            String highvaluetwo = Integer.toString(highvalue);
            highscore.setText(highvaluetwo);
        }

        }




    private void fixColors() {
        answer1.setTextSize(14);
        answer2.setTextSize(14);
        answer3.setTextSize(14);
        answer4.setTextSize(14);
        answer1.setTextColor(getResources().getColor(R.color.colorPrimary));
        answer2.setTextColor(getResources().getColor(R.color.colorPrimary));
        answer3.setTextColor(getResources().getColor(R.color.colorPrimary));
        answer4.setTextColor(getResources().getColor(R.color.colorPrimary));
    }


    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));
        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private AlertDialog setUpAlert() {
        alert = new AlertDialog.Builder(Quiz.this).create();
        alert.setTitle("Game Over");
        alert.setMessage("Would you like to play again?");
        alert.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mScore = 0;
                wrongCount = 0;
                updateQuestion(r.nextInt(mQuestionlength));
                score.setText("" + mScore);
                wrong.setVisibility(View.INVISIBLE);
                wrong2.setVisibility(View.INVISIBLE);
                wrong3.setVisibility(View.INVISIBLE);
                alert.dismiss();
                turnonListeners();
            }
        });
        alert.setButton(AlertDialog.BUTTON_NEGATIVE, "No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent home = new Intent(getApplication(), com.us.mattfein.ushistory.MainActivity.class);
                startActivity(home);
                alert.dismiss();

            }
        });
        return alert;

    }

    @Override
    public void onBackPressed() {
        View v = getLayoutInflater().inflate(R.layout.activity_main, null);
        NavigationView drawer = (NavigationView) v.findViewById(R.id.nav_view);
        drawer.setCheckedItem(R.id.home);
        Intent home = new Intent(getApplication(), com.us.mattfein.ushistory.MainActivity.class);
        startActivity(home);

    }




    private class correctAsync extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                return "Interrupted";
            }
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            final Animation slideout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideout);

                right.setVisibility(View.GONE);
                questionCard.startAnimation(slideout);
                questionbuttons.startAnimation(slideout);
                new otherAsync().execute("");


            }
        }



    private class wrongAsync extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                return "Interrupted";
            }
            return "Executed";
        }


        protected void onPostExecute(String result) {
            final Animation slideout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideout);
            final Animation slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.xdown);
            questionCard.startAnimation(slideout);
            questionbuttons.startAnimation(slideout);
            if(wrongCount == 1){
                wrong.setVisibility(View.VISIBLE);
                wrong.startAnimation(slideUp);

            }
            if(wrongCount == 2){
                wrong2.setVisibility(View.VISIBLE);
                wrong2.startAnimation(slideUp);
            }
            if(wrongCount == 3){
                wrong3.setVisibility(View.VISIBLE);
                wrong3.startAnimation(slideUp);
            }

            fixColors();
            new otherAsync().execute("");


        }
    }

        private class otherAsync extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {
                try {
                    Thread.sleep(450);
                } catch (InterruptedException e) {
                    return "Interrupted";
                }
                return "Executed";
            }

            protected void onPostExecute(String result) {
                turnonListeners();
                final Animation slidein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidein);
                questionCard.startAnimation(slidein);
                questionbuttons.startAnimation(slidein);
                updateQuestion(r.nextInt(mQuestionlength));

            }
        }
    }

