package com.example.depressiontest.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.depressiontest.DB.DB;
import com.example.depressiontest.R;

public class SurveyResultActivity extends AppCompatActivity {

    int totalPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_result);

        Intent intent = getIntent();
        totalPoint = intent.getIntExtra("totalPoint", totalPoint);

        TextView finalScoreTextView = findViewById(R.id.puan_text_view);
        finalScoreTextView.setText("Test Sonucunuz: " + totalPoint);

        Button startAgainButton = findViewById(R.id.tekrar_baslat_buton);

        startAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNewResult();
                Intent intent1 = new Intent(SurveyResultActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });



    }

    private void addNewResult() {

        String res = "Test Sonucunuz: " + totalPoint;
        DB.getInstance(this).addNewResult(res);
        finish();
    };


}
