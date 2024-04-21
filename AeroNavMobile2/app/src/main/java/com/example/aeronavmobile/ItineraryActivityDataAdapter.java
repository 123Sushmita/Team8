package com.example.aeronavmobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItineraryActivityDataAdapter   extends RecyclerView.Adapter<ItineraryActivityDataAdapter.ViewHolder> {

        private List<ItineraryActivity.JsonData> jsonDataList;

    public ItineraryActivityDataAdapter(List<ItineraryActivity.JsonData> jsonDataList) {
        this.jsonDataList = jsonDataList;
    }
    
     @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.itinerary_activity, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ItineraryActivity.JsonData data = jsonDataList.get(position);
        holder.nameTextView.setText(data.name);
        holder.dateTextView.setText(data.start_date + " - " + data.end_date);
        holder.durationTextView.setText(data.duration);
    }

    @Override
    public int getItemCount() {
        return jsonDataList.size();
    }

        public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView dateTextView;
        public TextView durationTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name);
            dateTextView = itemView.findViewById(R.id.date);
            durationTextView = itemView.findViewById(R.id.duration);
        }
    }
    

}
