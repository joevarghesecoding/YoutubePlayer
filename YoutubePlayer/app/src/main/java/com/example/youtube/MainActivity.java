package com.example.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = (Button) findViewById(R.id.main_play_single);
        Button btnStandalone = (Button) findViewById(R.id.main_standalone);

        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch(view.getId()){
            case R.id.main_play_single:
                intent = new Intent(this, YoutubeActivity.class);
                break;

            case R.id.main_standalone:
                intent = new Intent(this, StandaloneActivity.class);
                break;

            default:
        }

        if(intent != null){
            startActivity(intent);
        }
    }
}