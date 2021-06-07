package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2, text3;
    RadioGroup radio1, radio2, radio3;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);


    }

    public int CalculateMark() {
        int marks = 0;
        RadioGroup checker;
        checker = (RadioGroup) findViewById(R.id.radio1);

        int choice = checker.getCheckedRadioButtonId();
        if (choice == R.id.For) {
            marks += 1;
            count += 1;
        }

        checker = (RadioGroup)findViewById(R.id.radio2);
        choice =  checker.getCheckedRadioButtonId();
        if(choice == R.id.Pre)
        {
            marks += 1;
            count += 1;
        }
        checker = (RadioGroup) findViewById(R.id.radio3);
        choice = checker.getCheckedRadioButtonId();
        if(choice == R.id.Two){
            marks += 1;
            count += 1;
        }
    return marks;
    }
}