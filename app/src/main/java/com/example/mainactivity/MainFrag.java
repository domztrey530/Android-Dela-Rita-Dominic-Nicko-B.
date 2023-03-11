package com.example.mainactivity;


import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


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
                loadFragment(new FragmentA());
            }
        });

        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentB());
            }
        });
    }
    private static void loadFragment(Fragment fragment)
    {
        FragmentManager fm = fragment.getFragmentManager();
        FragmentTransaction fragmentTransaction= fm.beginTransaction();

        FragmentTransaction fragmentTransaction1 = fm.beginTransaction();
        fragmentTransaction1.replace(R.id.frameLayout, fragment);


    }
}