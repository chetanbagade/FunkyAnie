package com.example.funkyanie;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Wild_Animals extends AppCompatActivity {
    ToggleButton tb;
    SoundPool sp;
    MediaPlayer mm;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild__animals);

        mm = MediaPlayer.create(this, R.raw.tiger);
        tb = findViewById(R.id.toggleButton3);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mm.start();
                    flag = 1;

                    // The toggle is enabled
                } else if (flag == 1) {

                    // The toggle is disabled
                    mm.stop();
                    flag = 0;
                }
            }
        });

    }
}
