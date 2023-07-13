package com.example.depressiontest.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.depressiontest.R;

public class SurveySecondActivity extends AppCompatActivity {

    int totalPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_second);

        Intent intent = getIntent();
        totalPoint = intent.getIntExtra("totalPoint", totalPoint);

        Button startThirdActivityButton = (Button) findViewById(R.id.second_to_third_button);

        startThirdActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox question11_choice0 = (CheckBox) findViewById(R.id.question11_choice0);
                CheckBox question11_choice1 = (CheckBox) findViewById(R.id.question11_choice1);
                CheckBox question11_choice2 = (CheckBox) findViewById(R.id.question11_choice2);
                CheckBox question11_choice3 = (CheckBox) findViewById(R.id.question11_choice3);
                CheckBox question11_choice4 = (CheckBox) findViewById(R.id.question11_choice4);

                boolean answer11_choice0 = question11_choice0.isChecked();
                boolean answer11_choice1 = question11_choice1.isChecked();
                boolean answer11_choice2 = question11_choice2.isChecked();
                boolean answer11_choice3 = question11_choice3.isChecked();
                boolean answer11_choice4 = question11_choice4.isChecked();

                if (answer11_choice0) {
                    totalPoint += 0;
                } else if (answer11_choice1) {
                    totalPoint += 1;
                } else if (answer11_choice2) {
                    totalPoint += 2;
                } else if (answer11_choice3) {
                    totalPoint += 3;
                } else if (answer11_choice4) {
                    totalPoint += 4;
                }

                CheckBox question12_choice0 = (CheckBox) findViewById(R.id.question12_choice0);
                CheckBox question12_choice1 = (CheckBox) findViewById(R.id.question12_choice1);
                CheckBox question12_choice2 = (CheckBox) findViewById(R.id.question12_choice2);
                CheckBox question12_choice3 = (CheckBox) findViewById(R.id.question12_choice3);
                CheckBox question12_choice4 = (CheckBox) findViewById(R.id.question12_choice4);

                boolean answer12_choice0 = question12_choice0.isChecked();
                boolean answer12_choice1 = question12_choice1.isChecked();
                boolean answer12_choice2 = question12_choice2.isChecked();
                boolean answer12_choice3 = question12_choice3.isChecked();
                boolean answer12_choice4 = question12_choice4.isChecked();

                if (answer12_choice0) {
                    totalPoint += 0;
                } else if (answer12_choice1) {
                    totalPoint += 1;
                } else if (answer12_choice2) {
                    totalPoint += 2;
                } else if (answer12_choice3) {
                    totalPoint += 3;
                } else if (answer12_choice4) {
                    totalPoint += 4;
                }

                CheckBox question13_choice0 = (CheckBox) findViewById(R.id.question13_choice0);
                CheckBox question13_choice1 = (CheckBox) findViewById(R.id.question13_choice1);
                CheckBox question13_choice2 = (CheckBox) findViewById(R.id.question13_choice2);
                CheckBox question13_choice3 = (CheckBox) findViewById(R.id.question13_choice3);
                CheckBox question13_choice4 = (CheckBox) findViewById(R.id.question13_choice4);

                boolean answer13_choice0 = question13_choice0.isChecked();
                boolean answer13_choice1 = question13_choice1.isChecked();
                boolean answer13_choice2 = question13_choice2.isChecked();
                boolean answer13_choice3 = question13_choice3.isChecked();
                boolean answer13_choice4 = question13_choice4.isChecked();

                if (answer13_choice0) {
                    totalPoint += 0;
                } else if (answer13_choice1) {
                    totalPoint += 1;
                } else if (answer13_choice2) {
                    totalPoint += 2;
                } else if (answer13_choice3) {
                    totalPoint += 3;
                } else if (answer13_choice4) {
                    totalPoint += 4;
                }

                CheckBox question14_choice0 = (CheckBox) findViewById(R.id.question14_choice0);
                CheckBox question14_choice1 = (CheckBox) findViewById(R.id.question14_choice1);
                CheckBox question14_choice2 = (CheckBox) findViewById(R.id.question14_choice2);
                CheckBox question14_choice3 = (CheckBox) findViewById(R.id.question14_choice3);
                CheckBox question14_choice4 = (CheckBox) findViewById(R.id.question14_choice4);

                boolean answer14_choice0 = question14_choice0.isChecked();
                boolean answer14_choice1 = question14_choice1.isChecked();
                boolean answer14_choice2 = question14_choice2.isChecked();
                boolean answer14_choice3 = question14_choice3.isChecked();
                boolean answer14_choice4 = question14_choice4.isChecked();

                if (answer14_choice0) {
                    totalPoint += 0;
                } else if (answer14_choice1) {
                    totalPoint += 1;
                } else if (answer14_choice2) {
                    totalPoint += 2;
                } else if (answer14_choice3) {
                    totalPoint += 3;
                } else if (answer14_choice4) {
                    totalPoint += 4;
                }

                CheckBox question15_choice0 = (CheckBox) findViewById(R.id.question15_choice0);
                CheckBox question15_choice1 = (CheckBox) findViewById(R.id.question15_choice1);
                CheckBox question15_choice2 = (CheckBox) findViewById(R.id.question15_choice2);
                CheckBox question15_choice3 = (CheckBox) findViewById(R.id.question15_choice3);
                CheckBox question15_choice4 = (CheckBox) findViewById(R.id.question15_choice4);

                boolean answer15_choice0 = question15_choice0.isChecked();
                boolean answer15_choice1 = question15_choice1.isChecked();
                boolean answer15_choice2 = question15_choice2.isChecked();
                boolean answer15_choice3 = question15_choice3.isChecked();
                boolean answer15_choice4 = question15_choice4.isChecked();

                if (answer15_choice0) {
                    totalPoint += 0;
                } else if (answer15_choice1) {
                    totalPoint += 1;
                } else if (answer15_choice2) {
                    totalPoint += 2;
                } else if (answer15_choice3) {
                    totalPoint += 3;
                } else if (answer15_choice4) {
                    totalPoint += 4;
                }

                CheckBox question16_choice0 = (CheckBox) findViewById(R.id.question16_choice0);
                CheckBox question16_choice1 = (CheckBox) findViewById(R.id.question16_choice1);
                CheckBox question16_choice2 = (CheckBox) findViewById(R.id.question16_choice2);
                CheckBox question16_choice3 = (CheckBox) findViewById(R.id.question16_choice3);
                CheckBox question16_choice4 = (CheckBox) findViewById(R.id.question16_choice4);

                boolean answer16_choice0 = question16_choice0.isChecked();
                boolean answer16_choice1 = question16_choice1.isChecked();
                boolean answer16_choice2 = question16_choice2.isChecked();
                boolean answer16_choice3 = question16_choice3.isChecked();
                boolean answer16_choice4 = question16_choice4.isChecked();

                if (answer16_choice0) {
                    totalPoint += 0;
                } else if (answer16_choice1) {
                    totalPoint += 1;
                } else if (answer16_choice2) {
                    totalPoint += 2;
                } else if (answer16_choice3) {
                    totalPoint += 3;
                } else if (answer16_choice4) {
                    totalPoint += 4;
                }

                CheckBox question17_choice0 = (CheckBox) findViewById(R.id.question17_choice0);
                CheckBox question17_choice1 = (CheckBox) findViewById(R.id.question17_choice1);
                CheckBox question17_choice2 = (CheckBox) findViewById(R.id.question17_choice2);
                CheckBox question17_choice3 = (CheckBox) findViewById(R.id.question17_choice3);
                CheckBox question17_choice4 = (CheckBox) findViewById(R.id.question17_choice4);

                boolean answer17_choice0 = question17_choice0.isChecked();
                boolean answer17_choice1 = question17_choice1.isChecked();
                boolean answer17_choice2 = question17_choice2.isChecked();
                boolean answer17_choice3 = question17_choice3.isChecked();
                boolean answer17_choice4 = question17_choice4.isChecked();

                if (answer17_choice0) {
                    totalPoint += 0;
                } else if (answer17_choice1) {
                    totalPoint += 1;
                } else if (answer17_choice2) {
                    totalPoint += 2;
                } else if (answer17_choice3) {
                    totalPoint += 3;
                } else if (answer17_choice4) {
                    totalPoint += 4;
                }

                Intent intent = new Intent(SurveySecondActivity.this, SurveyThirdActivity.class);
                intent.putExtra("totalPoint", totalPoint);
                startActivity(intent);
            }
        });

    }
}