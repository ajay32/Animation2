package com.hackingbuzz.animation2;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView penguin,angryBird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        penguin =(ImageView) findViewById(R.id.penguin);
        angryBird = (ImageView) findViewById(R.id.angrybird);


    }

    public void fadeIn(View view) {


        angryBird.animate().alpha(0f).setDuration(3000); //fade out

        penguin.animate().alpha(1f).setDuration(3000); //fade in

    }
}
