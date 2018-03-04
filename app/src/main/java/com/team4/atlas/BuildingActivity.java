package com.team4.atlas;

import android.content.Intent;
import android.media.Image;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

public class BuildingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);

        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(BuildingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton directions = (ImageButton) findViewById(R.id.directions);
        directions.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast toast = Toast.makeText(BuildingActivity.this, "Directions have not yet been implemented", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });

        Spinner level_spinner = (Spinner) findViewById(R.id.level_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> level_adapter = ArrayAdapter.createFromResource(this,
                R.array.building_level, R.layout.spinner_item);
        // Specify the layout to use when the list of choices appears
        level_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        level_spinner.setAdapter(level_adapter);
    }
}
