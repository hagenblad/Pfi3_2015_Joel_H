package com.example.joelhenning.assignment_2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    public void getNewFragment (View v){
        Log.i("Skanetrafiken", "Reseplaneraren pressed");

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        PlannerFragment pf = new PlannerFragment();
        ft.replace(R.id.skanetrafiken_main_layout,pf);
        ft.commit();
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        BlankFragment bf = new BlankFragment();
        ft.replace(R.id.main_layout,bf);
        ft.commit();

        Log.i("onCreate", "Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Paused");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Destroyed");
    }

}
