package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton apple;
    RadioButton samsung;
    RadioButton google;
    RadioButton _2002;
    RadioButton _2007;
    RadioButton _2004;
    RadioButton gmail;
    RadioButton yahoomail;
    RadioButton hotmail;
    EditText name;
    EditText q5Answer;
    CheckBox appleLocation;
    CheckBox samsungLocation;
    CheckBox googleLocation;
    CheckBox alibabaLocation;
    int finalResult;


    // this method compare the button that clicked to the right answer
    public void result(View view) {
        //first question
        if (google.isChecked()) {
            finalResult++;
        }
        //second question
        if (_2007.isChecked()) {
            finalResult++;
        }
        //third question
        if (hotmail.isChecked()) {
            finalResult++;
        }

        //fourth question
        if (googleLocation.isChecked() && appleLocation.isChecked() && !alibabaLocation.isChecked() && !samsungLocation.isChecked()) {
            finalResult++;
        }
        String strText = q5Answer.getText().toString().trim();
        if (strText.equalsIgnoreCase("ios")) {
            finalResult++;
        }


        // this toast will popup and show the name with the result
        if (finalResult == 5) {
            Toast.makeText(this, name.getText().toString() + " you answered all questions right", Toast.LENGTH_LONG).show();
            finalResult = 0;
        } else {
            Toast.makeText(this, name.getText().toString() + " your score is " + finalResult + "  out of 5", Toast.LENGTH_LONG).show();
            finalResult = 0;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect the xml elements with java
        apple = (RadioButton) findViewById(R.id.apple);
        samsung = (RadioButton) findViewById(R.id.samsung);
        google = (RadioButton) findViewById(R.id.google);
        _2002 = (RadioButton) findViewById(R.id._2002);
        _2007 = (RadioButton) findViewById(R.id._2007);
        _2004 = (RadioButton) findViewById(R.id._2004);
        gmail = (RadioButton) findViewById(R.id.gmail);
        yahoomail = (RadioButton) findViewById(R.id.yahoo);
        hotmail = (RadioButton) findViewById(R.id.hotmail);
        appleLocation = (CheckBox) findViewById(R.id.appleLocated);
        samsungLocation = (CheckBox) findViewById(R.id.samsungLocated);
        googleLocation = (CheckBox) findViewById(R.id.googleLocated);
        alibabaLocation = (CheckBox) findViewById(R.id.alibabaLocated);
        name = (EditText) findViewById(R.id.name);
        q5Answer = (EditText) findViewById(R.id.q5EditText);


    }


}
