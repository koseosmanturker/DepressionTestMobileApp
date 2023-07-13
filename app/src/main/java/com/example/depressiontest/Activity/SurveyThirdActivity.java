package com.example.depressiontest.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.depressiontest.R;

public class SurveyThirdActivity extends AppCompatActivity {

    int totalPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_third);

        Intent intent = getIntent();
        totalPoint = intent.getIntExtra("totalPoint", totalPoint);

        Button startFourthActivityButton = (Button) findViewById(R.id.third_to_fourth_button);

        startFourthActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox question18_choice0 = (CheckBox) findViewById(R.id.question18_choice0);
                CheckBox question18_choice1 = (CheckBox) findViewById(R.id.question18_choice1);
                CheckBox question18_choice2 = (CheckBox) findViewById(R.id.question18_choice2);
                CheckBox question18_choice3 = (CheckBox) findViewById(R.id.question18_choice3);
                CheckBox question18_choice4 = (CheckBox) findViewById(R.id.question18_choice4);

                boolean answer18_choice0 = question18_choice0.isChecked();
                boolean answer18_choice1 = question18_choice1.isChecked();
                boolean answer18_choice2 = question18_choice2.isChecked();
                boolean answer18_choice3 = question18_choice3.isChecked();
                boolean answer18_choice4 = question18_choice4.isChecked();

                if (answer18_choice0) {
                    totalPoint += 0;
                } else if (answer18_choice1) {
                    totalPoint += 1;
                } else if (answer18_choice2) {
                    totalPoint += 2;
                } else if (answer18_choice3) {
                    totalPoint += 3;
                } else if (answer18_choice4) {
                    totalPoint += 4;
                }

                CheckBox question19_choice0 = (CheckBox) findViewById(R.id.question19_choice0);
                CheckBox question19_choice1 = (CheckBox) findViewById(R.id.question19_choice1);
                CheckBox question19_choice2 = (CheckBox) findViewById(R.id.question19_choice2);
                CheckBox question19_choice3 = (CheckBox) findViewById(R.id.question19_choice3);
                CheckBox question19_choice4 = (CheckBox) findViewById(R.id.question19_choice4);

                boolean answer19_choice0 = question19_choice0.isChecked();
                boolean answer19_choice1 = question19_choice1.isChecked();
                boolean answer19_choice2 = question19_choice2.isChecked();
                boolean answer19_choice3 = question19_choice3.isChecked();
                boolean answer19_choice4 = question19_choice4.isChecked();

                if (answer19_choice0) {
                    totalPoint += 0;
                } else if (answer19_choice1) {
                    totalPoint += 1;
                } else if (answer19_choice2) {
                    totalPoint += 2;
                } else if (answer19_choice3) {
                    totalPoint += 3;
                } else if (answer19_choice4) {
                    totalPoint += 4;
                }

                CheckBox question20_choice0 = (CheckBox) findViewById(R.id.question20_choice0);
                CheckBox question20_choice1 = (CheckBox) findViewById(R.id.question20_choice1);
                CheckBox question20_choice2 = (CheckBox) findViewById(R.id.question20_choice2);
                CheckBox question20_choice3 = (CheckBox) findViewById(R.id.question20_choice3);
                CheckBox question20_choice4 = (CheckBox) findViewById(R.id.question20_choice4);

                boolean answer20_choice0 = question20_choice0.isChecked();
                boolean answer20_choice1 = question20_choice1.isChecked();
                boolean answer20_choice2 = question20_choice2.isChecked();
                boolean answer20_choice3 = question20_choice3.isChecked();
                boolean answer20_choice4 = question20_choice4.isChecked();

                if (answer20_choice0) {
                    totalPoint += 0;
                } else if (answer20_choice1) {
                    totalPoint += 1;
                } else if (answer20_choice2) {
                    totalPoint += 2;
                } else if (answer20_choice3) {
                    totalPoint += 3;
                } else if (answer20_choice4) {
                    totalPoint += 4;
                }

                CheckBox question21_choice0 = (CheckBox) findViewById(R.id.question21_choice0);
                CheckBox question21_choice1 = (CheckBox) findViewById(R.id.question21_choice1);
                CheckBox question21_choice2 = (CheckBox) findViewById(R.id.question21_choice2);
                CheckBox question21_choice3 = (CheckBox) findViewById(R.id.question21_choice3);
                CheckBox question21_choice4 = (CheckBox) findViewById(R.id.question21_choice4);

                boolean answer21_choice0 = question21_choice0.isChecked();
                boolean answer21_choice1 = question21_choice1.isChecked();
                boolean answer21_choice2 = question21_choice2.isChecked();
                boolean answer21_choice3 = question21_choice3.isChecked();
                boolean answer21_choice4 = question21_choice4.isChecked();

                if (answer21_choice0) {
                    totalPoint += 0;
                } else if (answer21_choice1) {
                    totalPoint += 1;
                } else if (answer21_choice2) {
                    totalPoint += 2;
                } else if (answer21_choice3) {
                    totalPoint += 3;
                } else if (answer21_choice4) {
                    totalPoint += 4;
                }

                CheckBox question22_choice0 = (CheckBox) findViewById(R.id.question22_choice0);
                CheckBox question22_choice1 = (CheckBox) findViewById(R.id.question22_choice1);
                CheckBox question22_choice2 = (CheckBox) findViewById(R.id.question22_choice2);
                CheckBox question22_choice3 = (CheckBox) findViewById(R.id.question22_choice3);
                CheckBox question22_choice4 = (CheckBox) findViewById(R.id.question22_choice4);

                boolean answer22_choice0 = question22_choice0.isChecked();
                boolean answer22_choice1 = question22_choice1.isChecked();
                boolean answer22_choice2 = question22_choice2.isChecked();
                boolean answer22_choice3 = question22_choice3.isChecked();
                boolean answer22_choice4 = question22_choice4.isChecked();

                if (answer22_choice0) {
                    totalPoint += 0;
                } else if (answer22_choice1) {
                    totalPoint += 1;
                } else if (answer22_choice2) {
                    totalPoint += 2;
                } else if (answer22_choice3) {
                    totalPoint += 3;
                } else if (answer22_choice4) {
                    totalPoint += 4;
                }

                Intent intent = new Intent(SurveyThirdActivity.this, SurveyFourthActivity.class);
                intent.putExtra("totalPoint", totalPoint);
                startActivity(intent);
            }
        });
    }
}