package com.example.skander.rotaractdesign;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.view.View;
import android.widget.Button;



/**
 * Created by Skander on 24/03/2018.
 */

public class Second_activity extends AppCompatActivity {
    Button b1,b2,b3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        b1 =(Button)findViewById(R.id.home);
        b2 =(Button)findViewById(R.id.history);
         b3 =(Button)findViewById(R.id.clubs);

    }






    public void replace_Fragment(View view)
    {
       Fragment fragment;
        if(view==b1)
        {
            fragment = (Fragment) new FragmentHome();
            android.app.FragmentManager fm = getFragmentManager();
            android.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }

        if(view==b2)
        {
            fragment= (Fragment) new FragmentHistory();
            android.app.FragmentManager fm1 =getFragmentManager();
            android.app.FragmentTransaction ft1 = fm1.beginTransaction();
            ft1.replace(R.id.fragment_place,fragment);
            ft1.commit();
        }

        if(view==b3)
        {
            fragment= (Fragment) new FragmentClubs();
            android.app.FragmentManager fm2 =getFragmentManager();
            android.app.FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.replace(R.id.fragment_place,fragment);
            ft2.commit();
        }

    }
}
