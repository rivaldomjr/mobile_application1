    package com.ebookfrenzy.mobappassignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class TriangleType extends AppCompatActivity {

    @Override
    //Restoring a previous state using the data stored in this bundle
    protected void  onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // displaying the activity_triangletype layout
        setContentView(R.layout.activity_triangletype);
    }
    // Once the Show Triangle Type button is clicked, the triangleType method is executed
    public void triangleType (View View) {

        // Finding the input fields and pointing them to local variables
        EditText firstsidelenght = findViewById(R.id.id_firstsidelenght);
        EditText secondsidelenght = findViewById(R.id.id_secondsidelenght);
        EditText thirdsidelenght = findViewById(R.id.id_thirdsidelenght);

        // pointing the type of result field to a local variable
        TextView typeoftriangle = findViewById(R.id.id_textViewtypeoftriangle);

        // converting the local variable sides to double
        double firstside_double = Double.valueOf(firstsidelenght.getText().toString());
        double secondside_double = Double.valueOf(secondsidelenght.getText().toString());
        double thirdside_double = Double.valueOf(thirdsidelenght.getText().toString());

        // creating the variable to receive the tree triangle type message and
        // setting the default message "Scarlene"
        String msg = "Scarlene";


        // calculating the triangle side to display the type
        // Three sides equals, then it is equilateral
        if (firstside_double == secondside_double && secondside_double == thirdside_double){
            msg = "Equilateral";
        // at least two sides are equal, then it is isosceles
        } else if (firstside_double == secondside_double || firstside_double == thirdside_double
                    || secondside_double == thirdside_double) {
            msg = "Isoceles";

        }

        typeoftriangle.setText(msg);

    }


}
