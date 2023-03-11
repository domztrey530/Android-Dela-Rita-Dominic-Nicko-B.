package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.app.Fragment;
//import android.app.FragmentManager;
//import android.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFrag extends AppCompatActivity
{

    Button firstFragment, secondFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frag);

        firstFragment = (Button) findViewById(R.id.FragmentA);
        secondFragment = (Button) findViewById(R.id.FragmentB);

        firstFragment.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v) {

            });
        }
    }
}