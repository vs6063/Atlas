package com.team4.atlas;

import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private float mx, my;
    private float curX, curY;

    private ScrollView vScroll;
    private HorizontalScrollView hScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        vScroll = (ScrollView) findViewById(R.id.vScroll);
        hScroll = (HorizontalScrollView) findViewById(R.id.hScroll);

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

        Button tyreeButton = (Button) findViewById(R.id.tyree_button);
        tyreeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, BuildingActivity.class);
            startActivity(intent);
            }
        });

        ImageButton scatterPlot = (ImageButton) findViewById(R.id.scatterplot);
        scatterPlot.bringToFront();
        scatterPlot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Scatterplot has not yet been implemented", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        ImageButton location = (ImageButton) findViewById(R.id.location);
        location.bringToFront();
        location.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Current Location has not yet been implemented", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        ImageButton directions = (ImageButton) findViewById(R.id.directions);
        directions.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Directions have not yet been implemented", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });
        TextView textdirections = (TextView) findViewById(R.id.textdirections);
        textdirections.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Directions have not yet been implemented", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Intent intent = getIntent();
        ArrayList<String> facilities = intent.getStringArrayListExtra(FacilityActivity.FACILITIES);
        if (intent.getBooleanExtra(SpaceActivity.SHOW_SPACES, false) == true) {
            ConstraintLayout results_wrapper = (ConstraintLayout) findViewById(R.id.results_wrapper);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) results_wrapper.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            results_wrapper.setLayoutParams(layoutParams);
            ConstraintLayout facilities_results = (ConstraintLayout) findViewById(R.id.facilities_results);
            facilities_results.setVisibility(View.GONE);
        } else if (facilities != null && facilities.size() > 0) {
            boolean showFacilities = false;
            for (String curr: facilities) {
                if (curr.equals("wheelchair")) {
                    showFacilities = true;
                    break;
                } else if (curr.equals("powerplug")) {
                    showFacilities = true;
                    break;
                } else if (curr.equals("coffee")) {
                    showFacilities = true;
                    break;
                } else if (curr.equals("food")) {
                    showFacilities = true;
                    break;
                } else if (curr.equals("toilet")) {
                    showFacilities = true;
                    break;
                }
            }
            if (showFacilities == true) {
                ConstraintLayout results_wrapper = (ConstraintLayout) findViewById(R.id.results_wrapper);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) results_wrapper.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                results_wrapper.setLayoutParams(layoutParams);
                ConstraintLayout space_results = (ConstraintLayout) findViewById(R.id.space_results);
                space_results.setVisibility(View.GONE);
            }
        }

        ImageButton nextSpaceButton = (ImageButton) findViewById(R.id.next_space);
        nextSpaceButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BuildingActivity.class);
                startActivity(intent);
            }
        });
        ImageButton nextFacilityButton = (ImageButton) findViewById(R.id.next_facility);
        nextFacilityButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BuildingActivity.class);
                startActivity(intent);
            }
        });

        // get intent for search, verify action and get the query
        /*
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);
        }
        */
    }

    //void doMySearch(String query) {}

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float curX, curY;

        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                mx = event.getX();
                my = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                curX = event.getX();
                curY = event.getY();
                vScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                hScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                mx = curX;
                my = curY;
                break;
            case MotionEvent.ACTION_UP:
                curX = event.getX();
                curY = event.getY();
                vScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                hScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                break;
        }

        return true;
    }
}