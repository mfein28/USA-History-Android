package com.us.mattfein.ushistory;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.util.Date;

public class TodayHistory extends AppCompatActivity {

    CompactCalendarView compactCalendarView;
    ImageButton button;
    private String TAG;
    ConstraintLayout infoCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_history);
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(null);
        final Animation slideRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideout);
        final Animation slideLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideleft);
        infoCard = (ConstraintLayout) findViewById(R.id.dayhistorytextcard);
        TAG = "Day";
        String TAG2 = "OtherDay";
        String mydate = java.text.DateFormat.getDateTimeInstance().format(java.util.Calendar.getInstance().getTime());
        getStartMonth(mydate, actionBar);


        compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendarView.setVisibility(View.VISIBLE);
        compactCalendarView.showCalendarWithAnimation();
        compactCalendarView.setFirstDayOfWeek(Calendar.MONDAY);



        ImageView left = (ImageView) findViewById(R.id.left);
        ImageView right = (ImageView) findViewById(R.id.right);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compactCalendarView.startAnimation(slideLeft);
                new slideAnim().execute("");
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compactCalendarView.startAnimation(slideRight);
                new otherSlideAnim().execute("");
            }
        });

        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {

            @Override
            public void onDayClick(Date dateClicked) {
                int month = dateClicked.getMonth();

                Log.d(TAG, dateClicked.toString());
                if (month == 0) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 0, actionBar).execute("");
                }
                if (month == 1) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 1, actionBar).execute("");
                }
                if (month == 2) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 2, actionBar).execute("");
                }
                if (month == 3) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 3, actionBar).execute("");
                }
                if (month == 4) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 4, actionBar).execute("");
                }
                if (month == 5) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 5, actionBar).execute("");
                }
                if (month == 6) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 6, actionBar).execute("");

                }
                if (month == 7) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 7, actionBar).execute("");
                }
                if (month == 8) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 8, actionBar).execute("");
                }
                if (month == 9) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 9, actionBar).execute("");
                }
                if (month == 10) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 10, actionBar).execute("");
                }
                if (month == 11) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(dateClicked.toString(), 11, actionBar).execute("");
                }
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                int newmonth = firstDayOfNewMonth.getMonth();
                if (newmonth == 0) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 0, actionBar).execute("");
                }
                if (newmonth == 1) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 1, actionBar).execute("");
                }
                if (newmonth == 2) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 2, actionBar).execute("");
                }
                if (newmonth == 3) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 3, actionBar).execute("");
                }
                if (newmonth == 4) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 4, actionBar).execute("");
                }
                if (newmonth == 5) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 5, actionBar).execute("");
                }
                if (newmonth == 6) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 6, actionBar).execute("");

                }
                if (newmonth == 7) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 7, actionBar).execute("");
                }
                if (newmonth == 8) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 8, actionBar).execute("");
                }
                if (newmonth == 9) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 9, actionBar).execute("");
                }
                if (newmonth == 10) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 10, actionBar).execute("");
                }
                if (newmonth == 11) {
                    infoCard.startAnimation(slideRight);
                    new cardslidein(firstDayOfNewMonth.toString(), 11, actionBar).execute("");
                }
            }
        });
    }


    public void january(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);

        if (datefinal == 01) {
            actionBar.setTitle("January 1st");
            dayText.setText(R.string.jan1);
            dayyear.setText(R.string.jan1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("January 2nd");
            dayText.setText(R.string.jan2);
            dayyear.setText(R.string.jan2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("January 3rd");
            dayText.setText(R.string.jan3);
            dayyear.setText(R.string.jan3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("January 4th");
            dayText.setText(R.string.jan4);
            dayyear.setText(R.string.jan4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("January 5th");
            dayText.setText(R.string.jan5);
            dayyear.setText(R.string.jan5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("January 6th");
            dayText.setText(R.string.jan6);
            dayyear.setText(R.string.jan6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("January 7th");
            dayText.setText(R.string.jan7);
            dayyear.setText(R.string.jan7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("January 8th");
            dayText.setText(R.string.jan8);
            dayyear.setText(R.string.jan8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("January 9th");
            dayText.setText(R.string.jan9);
            dayyear.setText(R.string.jan9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("January 10th");
            dayText.setText(R.string.jan10);
            dayyear.setText(R.string.jan10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("January 11th");
            dayText.setText(R.string.jan11);
            dayyear.setText(R.string.jan11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("January 12th");
            dayText.setText(R.string.jan12);
            dayyear.setText(R.string.jan12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("January 13th");
            dayText.setText(R.string.jan13);
            dayyear.setText(R.string.jan13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("January 14th");
            dayText.setText(R.string.jan14);
            dayyear.setText(R.string.jan14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("January 15th");
            dayText.setText(R.string.jan15);
            dayyear.setText(R.string.jan15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("January 16th");
            dayText.setText(R.string.jan16);
            dayyear.setText(R.string.jan16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("January 17th");
            dayText.setText(R.string.jan17);
            dayyear.setText(R.string.jan17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("January 18th");
            dayText.setText(R.string.jan18);
            dayyear.setText(R.string.jan18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("January 19th");
            dayText.setText(R.string.jan19);
            dayyear.setText(R.string.jan19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("January 20th");
            dayText.setText(R.string.jan20);
            dayyear.setText(R.string.jan20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("January 21st");
            dayText.setText(R.string.jan21);
            dayyear.setText(R.string.jan21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("January 22nd");
            dayText.setText(R.string.jan22);
            dayyear.setText(R.string.jan22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("January 23rd");
            dayText.setText(R.string.jan23);
            dayyear.setText(R.string.jan23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("January 24th");
            dayText.setText(R.string.jan24);
            dayyear.setText(R.string.jan24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("January 25th");
            dayText.setText(R.string.jan25);
            dayyear.setText(R.string.jan25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("January 26th");
            dayText.setText(R.string.jan26);
            dayyear.setText(R.string.jan26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("January 27th");
            dayText.setText(R.string.jan27);
            dayyear.setText(R.string.jan27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("January 28th");
            dayText.setText(R.string.jan27);
            dayyear.setText(R.string.jan27year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("January 29th");
            dayText.setText(R.string.jan29);
            dayyear.setText(R.string.jan29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("January 30th");
            dayText.setText(R.string.jan30);
            dayyear.setText(R.string.jan30year);
        }
        if (datefinal == 31) {
            actionBar.setTitle("January 31st");
            dayText.setText(R.string.jan30);
            dayyear.setText(R.string.jan30year);
        }
    }

    public void february(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("February 1st");
            dayText.setText(R.string.feb1);
            dayyear.setText(R.string.feb1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("February 2nd");
            dayText.setText(R.string.feb2);
            dayyear.setText(R.string.feb2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("February 3rd");
            dayText.setText(R.string.feb3);
            dayyear.setText(R.string.feb3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("February 4th");
            dayText.setText(R.string.feb4);
            dayyear.setText(R.string.feb4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("January 5th");
            dayText.setText(R.string.feb5);
            dayyear.setText(R.string.feb5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("February 6th");
            dayText.setText(R.string.feb6);
            dayyear.setText(R.string.feb6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("February 7th");
            dayText.setText(R.string.feb7);
            dayyear.setText(R.string.feb7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("February 8th");
            dayText.setText(R.string.feb8);
            dayyear.setText(R.string.feb8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("February 9th");
            dayText.setText(R.string.feb9);
            dayyear.setText(R.string.feb9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("February 10th");
            dayText.setText(R.string.feb10);
            dayyear.setText(R.string.feb10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("February 11th");
            dayText.setText(R.string.feb11);
            dayyear.setText(R.string.feb11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("February 12th");
            dayText.setText(R.string.feb12);
            dayyear.setText(R.string.feb12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("February 13th");
            dayText.setText(R.string.feb13);
            dayyear.setText(R.string.feb13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("February 14th");
            dayText.setText(R.string.feb14);
            dayyear.setText(R.string.feb14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("February 15th");
            dayText.setText(R.string.feb15);
            dayyear.setText(R.string.feb15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("February 16th");
            dayText.setText(R.string.feb16);
            dayyear.setText(R.string.feb16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("February 17th");
            dayText.setText(R.string.feb17);
            dayyear.setText(R.string.feb17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("February 18th");
            dayText.setText(R.string.feb18);
            dayyear.setText(R.string.feb18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("February 19th");
            dayText.setText(R.string.feb19);
            dayyear.setText(R.string.feb19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("February 20th");
            dayText.setText(R.string.feb20);
            dayyear.setText(R.string.feb20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("February 21st");
            dayText.setText(R.string.feb21);
            dayyear.setText(R.string.feb21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("February 22nd");
            dayText.setText(R.string.feb22);
            dayyear.setText(R.string.feb22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("February 23rd");
            dayText.setText(R.string.feb23);
            dayyear.setText(R.string.feb23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("February 24th");
            dayText.setText(R.string.feb24);
            dayyear.setText(R.string.feb24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("February 25th");
            dayText.setText(R.string.feb25);
            dayyear.setText(R.string.feb25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("February 26th");
            dayText.setText(R.string.feb26);
            dayyear.setText(R.string.feb26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("February 27th");
            dayText.setText(R.string.feb27);
            dayyear.setText(R.string.feb27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("February 28th");
            dayText.setText(R.string.feb28);
            dayyear.setText(R.string.feb28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("February 29th");
            dayText.setText(R.string.feb29);
            dayyear.setText(R.string.feb29year);
        }
    }

    public void march(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("March 1st");
            dayText.setText(R.string.mar29);
            dayyear.setText(R.string.mar1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("March 2nd");
            dayText.setText(R.string.mar2);
            dayyear.setText(R.string.mar2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("March 3rd");
            dayText.setText(R.string.mar3);
            dayyear.setText(R.string.mar3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("March 4th");
            dayText.setText(R.string.mar4);
            dayyear.setText(R.string.mar4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("March 5th");
            dayText.setText(R.string.mar5);
            dayyear.setText(R.string.mar5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("March 6th");
            dayText.setText(R.string.mar6);
            dayyear.setText(R.string.mar6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("March 7th");
            dayText.setText(R.string.mar7);
            dayyear.setText(R.string.mar7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("March 8th");
            dayText.setText(R.string.mar8);
            dayyear.setText(R.string.mar8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("March 9th");
            dayText.setText(R.string.mar9);
            dayyear.setText(R.string.mar9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("March 10th");
            dayText.setText(R.string.mar10);
            dayyear.setText(R.string.mar10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("March 11th");
            dayText.setText(R.string.mar11);
            dayyear.setText(R.string.mar11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("March 12th");
            dayText.setText(R.string.mar12);
            dayyear.setText(R.string.mar12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("March 13th");
            dayText.setText(R.string.mar13);
            dayyear.setText(R.string.mar13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("March 14th");
            dayText.setText(R.string.mar14);
            dayyear.setText(R.string.mar14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("March 15th");
            dayText.setText(R.string.mar15);
            dayyear.setText(R.string.mar15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("March 16th");
            dayText.setText(R.string.mar16);
            dayyear.setText(R.string.mar16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("March 17th");
            dayText.setText(R.string.mar17);
            dayyear.setText(R.string.mar17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("March 18th");
            dayText.setText(R.string.mar18);
            dayyear.setText(R.string.mar18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("March 19th");
            dayText.setText(R.string.mar19);
            dayyear.setText(R.string.mar19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("March 20th");
            dayText.setText(R.string.mar20);
            dayyear.setText(R.string.mar20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("March 21st");
            dayText.setText(R.string.mar21);
            dayyear.setText(R.string.mar21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("March 22nd");
            dayText.setText(R.string.mar22);
            dayyear.setText(R.string.mar22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("March 23rd");
            dayText.setText(R.string.mar23);
            dayyear.setText(R.string.mar23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("March 24th");
            dayText.setText(R.string.mar24);
            dayyear.setText(R.string.mar24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("March 25th");
            dayText.setText(R.string.mar25);
            dayyear.setText(R.string.mar25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("March 26th");
            dayText.setText(R.string.mar26);
            dayyear.setText(R.string.mar26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("March 27th");
            dayText.setText(R.string.mar27);
            dayyear.setText(R.string.mar27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("March 28th");
            dayText.setText(R.string.mar28);
            dayyear.setText(R.string.mar28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("March 29th");
            dayText.setText(R.string.mar29);
            dayyear.setText(R.string.mar29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("March 30th");
            dayText.setText(R.string.mar30);
            dayyear.setText(R.string.mar30year);
        }
        if (datefinal == 31) {
            actionBar.setTitle("March 31st");
            dayText.setText(R.string.mar31);
            dayyear.setText(R.string.mar31year);
        }
    }

    public void april(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("April 1st");
            dayText.setText(R.string.apr1);
            dayyear.setText(R.string.apr1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("April 2nd");
            dayText.setText(R.string.apr2);
            dayyear.setText(R.string.apr2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("April 3rd");
            dayText.setText(R.string.apr3);
            dayyear.setText(R.string.apr3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("April 4th");
            dayText.setText(R.string.apr4);
            dayyear.setText(R.string.apr4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("April 5th");
            dayText.setText(R.string.apr5);
            dayyear.setText(R.string.apr5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("April 6th");
            dayText.setText(R.string.apr6);
            dayyear.setText(R.string.apr6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("April 7th");
            dayText.setText(R.string.apr7);
            dayyear.setText(R.string.apr7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("April 8th");
            dayText.setText(R.string.apr8);
            dayyear.setText(R.string.apr8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("April 9th");
            dayText.setText(R.string.apr9);
            dayyear.setText(R.string.apr9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("April 10th");
            dayText.setText(R.string.apr10);
            dayyear.setText(R.string.apr10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("April 11th");
            dayText.setText(R.string.apr11);
            dayyear.setText(R.string.apr11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("April 12th");
            dayText.setText(R.string.apr12);
            dayyear.setText(R.string.apr12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("April 13th");
            dayText.setText(R.string.apr13);
            dayyear.setText(R.string.apr13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("April 14th");
            dayText.setText(R.string.apr14);
            dayyear.setText(R.string.apr14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("April 15th");
            dayText.setText(R.string.apr15);
            dayyear.setText(R.string.apr15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("April 16th");
            dayText.setText(R.string.apr16);
            dayyear.setText(R.string.apr16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("April 17th");
            dayText.setText(R.string.apr17);
            dayyear.setText(R.string.apr17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("April 18th");
            dayText.setText(R.string.apr18);
            dayyear.setText(R.string.apr18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("April 19th");
            dayText.setText(R.string.apr19);
            dayyear.setText(R.string.apr19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("April 20th");
            dayText.setText(R.string.apr20);
            dayyear.setText(R.string.apr20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("April 21st");
            dayText.setText(R.string.apr21);
            dayyear.setText(R.string.apr21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("April 22nd");
            dayText.setText(R.string.apr22);
            dayyear.setText(R.string.apr22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("April 23rd");
            dayText.setText(R.string.apr23);
            dayyear.setText(R.string.apr23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("April 24th");
            dayText.setText(R.string.apr24);
            dayyear.setText(R.string.apr24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("April 25th");
            dayText.setText(R.string.apr25);
            dayyear.setText(R.string.apr25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("April 26th");
            dayText.setText(R.string.apr26);
            dayyear.setText(R.string.apr26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("April 27th");
            dayText.setText(R.string.apr27);
            dayyear.setText(R.string.apr27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("April 28th");
            dayText.setText(R.string.apr28);
            dayyear.setText(R.string.apr28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("April 29th");
            dayText.setText(R.string.apr29);
            dayyear.setText(R.string.apr29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("April 30th");
            dayText.setText(R.string.apr30);
            dayyear.setText(R.string.apr30year);
        }
    }

    public void may(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("May 1st");
            dayText.setText(R.string.may1);
            dayyear.setText(R.string.may1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("May 2nd");
            dayText.setText(R.string.may2);
            dayyear.setText(R.string.may2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("May 3rd");
            dayText.setText(R.string.may3);
            dayyear.setText(R.string.may3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("May 4th");
            dayText.setText(R.string.may4);
            dayyear.setText(R.string.may4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("May 5th");
            dayText.setText(R.string.may5);
            dayyear.setText(R.string.may5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("May 6th");
            dayText.setText(R.string.may6);
            dayyear.setText(R.string.may6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("May 7th");
            dayText.setText(R.string.may7);
            dayyear.setText(R.string.may7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("May 8th");
            dayText.setText(R.string.may8);
            dayyear.setText(R.string.may8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("May 9th");
            dayText.setText(R.string.may9);
            dayyear.setText(R.string.may9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("May 10th");
            dayText.setText(R.string.may10);
            dayyear.setText(R.string.may10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("May 11th");
            dayText.setText(R.string.may11);
            dayyear.setText(R.string.may11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("May 12th");
            dayText.setText(R.string.may12);
            dayyear.setText(R.string.may12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("May 13th");
            dayText.setText(R.string.may13);
            dayyear.setText(R.string.may13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("May 14th");
            dayText.setText(R.string.may14);
            dayyear.setText(R.string.may14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("May 15th");
            dayText.setText(R.string.may15);
            dayyear.setText(R.string.may15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("May 16th");
            dayText.setText(R.string.may16);
            dayyear.setText(R.string.may16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("May 17th");
            dayText.setText(R.string.may17);
            dayyear.setText(R.string.may17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("May 18th");
            dayText.setText(R.string.may18);
            dayyear.setText(R.string.may18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("May 19th");
            dayText.setText(R.string.may19);
            dayyear.setText(R.string.may19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("May 20th");
            dayText.setText(R.string.may20);
            dayyear.setText(R.string.may20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("May 21st");
            dayText.setText(R.string.may21);
            dayyear.setText(R.string.may21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("May 22nd");
            dayText.setText(R.string.may22);
            dayyear.setText(R.string.may22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("May 23rd");
            dayText.setText(R.string.may23);
            dayyear.setText(R.string.may23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("May 24th");
            dayText.setText(R.string.may24);
            dayyear.setText(R.string.may24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("May 25th");
            dayText.setText(R.string.may25);
            dayyear.setText(R.string.may25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("May 26th");
            dayText.setText(R.string.may26);
            dayyear.setText(R.string.may26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("May 27th");
            dayText.setText(R.string.may27);
            dayyear.setText(R.string.may27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("May 28th");
            dayText.setText(R.string.may28);
            dayyear.setText(R.string.may28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("May 29th");
            dayText.setText(R.string.may29);
            dayyear.setText(R.string.may29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("May 30th");
            dayText.setText(R.string.may30);
            dayyear.setText(R.string.may30year);
        }
        if (datefinal == 31) {
            actionBar.setTitle("May 31st");
            dayText.setText(R.string.may31);
            dayyear.setText(R.string.may31year);
        }
    }

    public void june(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("June 1st");
            dayText.setText(R.string.jun1);
            dayyear.setText(R.string.jun1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("June 2nd");
            dayText.setText(R.string.jun2);
            dayyear.setText(R.string.jun2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("June 3rd");
            dayText.setText(R.string.jun3);
            dayyear.setText(R.string.jun3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("June 4th");
            dayText.setText(R.string.jun4);
            dayyear.setText(R.string.jun4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("June 5th");
            dayText.setText(R.string.jun5);
            dayyear.setText(R.string.jun5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("June 6th");
            dayText.setText(R.string.jun6);
            dayyear.setText(R.string.jun6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("June 7th");
            dayText.setText(R.string.jun7);
            dayyear.setText(R.string.jun7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("June 8th");
            dayText.setText(R.string.jun8);
            dayyear.setText(R.string.jun8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("June 9th");
            dayText.setText(R.string.jun9);
            dayyear.setText(R.string.jun9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("June 10th");
            dayText.setText(R.string.jun10);
            dayyear.setText(R.string.jun10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("June 11th");
            dayText.setText(R.string.jun11);
            dayyear.setText(R.string.jun11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("June 12th");
            dayText.setText(R.string.jun12);
            dayyear.setText(R.string.jun12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("June 13th");
            dayText.setText(R.string.jun13);
            dayyear.setText(R.string.jun13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("June 14th");
            dayText.setText(R.string.jun14);
            dayyear.setText(R.string.jun14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("June 15th");
            dayText.setText(R.string.jun15);
            dayyear.setText(R.string.jun15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("June 16th");
            dayText.setText(R.string.jun16);
            dayyear.setText(R.string.jun16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("June 17th");
            dayText.setText(R.string.jun17);
            dayyear.setText(R.string.jun17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("June 18th");
            dayText.setText(R.string.jun18);
            dayyear.setText(R.string.jun18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("June 19th");
            dayText.setText(R.string.jun19);
            dayyear.setText(R.string.jun19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("June 20th");
            dayText.setText(R.string.jun20);
            dayyear.setText(R.string.jun20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("June 21st");
            dayText.setText(R.string.jun21);
            dayyear.setText(R.string.jun21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("June 22nd");
            dayText.setText(R.string.jun22);
            dayyear.setText(R.string.jun22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("June 23rd");
            dayText.setText(R.string.jun23);
            dayyear.setText(R.string.jun23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("June 24th");
            dayText.setText(R.string.jun24);
            dayyear.setText(R.string.jun24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("June 25th");
            dayText.setText(R.string.jun25);
            dayyear.setText(R.string.jun25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("June 26th");
            dayText.setText(R.string.jun26);
            dayyear.setText(R.string.jun26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("June 27th");
            dayText.setText(R.string.jun27);
            dayyear.setText(R.string.jun27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("June 28th");
            dayText.setText(R.string.jun28);
            dayyear.setText(R.string.jun28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("June 29th");
            dayText.setText(R.string.jun29);
            dayyear.setText(R.string.jun29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("June 30th");
            dayText.setText(R.string.jun30);
            dayyear.setText(R.string.jun30year);
        }
    }

    public void july(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("July 1st");
            dayText.setText(R.string.jul1);
            dayyear.setText(R.string.jul1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("July 2nd");
            dayText.setText(R.string.jul2);
            dayyear.setText(R.string.jul2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("July 3rd");
            dayText.setText(R.string.jul3);
            dayyear.setText(R.string.jul3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("July 4th");
            dayText.setText(R.string.jul4);
            dayyear.setText(R.string.jul4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("July 5th");
            dayText.setText(R.string.jul5);
            dayyear.setText(R.string.jul5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("July 6th");
            dayText.setText(R.string.jul6);
            dayyear.setText(R.string.jul6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("July 7th");
            dayText.setText(R.string.jul7);
            dayyear.setText(R.string.jul7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("July 8th");
            dayText.setText(R.string.jul8);
            dayyear.setText(R.string.jul8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("July 9th");
            dayText.setText(R.string.jul9);
            dayyear.setText(R.string.jul9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("July 10th");
            Toast.makeText(getApplicationContext(), "Jan 10", Toast.LENGTH_SHORT).show();
            dayText.setText(R.string.jul10);
            dayyear.setText(R.string.jul10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("July 11th");
            Toast.makeText(getApplicationContext(), "Jan 11", Toast.LENGTH_SHORT).show();
            dayText.setText(R.string.jul11);
            dayyear.setText(R.string.jul11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("July 12th");
            Toast.makeText(getApplicationContext(), "Jan 12", Toast.LENGTH_SHORT).show();
            dayText.setText(R.string.jul12);
            dayyear.setText(R.string.jul12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("July 13th");
            dayText.setText(R.string.jul13);
            dayyear.setText(R.string.jul13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("July 14th");
            dayText.setText(R.string.jul14);
            dayyear.setText(R.string.jul14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("July 15th");
            dayText.setText(R.string.jul15);
            dayyear.setText(R.string.jul15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("July 16th");
            dayText.setText(R.string.jul16);
            dayyear.setText(R.string.jul16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("July 17th");
            dayText.setText(R.string.jul17);
            dayyear.setText(R.string.jul17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("July 18th");
            dayText.setText(R.string.jul18);
            dayyear.setText(R.string.jul18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("July 19th");
            dayText.setText(R.string.jul19);
            dayyear.setText(R.string.jul19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("July 20th");
            dayText.setText(R.string.jul20);
            dayyear.setText(R.string.jul20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("July 21st");
            dayText.setText(R.string.jul21);
            dayyear.setText(R.string.jul21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("July 22nd");
            dayText.setText(R.string.jul22);
            dayyear.setText(R.string.jul22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("July 23rd");
            dayText.setText(R.string.jul23);
            dayyear.setText(R.string.jul23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("July 24th");
            dayText.setText(R.string.jul24);
            dayyear.setText(R.string.jul24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("July 25th");
            dayText.setText(R.string.jul25);
            dayyear.setText(R.string.jul25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("July 26th");
            dayText.setText(R.string.jul26);
            dayyear.setText(R.string.jul26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("July 27th");
            dayText.setText(R.string.jul27);
            dayyear.setText(R.string.jul27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("July 28th");
            dayText.setText(R.string.jul28);
            dayyear.setText(R.string.jul28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("July 29th");
            dayText.setText(R.string.jul29);
            dayyear.setText(R.string.jul29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("July 30th");
            dayText.setText(R.string.jul30);
            dayyear.setText(R.string.jul30year);
        }
        if (datefinal == 31) {
            actionBar.setTitle("July 31st");
            dayText.setText(R.string.jul31);
            dayyear.setText(R.string.jul31year);
        }
    }

    public void august(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("August 1st");
            dayText.setText(R.string.aug1);
            dayyear.setText(R.string.aug1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("August 2nd");
            dayText.setText(R.string.aug2);
            dayyear.setText(R.string.aug2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("August 3rd");
            dayText.setText(R.string.aug3);
            dayyear.setText(R.string.aug3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("August 4th");
            dayText.setText(R.string.aug4);
            dayyear.setText(R.string.aug4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("August 5th");
            dayText.setText(R.string.aug5);
            dayyear.setText(R.string.aug5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("August 6th");
            dayText.setText(R.string.aug6);
            dayyear.setText(R.string.aug6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("August 7th");
            dayText.setText(R.string.aug7);
            dayyear.setText(R.string.aug7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("August 8th");
            dayText.setText(R.string.aug8);
            dayyear.setText(R.string.aug8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("August 9th");
            dayText.setText(R.string.aug9);
            dayyear.setText(R.string.aug9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("August 10th");
            dayText.setText(R.string.aug10);
            dayyear.setText(R.string.aug10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("August 11th");
            dayText.setText(R.string.aug11);
            dayyear.setText(R.string.aug11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("August 12th");
            dayText.setText(R.string.aug1);
            dayText.setText(R.string.aug12);
            dayyear.setText(R.string.aug12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("August 13th");
            dayText.setText(R.string.aug13);
            dayyear.setText(R.string.aug13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("August 14th");
            dayText.setText(R.string.aug14);
            dayyear.setText(R.string.aug14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("August 15th");
            dayText.setText(R.string.aug15);
            dayyear.setText(R.string.aug15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("August 16th");
            dayText.setText(R.string.aug16);
            dayyear.setText(R.string.aug16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("August 17th");
            dayText.setText(R.string.aug17);
            dayyear.setText(R.string.aug17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("August 18th");
            dayText.setText(R.string.aug18);
            dayyear.setText(R.string.aug18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("August 19th");
            dayText.setText(R.string.aug19);
            dayyear.setText(R.string.aug19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("August 20th");
            dayText.setText(R.string.aug20);
            dayyear.setText(R.string.aug20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("August 21st");
            dayText.setText(R.string.aug21);
            dayyear.setText(R.string.aug21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("August 22nd");
            dayText.setText(R.string.aug22);
            dayyear.setText(R.string.aug22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("August 23rd");
            dayText.setText(R.string.aug23);
            dayyear.setText(R.string.aug23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("August 24th");
            dayText.setText(R.string.aug24);
            dayyear.setText(R.string.aug24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("August 25th");
            dayText.setText(R.string.aug25);
            dayyear.setText(R.string.aug25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("August 26th");
            dayText.setText(R.string.aug26);
            dayyear.setText(R.string.aug26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("August 27th");
            dayText.setText(R.string.aug27);
            dayyear.setText(R.string.aug27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("August 28th");
            dayText.setText(R.string.aug28);
            dayyear.setText(R.string.aug28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("August 29th");
            dayText.setText(R.string.aug29);
            dayyear.setText(R.string.aug29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("August 30th");
            dayText.setText(R.string.aug30);
            dayyear.setText(R.string.aug30year);
        }
        if (datefinal == 31) {
            actionBar.setTitle("August 31st");
            dayText.setText(R.string.aug31);
            dayyear.setText(R.string.aug31year);
        }
    }

    public void september(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);

        if (datefinal == 01) {
            actionBar.setTitle("September 1st");
            dayText.setText(R.string.sep1);
            dayyear.setText(R.string.sep1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("September 2nd");
            dayText.setText(R.string.sep2);
            dayyear.setText(R.string.sep2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("September 3rd");
            dayText.setText(R.string.sep3);
            dayyear.setText(R.string.sep3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("September 4th");
            dayText.setText(R.string.sep4);
            dayyear.setText(R.string.sep4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("September 5th");
            dayText.setText(R.string.sep5);
            dayyear.setText(R.string.sep5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("September 6th");
            dayText.setText(R.string.sep6);
            dayyear.setText(R.string.sep6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("September 7th");
            dayText.setText(R.string.sep7);
            dayyear.setText(R.string.sep7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("September 8th");
            dayText.setText(R.string.sep8);
            dayyear.setText(R.string.sep8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("September 9th");
            dayText.setText(R.string.sep9);
            dayyear.setText(R.string.sep9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("September 10th");
            dayText.setText(R.string.sep10);
            dayyear.setText(R.string.sep10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("September 11th");
            dayText.setText(R.string.sep11);
            dayyear.setText(R.string.sep11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("September 12th");
            dayText.setText(R.string.sep12);
            dayyear.setText(R.string.sep12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("September 13th");
            dayText.setText(R.string.sep13);
            dayyear.setText(R.string.sep13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("September 14th");
            dayText.setText(R.string.sep14);
            dayyear.setText(R.string.sep14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("September 15th");
            dayText.setText(R.string.sep15);
            dayyear.setText(R.string.sep15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("September 16th");
            dayText.setText(R.string.sep16);
            dayyear.setText(R.string.sep16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("September 17th");
            dayText.setText(R.string.sep17);
            dayyear.setText(R.string.sep17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("September 18th");
            dayText.setText(R.string.sep18);
            dayyear.setText(R.string.sep18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("September 19th");
            dayText.setText(R.string.sep19);
            dayyear.setText(R.string.sep19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("September 20th");
            dayText.setText(R.string.sep20);
            dayyear.setText(R.string.sep20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("September 21st");
            dayText.setText(R.string.sep21);
            dayyear.setText(R.string.sep21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("September 22nd");
            dayText.setText(R.string.sep22);
            dayyear.setText(R.string.sep22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("September 23rd");
            dayText.setText(R.string.sep23);
            dayyear.setText(R.string.sep23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("September 24th");
            dayText.setText(R.string.sep24);
            dayyear.setText(R.string.sep24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("September 25th");
            dayText.setText(R.string.sep25);
            dayyear.setText(R.string.sep25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("September 26th");
            dayText.setText(R.string.sep26);
            dayyear.setText(R.string.sep26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("September 27th");
            dayText.setText(R.string.sep27);
            dayyear.setText(R.string.sep27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("September 28th");
            dayText.setText(R.string.sep28);
            dayyear.setText(R.string.sep28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("September 29th");
            dayText.setText(R.string.sep29);
            dayyear.setText(R.string.sep29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("September 30th");
            dayText.setText(R.string.sep30);
            dayyear.setText(R.string.sep30year);
        }
    }

    public void october(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 1 || date.charAt(4) == 2 || date.charAt(4) == 3) {
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
            else{
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("October 1st");
            dayText.setText(R.string.oct1);
            dayyear.setText(R.string.oct1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("October 2nd");
            dayText.setText(R.string.oct2);
            dayyear.setText(R.string.oct2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("October 3rd");
            dayText.setText(R.string.oct3);
            dayyear.setText(R.string.oct3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("October 4th");
            dayText.setText(R.string.oct4);
            dayyear.setText(R.string.oct4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("October 5th");
            dayText.setText(R.string.oct5);
            dayyear.setText(R.string.oct5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("October 6th");
            dayText.setText(R.string.oct6);
            dayyear.setText(R.string.oct6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("October 7th");
            dayText.setText(R.string.oct7);
            dayyear.setText(R.string.oct7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("October 8th");
            dayText.setText(R.string.oct8);
            dayyear.setText(R.string.oct8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("October 9th");
            dayText.setText(R.string.oct9);
            dayyear.setText(R.string.oct9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("October 10th");
            dayText.setText(R.string.oct10);
            dayyear.setText(R.string.oct10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("October 11th");
            dayText.setText(R.string.oct11);
            dayyear.setText(R.string.oct11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("October 12th");
            dayText.setText(R.string.oct12);
            dayyear.setText(R.string.oct12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("October 13th");
            dayText.setText(R.string.oct13);
            dayyear.setText(R.string.oct13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("October 14th");
            dayText.setText(R.string.oct14);
            dayyear.setText(R.string.oct14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("October 15th");
            dayText.setText(R.string.oct15);
            dayyear.setText(R.string.oct15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("October 16th");
            dayText.setText(R.string.oct16);
            dayyear.setText(R.string.oct16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("October 17th");
            dayText.setText(R.string.oct17);
            dayyear.setText(R.string.oct17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("October 18th");
            dayText.setText(R.string.oct18);
            dayyear.setText(R.string.oct18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("October 19th");
            dayText.setText(R.string.oct19);
            dayyear.setText(R.string.oct19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("October 20th");
            dayText.setText(R.string.oct20);
            dayyear.setText(R.string.oct20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("October 21st");
            dayText.setText(R.string.oct21);
            dayyear.setText(R.string.oct21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("October 22nd");
            dayText.setText(R.string.oct22);
            dayyear.setText(R.string.oct22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("October 23rd");
            dayText.setText(R.string.oct23);
            dayyear.setText(R.string.oct23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("October 24th");
            dayText.setText(R.string.oct24);
            dayyear.setText(R.string.oct24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("October 25th");
            dayText.setText(R.string.oct25);
            dayyear.setText(R.string.oct25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("October 26th");
            dayText.setText(R.string.oct26);
            dayyear.setText(R.string.oct26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("October 27th");
            dayText.setText(R.string.oct27);
            dayyear.setText(R.string.oct27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("October 28th");
            dayText.setText(R.string.oct28);
            dayyear.setText(R.string.oct28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("October 29th");
            dayText.setText(R.string.oct29);
            dayyear.setText(R.string.oct29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("October 30th");
            dayText.setText(R.string.oct30);
            dayyear.setText(R.string.oct30year);
        }
        if (datefinal == 31) {
            actionBar.setTitle("October 31st");
            dayText.setText(R.string.oct31);
            dayyear.setText(R.string.oct31year);
        }
    }

    public void november(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 1 || date.charAt(4) == 2 || date.charAt(4) == 3) {
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
            else{
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("November 1st");
            dayText.setText(R.string.nov1);
            dayyear.setText(R.string.nov1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("November 2nd");
            dayText.setText(R.string.nov2);
            dayyear.setText(R.string.nov2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("November 3rd");
            dayText.setText(R.string.nov3);
            dayyear.setText(R.string.nov3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("November 4th");
            dayText.setText(R.string.nov4);
            dayyear.setText(R.string.nov4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("November 5th");
            dayText.setText(R.string.nov5);
            dayyear.setText(R.string.nov5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("November 6th");
            dayText.setText(R.string.nov6);
            dayyear.setText(R.string.nov6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("November 7th");
            dayText.setText(R.string.nov7);
            dayyear.setText(R.string.nov7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("November 8th");
            dayText.setText(R.string.nov8);
            dayyear.setText(R.string.nov8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("November 9th");
            dayText.setText(R.string.nov9);
            dayyear.setText(R.string.nov9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("November 10th");
            dayText.setText(R.string.nov10);
            dayyear.setText(R.string.nov10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("November 11th");
            dayText.setText(R.string.nov11);
            dayyear.setText(R.string.nov11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("November 12th");
            dayText.setText(R.string.nov12);
            dayyear.setText(R.string.nov12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("November 13th");
            dayText.setText(R.string.nov13);
            dayyear.setText(R.string.nov13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("November 14th");
            dayText.setText(R.string.nov14);
            dayyear.setText(R.string.nov14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("November 15th");
            dayText.setText(R.string.nov15);
            dayyear.setText(R.string.nov15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("November 16th");
            dayText.setText(R.string.nov16);
            dayyear.setText(R.string.nov16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("November 17th");
            dayText.setText(R.string.nov17);
            dayyear.setText(R.string.nov17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("November 18th");
            dayText.setText(R.string.nov18);
            dayyear.setText(R.string.nov18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("November 19th");
            dayText.setText(R.string.nov19);
            dayyear.setText(R.string.nov19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("November 20th");
            dayText.setText(R.string.nov20);
            dayyear.setText(R.string.nov20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("November 21st");
            dayText.setText(R.string.nov21);
            dayyear.setText(R.string.nov21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("November 22nd");
            dayText.setText(R.string.nov22);
            dayyear.setText(R.string.nov22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("November 23rd");
            dayText.setText(R.string.nov23);
            dayyear.setText(R.string.nov23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("November 24th");
            dayText.setText(R.string.nov24);
            dayyear.setText(R.string.nov24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("November 25th");
            dayText.setText(R.string.nov25);
            dayyear.setText(R.string.nov25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("November 26th");
            dayText.setText(R.string.nov26);
            dayyear.setText(R.string.nov26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("November 27th");
            dayText.setText(R.string.nov27);
            dayyear.setText(R.string.nov27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("November 28th");
            dayText.setText(R.string.nov28);
            dayyear.setText(R.string.nov28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("November 29th");
            dayText.setText(R.string.nov29);
            dayyear.setText(R.string.nov29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("November 30th");
            dayText.setText(R.string.nov29);
            dayyear.setText(R.string.nov29year);
        }
    }

    public void december(String date, ActionBar actionBar) {
        String datestring;
        TextView dayText = (TextView) findViewById(R.id.daytext);
        TextView dayyear = (TextView) findViewById(R.id.dayyear);
        if(date.contains("Mon")||date.contains("Tue")||date.contains("Wed")||date.contains("Thu")||date.contains("Fri")||date.contains("Sat")||date.contains("Sun")){
            char day1 = date.charAt(8);
            char day2 = date.charAt(9);
            datestring = new StringBuilder().append(day1).append(day2).toString();
        }
        else{
            if(date.charAt(4) == 0) {
                char day1 = date.charAt(4);
                datestring = new StringBuilder().append(day1).toString();
            }
            else{
                char day1 = date.charAt(4);
                char day2 = date.charAt(5);
                datestring = new StringBuilder().append(day1).append(day2).toString();
            }
        }
        int datefinal = Integer.parseInt(datestring);
        if (datefinal == 01) {
            actionBar.setTitle("December 1st");
            dayText.setText(R.string.dec1);
            dayyear.setText(R.string.dec1year);
        }
        if (datefinal == 02) {
            actionBar.setTitle("December 2nd");
            dayText.setText(R.string.dec2);
            dayyear.setText(R.string.dec2year);
        }
        if (datefinal == 03) {
            actionBar.setTitle("December 3rd");
            dayText.setText(R.string.dec3);
            dayyear.setText(R.string.dec3year);
        }
        if (datefinal == 04) {
            actionBar.setTitle("December 4th");
            dayText.setText(R.string.dec4);
            dayyear.setText(R.string.dec4year);
        }
        if (datefinal == 05) {
            actionBar.setTitle("December 5th");
            dayText.setText(R.string.dec5);
            dayyear.setText(R.string.dec5year);
        }
        if (datefinal == 06) {
            actionBar.setTitle("December 6th");
            dayText.setText(R.string.dec6);
            dayyear.setText(R.string.dec6year);
        }
        if (datefinal == 07) {
            actionBar.setTitle("December 7th");
            dayText.setText(R.string.dec7);
            dayyear.setText(R.string.dec7year);
        }
        if (datefinal == 8) {
            actionBar.setTitle("December 8th");
            dayText.setText(R.string.dec8);
            dayyear.setText(R.string.dec8year);
        }
        if (datefinal == 9) {
            actionBar.setTitle("December 9th");
            dayText.setText(R.string.dec9);
            dayyear.setText(R.string.dec9year);
        }
        if (datefinal == 10) {
            actionBar.setTitle("December 10th");
            dayText.setText(R.string.dec10);
            dayyear.setText(R.string.dec10year);
        }
        if (datefinal == 11) {
            actionBar.setTitle("December 11th");
            dayText.setText(R.string.dec11);
            dayyear.setText(R.string.dec11year);
        }
        if (datefinal == 12) {
            actionBar.setTitle("December 12th");
            dayText.setText(R.string.dec12);
            dayyear.setText(R.string.dec12year);
        }
        if (datefinal == 13) {
            actionBar.setTitle("December 13th");
            dayText.setText(R.string.dec13);
            dayyear.setText(R.string.dec13year);
        }
        if (datefinal == 14) {
            actionBar.setTitle("December 14th");
            dayText.setText(R.string.dec14);
            dayyear.setText(R.string.dec14year);
        }
        if (datefinal == 15) {
            actionBar.setTitle("December 15th");
            dayText.setText(R.string.dec15);
            dayyear.setText(R.string.dec15year);
        }
        if (datefinal == 16) {
            actionBar.setTitle("December 16th");
            dayText.setText(R.string.dec16);
            dayyear.setText(R.string.dec16year);
        }
        if (datefinal == 17) {
            actionBar.setTitle("December 17th");
            dayText.setText(R.string.dec17);
            dayyear.setText(R.string.dec17year);
        }
        if (datefinal == 18) {
            actionBar.setTitle("December 18th");
            dayText.setText(R.string.dec18);
            dayyear.setText(R.string.dec18year);
        }
        if (datefinal == 19) {
            actionBar.setTitle("December 19th");
            dayText.setText(R.string.dec19);
            dayyear.setText(R.string.dec19year);
        }
        if (datefinal == 20) {
            actionBar.setTitle("December 20th");
            dayText.setText(R.string.dec20);
            dayyear.setText(R.string.dec20year);
        }
        if (datefinal == 21) {
            actionBar.setTitle("December 21st");
            dayText.setText(R.string.dec21);
            dayyear.setText(R.string.dec21year);
        }
        if (datefinal == 22) {
            actionBar.setTitle("December 22nd");
            dayText.setText(R.string.dec22);
            dayyear.setText(R.string.dec22year);
        }
        if (datefinal == 23) {
            actionBar.setTitle("December 23rd");
            dayText.setText(R.string.dec23);
            dayyear.setText(R.string.dec23year);
        }
        if (datefinal == 24) {
            actionBar.setTitle("December 24th");
            dayText.setText(R.string.dec24);
            dayyear.setText(R.string.dec24year);
        }
        if (datefinal == 25) {
            actionBar.setTitle("December 25th");
            dayText.setText(R.string.dec25);
            dayyear.setText(R.string.dec25year);
        }
        if (datefinal == 26) {
            actionBar.setTitle("December 26th");
            dayText.setText(R.string.dec26);
            dayyear.setText(R.string.dec26year);
        }
        if (datefinal == 27) {
            actionBar.setTitle("December 27th");
            dayText.setText(R.string.dec27);
            dayyear.setText(R.string.dec27year);
        }
        if (datefinal == 28) {
            actionBar.setTitle("December 28th");
            dayText.setText(R.string.dec28);
            dayyear.setText(R.string.dec28year);
        }
        if (datefinal == 29) {
            actionBar.setTitle("December 29th");
            dayText.setText(R.string.dec29);
            dayyear.setText(R.string.dec29year);
        }
        if (datefinal == 30) {
            actionBar.setTitle("December 30th");
            dayText.setText(R.string.dec30);
            dayyear.setText(R.string.dec30year);
        }
        if (datefinal == 31) {
            actionBar.setTitle("December 31st");
            dayText.setText(R.string.dec31);
            dayyear.setText(R.string.dec31year);
        }
    }

    public void getStartMonth(String date, ActionBar actionBar){
        char let1 = date.charAt(0);
        char let2 = date.charAt(1);
        char let3 = date.charAt(2);
        String month = new StringBuilder().append(let1).append(let2).append(let3).toString();

        if(month.contains("Jan")){
            january(date, actionBar);
        }
        if(month.contains("Feb")){
            february(date, actionBar);

        }
        if(month.contains("Mar")){
            march(date, actionBar);

        }
        if(month.contains("Apr")){
            april(date, actionBar);
        }
        if(month.contains("May")){
            may(date, actionBar);

        }
        if(month.contains("Jun")){
            june(date, actionBar);

        }
        if(month.contains("Jul")){
            july(date, actionBar);

        }
        if(month.contains("Aug")){
            august(date, actionBar);

        }
        if(month.contains("Sep")){
            september(date, actionBar);

        }
        if(month.contains("Oct")){
            Log.d(TAG, date);
            october(date, actionBar);

        }
        if(month.contains("Nov")){
            november(date, actionBar);

        }
        if(month.contains("Dec")){
            december(date, actionBar);
        }

    }




    @Override
    public void onBackPressed() {
        View v = getLayoutInflater().inflate(R.layout.activity_main, null);
        NavigationView drawer = (NavigationView) v.findViewById(R.id.nav_view);
        drawer.setCheckedItem(R.id.home);
        Intent home = new Intent(getApplication(), com.us.mattfein.ushistory.MainActivity.class);
        startActivity(home);

    }


    private class slideAnim extends AsyncTask<String, Void, String> {

            Animation slideRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideleftii);
            CompactCalendarView compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
            @Override
            protected String doInBackground(String... params) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return "Interrupted";
                }
                return "Executed";
            }

            protected void onPostExecute(String result) {
                compactCalendarView.startAnimation(slideRight);
                compactCalendarView.showNextMonth();

            }
        }

    private class otherSlideAnim extends AsyncTask<String, Void, String> {
        Animation slideLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidein);
        CompactCalendarView compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        @Override
        protected String doInBackground(String... params) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return "Interrupted";
            }
            return "Executed";
        }

        protected void onPostExecute(String result) {
            compactCalendarView.startAnimation(slideLeft);
            compactCalendarView.showPreviousMonth();

        }
    }

    private class cardslidein extends AsyncTask<String, Void, String> {
        private String date;
        private int month;
        private ActionBar actionBar;

        private cardslidein(String date, int month, ActionBar actionBar){
            this.date = date;
            this.month = month;
            this.actionBar = actionBar;
        }
        Animation slideLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidein);
        ConstraintLayout cardView = (ConstraintLayout) findViewById(R.id.dayhistorytextcard);
        @Override
        protected String doInBackground(String... params) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return "Interrupted";
            }
            return "Executed";
        }

        protected void onPostExecute(String result) {
            if(month == 0){
                january(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 1){
                february(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 2){
                march(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 3){
                april(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 4){
                may(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 5){
                june(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 6){
                july(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 7) {
                august(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 8){
                september(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 9){
                october(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 10){
                november(date, actionBar);
                cardView.startAnimation(slideLeft);
            }
            if(month == 11){
                december(date, actionBar);
                cardView.startAnimation(slideLeft);
            }

        }
    }



}




