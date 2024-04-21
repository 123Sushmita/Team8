package com.example.aeronavmobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ItineraryActivity extends AppCompatActivity {
    class JsonData {
        public String name;
        public String start_date;
        public String end_date;
        public String duration;
    }

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_itinerary);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);
        RecyclerView recyclerView = findViewById(findViewById(R.id.nav_itineraries);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItineraryActivityDataAdapter(loadData()));
    }

    private List<JsonData> loadData() {
        // Load your JsonData objects here from API
        return new ArrayList<>();
    }

}