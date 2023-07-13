package com.example.depressiontest.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.depressiontest.R;

public class SurveyFourthActivity extends AppCompatActivity {

    int totalPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_fourth);

        Intent intent = getIntent();
        totalPoint = intent.getIntExtra("totalPoint", totalPoint);

        Button resultsButton = (Button) findViewById(R.id.results_page_button);

        resultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox question23_choice0 = (CheckBox) findViewById(R.id.question23_choice0);
                CheckBox question23_choice1 = (CheckBox) findViewById(R.id.question23_choice1);
                CheckBox question23_choice2 = (CheckBox) findViewById(R.id.question23_choice2);
                CheckBox question23_choice3 = (CheckBox) findViewById(R.id.question23_choice3);
                CheckBox question23_choice4 = (CheckBox) findViewById(R.id.question23_choice4);

                boolean answer23_choice0 = question23_choice0.isChecked();
                boolean answer23_choice1 = question23_choice1.isChecked();
                boolean answer23_choice2 = question23_choice2.isChecked();
                boolean answer23_choice3 = question23_choice3.isChecked();
                boolean answer23_choice4 = question23_choice4.isChecked();

                if (answer23_choice0) {
                    totalPoint += 0;
                } else if (answer23_choice1) {
                    totalPoint += 1;
                } else if (answer23_choice2) {
                    totalPoint += 2;
                } else if (answer23_choice3) {
                    totalPoint += 3;
                } else if (answer23_choice4) {
                    totalPoint += 4;
                }


                CheckBox question24_choice0 = (CheckBox) findViewById(R.id.question24_choice0);
                CheckBox question24_choice1 = (CheckBox) findViewById(R.id.question24_choice1);
                CheckBox question24_choice2 = (CheckBox) findViewById(R.id.question24_choice2);
                CheckBox question24_choice3 = (CheckBox) findViewById(R.id.question24_choice3);
                CheckBox question24_choice4 = (CheckBox) findViewById(R.id.question24_choice4);

                boolean answer24_choice0 = question24_choice0.isChecked();
                boolean answer24_choice1 = question24_choice1.isChecked();
                boolean answer24_choice2 = question24_choice2.isChecked();
                boolean answer24_choice3 = question24_choice3.isChecked();
                boolean answer24_choice4 = question24_choice4.isChecked();

                if (answer24_choice0) {
                    totalPoint += 0;
                } else if (answer24_choice1) {
                    totalPoint += 1;
                } else if (answer24_choice2) {
                    totalPoint += 2;
                } else if (answer24_choice3) {
                    totalPoint += 3;
                } else if (answer24_choice4) {
                    totalPoint += 4;
                }


                CheckBox question25_choice0 = (CheckBox) findViewById(R.id.question25_choice0);
                CheckBox question25_choice1 = (CheckBox) findViewById(R.id.question25_choice1);
                CheckBox question25_choice2 = (CheckBox) findViewById(R.id.question25_choice2);
                CheckBox question25_choice3 = (CheckBox) findViewById(R.id.question25_choice3);
                CheckBox question25_choice4 = (CheckBox) findViewById(R.id.question25_choice4);

                boolean answer25_choice0 = question25_choice0.isChecked();
                boolean answer25_choice1 = question25_choice1.isChecked();
                boolean answer25_choice2 = question25_choice2.isChecked();
                boolean answer25_choice3 = question25_choice3.isChecked();
                boolean answer25_choice4 = question25_choice4.isChecked();

                if (answer25_choice0) {
                    totalPoint += 0;
                } else if (answer25_choice1) {
                    totalPoint += 1;
                } else if (answer25_choice2) {
                    totalPoint += 2;
                } else if (answer25_choice3) {
                    totalPoint += 3;
                } else if (answer25_choice4) {
                    totalPoint += 4;
                }

                Intent intent = new Intent(SurveyFourthActivity.this, SurveyResultActivity.class);
                intent.putExtra("totalPoint", totalPoint);
                startActivity(intent);

            }
        });
    }
}