package com.example.homework1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView root = new HorizontalScrollView(this);
        root.setBackgroundColor(Color.WHITE);

        LinearLayout llRoot = new LinearLayout(this);
        llRoot.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams llRootParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        llRoot.setLayoutParams(llRootParams);

        //column 0
        LinearLayout colZero = new LinearLayout(this);
        colZero.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams colZeroParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        colZero.setLayoutParams(colZeroParams);

        TextView tv;

        for (int i = 1; i <= 11; i++){
            tv = new TextView(this);
            tv.setText(Integer.toString(i));
            tv.setPadding(10, 0, 10, 0);
            tv.setBackgroundColor(Color.LTGRAY);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            colZero.addView(tv);
        }
        llRoot.addView(colZero);

        //column 1
        LinearLayout colOne = new LinearLayout(this);
        colOne.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams colOneParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        colOne.setLayoutParams(colOneParams);

        tv = new TextView(this);
        tv.setText("");
        tv.setBackgroundColor(Color.BLACK);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("properties");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setPadding(0, 26, 0, 26);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        tv.setBackgroundColor(Color.CYAN);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        tv.setBackgroundColor(Color.CYAN);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("R10");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("R20");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("R30");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colOne.addView(tv);

        tv = new TextView(this);
        tv.setText("R40");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colOne.addView(tv);

        llRoot.addView(colOne);

        //column 2
        LinearLayout colTwo = new LinearLayout(this);
        colTwo.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams colTwoParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        colTwo.setLayoutParams(colTwoParams);

        tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTextColor(Color.WHITE);
        colTwo.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        colTwo.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        colTwo.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        colTwo.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= && hour <= max");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        colTwo.addView(tv);

        LinearLayout colTwoHoriz = new LinearLayout(this);
        colTwoHoriz.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams colTwoHorizParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        colTwoHoriz.setLayoutParams(colTwoHorizParams);

        LinearLayout colTwoMin = new LinearLayout(this);
        colTwoMin.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams coloTwoMinParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        colTwoMin.setLayoutParams(coloTwoMinParams);

        tv = new TextView(this);
        tv.setText("int min");
        tv.setPadding(49, 0, 49, 0);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        colTwoMin.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        colTwoMin.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMin.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMin.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMin.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMin.addView(tv);

        LinearLayout colTwoMax = new LinearLayout(this);
        colTwoMax.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams coloTwoMaxParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        colTwoMax.setLayoutParams(coloTwoMaxParams);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setPadding(49, 0, 49, 0);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        colTwoMax.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        colTwoMax.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMax.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMax.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMax.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        colTwoMax.addView(tv);

        colTwoHoriz.addView(colTwoMin);
        colTwoHoriz.addView(colTwoMax);
        colTwo.addView(colTwoHoriz);

        llRoot.addView(colTwo);

        //column 3
        LinearLayout colThree = new LinearLayout(this);
        colThree.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams colThreeParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        colThree.setLayoutParams(colThreeParams);

        tv = new TextView(this);
        tv.setText("");
        tv.setBackgroundColor(Color.BLACK);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting+ \",World!\"");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setBackgroundColor(Color.rgb(252, 200, 167));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setBackgroundColor(Color.rgb(252, 200, 167));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setBackgroundColor(Color.rgb(252, 200, 167));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setBackgroundColor(Color.rgb(252, 200, 167));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colThree.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setBackgroundColor(Color.rgb(252, 200, 167));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        colThree.addView(tv);

        llRoot.addView(colThree);

        root.addView(llRoot);
        setContentView(root);
        //setContentView(R.layout.linear_layout);
    }
}
