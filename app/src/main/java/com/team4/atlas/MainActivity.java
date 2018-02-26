package com.team4.atlas;

import android.app.SearchManager;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // get intent for search, verify action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);
        }

        ImageButton spaceButton = (ImageButton) findViewById(R.id.space);
        spaceButton.bringToFront();
        spaceButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SpaceActivity.class);
                startActivity(intent);
            }
        });

        ImageButton facilityButton = (ImageButton) findViewById(R.id.facility);
        facilityButton.bringToFront();
        facilityButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FacilityActivity.class);
                startActivity(intent);
            }
        });

        ImageButton scatterPlot = (ImageButton) findViewById(R.id.scatterplot);
        ImageButton location = (ImageButton) findViewById(R.id.location);
        scatterPlot.bringToFront();
        location.bringToFront();
    }

    void doMySearch(String query) {

    }
}