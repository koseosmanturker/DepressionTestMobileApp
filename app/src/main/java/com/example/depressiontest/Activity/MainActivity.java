package com.example.depressiontest.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.depressiontest.R;

public class MainActivity extends AppCompatActivity {

    Button startSurveyButton, startSavedResultsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startSurveyButton = (Button) findViewById(R.id.start_survey_button);
        startSavedResultsButton = (Button) findViewById(R.id.saved_results_button);


        startSurveyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SurveyActivity.class));
            }
        });

        startSavedResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SavedResultsActivity.class));
            }
        });
    }
}