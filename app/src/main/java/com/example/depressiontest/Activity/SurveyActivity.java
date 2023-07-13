package com.example.depressiontest.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.depressiontest.R;

public class SurveyActivity extends AppCompatActivity {

    int totalPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);



        Button startSecondActivityButton = (Button) findViewById(R.id.first_to_second_button);

        startSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox question1_choice0 = (CheckBox) findViewById(R.id.question1_choice0);
                CheckBox question1_choice1 = (CheckBox) findViewById(R.id.question1_choice1);
                CheckBox question1_choice2 = (CheckBox) findViewById(R.id.question1_choice2);
                CheckBox question1_choice3 = (CheckBox) findViewById(R.id.question1_choice3);
                CheckBox question1_choice4 = (CheckBox) findViewById(R.id.question1_choice4);

                boolean answer1_choice0 = question1_choice0.isChecked();
                boolean answer1_choice1 = question1_choice1.isChecked();
                boolean answer1_choice2 = question1_choice2.isChecked();
                boolean answer1_choice3 = question1_choice3.isChecked();
                boolean answer1_choice4 = question1_choice4.isChecked();

                if(answer1_choice0){
                    totalPoint += 0;
                }
                else if(answer1_choice1){
                    totalPoint += 1;
                }
                else if (answer1_choice2){
                    totalPoint += 2;
                }
                else if (answer1_choice3){
                    totalPoint += 3;
                }
                else if (answer1_choice4){
                    totalPoint += 4;
                }

                CheckBox question2_choice0 = (CheckBox) findViewById(R.id.question2_choice0);
                CheckBox question2_choice1 = (CheckBox) findViewById(R.id.question2_choice1);
                CheckBox question2_choice2 = (CheckBox) findViewById(R.id.question2_choice2);
                CheckBox question2_choice3 = (CheckBox) findViewById(R.id.question2_choice3);
                CheckBox question2_choice4 = (CheckBox) findViewById(R.id.question2_choice4);

                boolean answer2_choice0 = question2_choice0.isChecked();
                boolean answer2_choice1 = question2_choice1.isChecked();
                boolean answer2_choice2 = question2_choice2.isChecked();
                boolean answer2_choice3 = question2_choice3.isChecked();
                boolean answer2_choice4 = question2_choice4.isChecked();

                if(answer2_choice0){
                    totalPoint += 0;
                }
                else if(answer2_choice1){
                    totalPoint += 1;
                }
                else if (answer2_choice2){
                    totalPoint += 2;
                }
                else if (answer2_choice3){
                    totalPoint += 3;
                }
                else if (answer2_choice4){
                    totalPoint += 4;
                }

                CheckBox question3_choice0 = (CheckBox) findViewById(R.id.question3_choice0);
                CheckBox question3_choice1 = (CheckBox) findViewById(R.id.question3_choice1);
                CheckBox question3_choice2 = (CheckBox) findViewById(R.id.question3_choice2);
                CheckBox question3_choice3 = (CheckBox) findViewById(R.id.question3_choice3);
                CheckBox question3_choice4 = (CheckBox) findViewById(R.id.question3_choice4);

                boolean answer3_choice0 = question3_choice0.isChecked();
                boolean answer3_choice1 = question3_choice1.isChecked();
                boolean answer3_choice2 = question3_choice2.isChecked();
                boolean answer3_choice3 = question3_choice3.isChecked();
                boolean answer3_choice4 = question3_choice4.isChecked();

                if(answer3_choice0){
                    totalPoint += 0;
                }
                else if(answer3_choice1){
                    totalPoint += 1;
                }
                else if (answer3_choice2){
                    totalPoint += 2;
                }
                else if (answer3_choice3){
                    totalPoint += 3;
                }
                else if (answer3_choice4){
                    totalPoint += 4;
                }


                CheckBox question4_choice0 = (CheckBox) findViewById(R.id.question4_choice0);
                CheckBox question4_choice1 = (CheckBox) findViewById(R.id.question4_choice1);
                CheckBox question4_choice2 = (CheckBox) findViewById(R.id.question4_choice2);
                CheckBox question4_choice3 = (CheckBox) findViewById(R.id.question4_choice3);
                CheckBox question4_choice4 = (CheckBox) findViewById(R.id.question4_choice4);

                boolean answer4_choice0 = question4_choice0.isChecked();
                boolean answer4_choice1 = question4_choice1.isChecked();
                boolean answer4_choice2 = question4_choice2.isChecked();
                boolean answer4_choice3 = question4_choice3.isChecked();
                boolean answer4_choice4 = question4_choice4.isChecked();

                if (answer4_choice0) {
                    totalPoint += 0;
                } else if (answer4_choice1) {
                    totalPoint += 1;
                } else if (answer4_choice2) {
                    totalPoint += 2;
                } else if (answer4_choice3) {
                    totalPoint += 3;
                } else if (answer4_choice4) {
                    totalPoint += 4;
                }


                CheckBox question5_choice0 = (CheckBox) findViewById(R.id.question5_choice0);
                CheckBox question5_choice1 = (CheckBox) findViewById(R.id.question5_choice1);
                CheckBox question5_choice2 = (CheckBox) findViewById(R.id.question5_choice2);
                CheckBox question5_choice3 = (CheckBox) findViewById(R.id.question5_choice3);
                CheckBox question5_choice4 = (CheckBox) findViewById(R.id.question5_choice4);

                boolean answer5_choice0 = question5_choice0.isChecked();
                boolean answer5_choice1 = question5_choice1.isChecked();
                boolean answer5_choice2 = question5_choice2.isChecked();
                boolean answer5_choice3 = question5_choice3.isChecked();
                boolean answer5_choice4 = question5_choice4.isChecked();

                if (answer5_choice0) {
                    totalPoint += 0;
                } else if (answer5_choice1) {
                    totalPoint += 1;
                } else if (answer5_choice2) {
                    totalPoint += 2;
                } else if (answer5_choice3) {
                    totalPoint += 3;
                } else if (answer5_choice4) {
                    totalPoint += 4;
                }

                CheckBox question6_choice0 = (CheckBox) findViewById(R.id.question6_choice0);
                CheckBox question6_choice1 = (CheckBox) findViewById(R.id.question6_choice1);
                CheckBox question6_choice2 = (CheckBox) findViewById(R.id.question6_choice2);
                CheckBox question6_choice3 = (CheckBox) findViewById(R.id.question6_choice3);
                CheckBox question6_choice4 = (CheckBox) findViewById(R.id.question6_choice4);

                boolean answer6_choice0 = question6_choice0.isChecked();
                boolean answer6_choice1 = question6_choice1.isChecked();
                boolean answer6_choice2 = question6_choice2.isChecked();
                boolean answer6_choice3 = question6_choice3.isChecked();
                boolean answer6_choice4 = question6_choice4.isChecked();

                if (answer6_choice0) {
                    totalPoint += 0;
                } else if (answer6_choice1) {
                    totalPoint += 1;
                } else if (answer6_choice2) {
                    totalPoint += 2;
                } else if (answer6_choice3) {
                    totalPoint += 3;
                } else if (answer6_choice4) {
                    totalPoint += 4;
                }

                CheckBox question7_choice0 = (CheckBox) findViewById(R.id.question7_choice0);
                CheckBox question7_choice1 = (CheckBox) findViewById(R.id.question7_choice1);
                CheckBox question7_choice2 = (CheckBox) findViewById(R.id.question7_choice2);
                CheckBox question7_choice3 = (CheckBox) findViewById(R.id.question7_choice3);
                CheckBox question7_choice4 = (CheckBox) findViewById(R.id.question7_choice4);

                boolean answer7_choice0 = question7_choice0.isChecked();
                boolean answer7_choice1 = question7_choice1.isChecked();
                boolean answer7_choice2 = question7_choice2.isChecked();
                boolean answer7_choice3 = question7_choice3.isChecked();
                boolean answer7_choice4 = question7_choice4.isChecked();

                if (answer7_choice0) {
                    totalPoint += 0;
                } else if (answer7_choice1) {
                    totalPoint += 1;
                } else if (answer7_choice2) {
                    totalPoint += 2;
                } else if (answer7_choice3) {
                    totalPoint += 3;
                } else if (answer7_choice4) {
                    totalPoint += 4;
                }


                CheckBox question8_choice0 = (CheckBox) findViewById(R.id.question8_choice0);
                CheckBox question8_choice1 = (CheckBox) findViewById(R.id.question8_choice1);
                CheckBox question8_choice2 = (CheckBox) findViewById(R.id.question8_choice2);
                CheckBox question8_choice3 = (CheckBox) findViewById(R.id.question8_choice3);
                CheckBox question8_choice4 = (CheckBox) findViewById(R.id.question8_choice4);

                boolean answer8_choice0 = question8_choice0.isChecked();
                boolean answer8_choice1 = question8_choice1.isChecked();
                boolean answer8_choice2 = question8_choice2.isChecked();
                boolean answer8_choice3 = question8_choice3.isChecked();
                boolean answer8_choice4 = question8_choice4.isChecked();

                if (answer8_choice0) {
                    totalPoint += 0;
                } else if (answer8_choice1) {
                    totalPoint += 1;
                } else if (answer8_choice2) {
                    totalPoint += 2;
                } else if (answer8_choice3) {
                    totalPoint += 3;
                } else if (answer8_choice4) {
                    totalPoint += 4;
                }


                CheckBox question9_choice0 = (CheckBox) findViewById(R.id.question9_choice0);
                CheckBox question9_choice1 = (CheckBox) findViewById(R.id.question9_choice1);
                CheckBox question9_choice2 = (CheckBox) findViewById(R.id.question9_choice2);
                CheckBox question9_choice3 = (CheckBox) findViewById(R.id.question9_choice3);
                CheckBox question9_choice4 = (CheckBox) findViewById(R.id.question9_choice4);

                boolean answer9_choice0 = question9_choice0.isChecked();
                boolean answer9_choice1 = question9_choice1.isChecked();
                boolean answer9_choice2 = question9_choice2.isChecked();
                boolean answer9_choice3 = question9_choice3.isChecked();
                boolean answer9_choice4 = question9_choice4.isChecked();

                if (answer9_choice0) {
                    totalPoint += 0;
                } else if (answer9_choice1) {
                    totalPoint += 1;
                } else if (answer9_choice2) {
                    totalPoint += 2;
                } else if (answer9_choice3) {
                    totalPoint += 3;
                } else if (answer9_choice4) {
                    totalPoint += 4;
                }

                CheckBox question10_choice0 = (CheckBox) findViewById(R.id.question10_choice0);
                CheckBox question10_choice1 = (CheckBox) findViewById(R.id.question10_choice1);
                CheckBox question10_choice2 = (CheckBox) findViewById(R.id.question10_choice2);
                CheckBox question10_choice3 = (CheckBox) findViewById(R.id.question10_choice3);
                CheckBox question10_choice4 = (CheckBox) findViewById(R.id.question10_choice4);

                boolean answer10_choice0 = question10_choice0.isChecked();
                boolean answer10_choice1 = question10_choice1.isChecked();
                boolean answer10_choice2 = question10_choice2.isChecked();
                boolean answer10_choice3 = question10_choice3.isChecked();
                boolean answer10_choice4 = question10_choice4.isChecked();

                if (answer10_choice0) {
                    totalPoint += 0;
                } else if (answer10_choice1) {
                    totalPoint += 1;
                } else if (answer10_choice2) {
                    totalPoint += 2;
                } else if (answer10_choice3) {
                    totalPoint += 3;
                } else if (answer10_choice4) {
                    totalPoint += 4;
                }

                Intent intent = new Intent(SurveyActivity.this, SurveySecondActivity.class);
                intent.putExtra("totalPoint", totalPoint);
                startActivity(intent);
            }
        });










    }
}