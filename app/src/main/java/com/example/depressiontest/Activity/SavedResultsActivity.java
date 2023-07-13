package com.example.depressiontest.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.depressiontest.R;

import java.util.ArrayList;

import com.example.depressiontest.Adapters.ResultAdapter;
import com.example.depressiontest.DB.DB;
import com.example.depressiontest.Entity.Result;

public class SavedResultsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_results);

        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ArrayList<Result> results = DB.getInstance(this).getAllResults();
        displayResults(results);
    }

    private void displayResults(ArrayList<Result> results) {

        ResultAdapter resultAdapter = new ResultAdapter(results);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(resultAdapter);

    }
}