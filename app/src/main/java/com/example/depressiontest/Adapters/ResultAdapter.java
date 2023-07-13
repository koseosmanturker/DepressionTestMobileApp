package com.example.depressiontest.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.depressiontest.Entity.Result;
import com.example.depressiontest.R;

import java.util.ArrayList;

import android.view.View;
import android.widget.TextView;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ViewHolder> {

    private ArrayList<Result> resultItemList;

    public ResultAdapter(ArrayList<Result> resultItemList) {
        this.resultItemList = resultItemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.result_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Result result = resultItemList.get(position);
        holder.resultTextView.setText(result.getResult());
    }

    @Override
    public int getItemCount() {
        return resultItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView resultTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            resultTextView = itemView.findViewById(R.id.result_text_view_item);
        }
    }
}
