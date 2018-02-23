package com.team4.atlas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Spinner;

public class SpaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);

        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(SpaceActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Spinner location_spinner = (Spinner) findViewById(R.id.location_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> location_adapter = ArrayAdapter.createFromResource(this,
                R.array.location, R.layout.spinner_item);
        // Specify the layout to use when the list of choices appears
        location_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        location_spinner.setAdapter(location_adapter);

        Spinner indoor_spinner = (Spinner) findViewById(R.id.indoor_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> indoor_adapter = ArrayAdapter.createFromResource(this,
                R.array.indoor, R.layout.spinner_item);
        // Specify the layout to use when the list of choices appears
        indoor_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        indoor_spinner.setAdapter(indoor_adapter);

        Spinner wheelchair_spinner = (Spinner) findViewById(R.id.wheelchair_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> wheelchair_adapter = ArrayAdapter.createFromResource(this,
                R.array.wheelchair, R.layout.spinner_item);
        // Specify the layout to use when the list of choices appears
        wheelchair_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        wheelchair_spinner.setAdapter(wheelchair_adapter);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.open_spaces:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.lecture_halls:
                if (checked) {

                }
                else {

                }
                break;
            case R.id.tutorial_rooms:
                if (checked) {

                }
                else {

                }
            case R.id.projector:
                if (checked) {

                }
                else {

                }
            case R.id.whiteboard:
                if (checked) {

                }
                else {

                }
        }
    }
}
