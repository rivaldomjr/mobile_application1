package com.ebookfrenzy.mobappassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override

    //Restoring a previous state using the data stored in this bundle
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Creating a intent called "int" pointing to the class WageCal
    // Once the Wages16 button is clicked, the runWage method is executed
    public void runWage (View View) {
        Intent i = new Intent (this, WageCalc.class);
        startActivity(i);
    }

    // Creating a intent called "int" pointing to the class TriangleType
    // Once the show Triangle16 is clicked, the runTriangle method is executed
    public void runTriangle (View View) {
        Intent i = new Intent(this, TriangleType.class);
        startActivity(i);

    }
}