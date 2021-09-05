package com.ebookfrenzy.mobappassignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WageCalc extends AppCompatActivity {


    @Override
    //Restoring a previous state using the data stored in this bundle
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //displaying the activity_wagecalc layout
        setContentView(R.layout.activity_wagecalc);

    }
    // Once the Show Calculate button is clicked, the calculateWage method is executed
    public void calculateWage (View View){

        // Finding the input fields and pointing them to local variables
        EditText hourlywage = findViewById(R.id.id_hourlywage);
        EditText totalregularhours = findViewById(R.id.id_totalregularhours);
        EditText overtimepay = findViewById(R.id.id_overtimepay);
        TextView totalwage = findViewById(R.id.id_totalwage);

        // converting the local variables to float
        Float  hourlywage_float = Float.valueOf(hourlywage.getText().toString());
        Float  totalregularhours_float = Float.valueOf(totalregularhours.getText().toString());
        Float  overtimepay_float = Float.valueOf(overtimepay.getText().toString());

        // calculating the employee total wage
        Double totalwage_float = (hourlywage_float * totalregularhours_float + (overtimepay_float * 1.8));

        // converting result to string, puting into the field on screen call totalwage
        totalwage.setText(totalwage_float.toString());



    }


}
