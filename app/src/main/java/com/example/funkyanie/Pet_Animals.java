package com.example.funkyanie;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Random;

public class Pet_Animals extends AppCompatActivity  {
    ToggleButton tb;
    SoundPool sp;
    MediaPlayer mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet__animals);
        mm=MediaPlayer.create(this,R.raw.dog);
        tb = findViewById(R.id.toggleButton);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mm.start();
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                    mm.stop();
                }
            }
        });

    }

}
