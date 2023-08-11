package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBtn,greenBtn,redBtn,yellowBtn,purpleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        purpleBtn = findViewById(R.id.purpleButton);
        blackBtn = findViewById(R.id.blackButton);
        greenBtn = findViewById(R.id.greenButton);
        redBtn = findViewById(R.id.redButton);
        yellowBtn = findViewById(R.id.yellowButton);


        purpleBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        //find the button by ID and play the correct sound

        int clickBtnId = v.getId();

        if(clickBtnId == R.id.purpleButton){
            playSound(R.raw.purple);
        }else if(clickBtnId == R.id.greenButton){
            playSound(R.raw.green);
        }else if(clickBtnId == R.id.redButton){
            playSound(R.raw.red);
        }else if(clickBtnId == R.id.yellowButton){
            playSound(R.raw.yellow);
        }else if(clickBtnId == R.id.blackButton){
            playSound(R.raw.black);
        }


    }

    public void playSound(int id){
        MediaPlayer mp = MediaPlayer.create(
                this,
                id
        );

        mp.start();
    }
}