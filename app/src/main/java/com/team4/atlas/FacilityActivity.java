package com.team4.atlas;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

import java.util.ArrayList;

public class FacilityActivity extends AppCompatActivity {

    public static final String FACILITIES = "com.team4.atlas.FACILITIES";
    ArrayList<String> facilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);

        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(FacilityActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        facilities = new ArrayList<String>();

        ImageButton findButton = (ImageButton) findViewById(R.id.find);
        findButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(FacilityActivity.this, MainActivity.class);
                intent.putStringArrayListExtra(FACILITIES, facilities);
                startActivity(intent);
            }
        });
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.wheelchair_icon:
                if (checked) {
                    facilities.add("wheelchair");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("wheelchair")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.lift_icon:
                if (checked) {
                    facilities.add("lift");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("lift")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.powerplug_icon:
                if (checked) {
                    facilities.add("powerplug");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("powerplug")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.coffee_icon:
                if (checked) {
                    facilities.add("coffee");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("coffee")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.barbeque_icon:
                if (checked) {
                    facilities.add("barbeque");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("coffee")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.computer_icon:
                if (checked) {
                    facilities.add("computer");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("computer")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.printer_icon:
                if (checked) {
                    facilities.add("printer");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("printer")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.food_icon:
                if (checked) {
                    facilities.add("food");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("food")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.water_fountain_icon:
                if (checked) {
                    facilities.add("water_fountain");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("water_fountain")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
            case R.id.toilet_icon:
                if (checked) {
                    facilities.add("toilet");
                }
                else {
                    for (int i = 0; i < facilities.size(); i++) {
                        if (facilities.get(i).equals("toilet")) {
                            facilities.remove(i);
                        }
                    }
                }
                break;
        }
    }
}
