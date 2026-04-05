package com.example.baith9_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LanScapeAdapter lanScapeAdapter;
    ArrayList<LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandScape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //
        recylerViewDatas = getDataForRecylerView();
        recyclerViewLandScape = findViewById(R.id.recyclerland);
        //
        RecyclerView.LayoutManager layoutLiner = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLiner);
        lanScapeAdapter = new LanScapeAdapter(this, recylerViewDatas);
        recyclerViewLandScape.setAdapter(lanScapeAdapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //
    ArrayList<LandScape> getDataForRecylerView(){
         ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
         LandScape landScape1 = new LandScape("flag_tower_ha_noi", "cot co Ha Noi");
         dsDuLieu.add(landScape1);
         return dsDuLieu;
    }
}