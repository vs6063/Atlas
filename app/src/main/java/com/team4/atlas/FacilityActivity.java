package com.team4.atlas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class FacilityActivity extends AppCompatActivity {

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
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.wheelchair_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.lift_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.powerplug_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.coffee_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.barbeque_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.computer_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.printer_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.food_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.water_fountain_icon:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.toilet_icon:
                if (checked) {

                }
                else {

                }
                break;
        }
    }
}
