package com.devops.puzzlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

  //  ImageView coverImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void ButtonOnClick(View V){
        Intent myIntent = new Intent(getBaseContext(),   MainActivity.class);
        startActivity(myIntent);

      //  coverImage = findViewById(R.id.imageView2);
    }
}