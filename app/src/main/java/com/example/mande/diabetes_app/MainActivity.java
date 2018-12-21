package com.example.mande.diabetes_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home__screen);
        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.parseColor("#EFEFEF"));

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
//
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);



        Button redButton = new Button(this);
        redButton.setBackgroundColor(Color.parseColor("#AEC9FF"));
        redButton.setText("Log In");

        Button createButton = new Button (this);
        createButton.setBackgroundColor(Color.parseColor("#FFFFFF"));
        createButton.setText("Create Account");


        EditText username = new EditText(this);

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams createDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

      //  createDetails.addRule(RelativeLayout.BELOW,redButton.getId());
       // createDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
       // createDetails.setMargins(0,0,50,0);

        redButton.setId(1);
        username.setId(2);
        createButton.setId(3);

        usernameDetails.addRule(RelativeLayout.ABOVE,redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        createDetails.addRule(RelativeLayout.LEFT_OF,redButton.getId());
        createDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        createDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        createDetails.setMargins(0,0,50,0);





        myLayout.addView(redButton,buttonDetails);
        myLayout.addView(username,usernameDetails);
        myLayout.addView(createButton,createDetails);
        setContentView(myLayout);
    }
}
