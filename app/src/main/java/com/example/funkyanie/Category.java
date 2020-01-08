package com.example.funkyanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);




    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked){
                // for pet animals
                    Intent i1 = new Intent(Category.this,Pet_Animals.class);
                    startActivity(i1);
                }

                    break;
            case R.id.radio_ninjas:
                if (checked){
                    //for wild animals
                    Intent i2 = new Intent(Category.this,Wild_Animals.class);
                    startActivity(i2);
                }

                    break;
        }
    }
}
