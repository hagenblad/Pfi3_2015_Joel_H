package com.example.joelhenning.assignment_4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity{

    public TextView planetName = (TextView) findViewById(R.id.textViewPlanetName);
    public ImageView planetImage = (ImageView) findViewById(R.id.imageViewPlanet);
    public TextView planetRadius = (TextView) findViewById(R.id.textViewPlanetInfo1);
    public TextView planetTemp = (TextView) findViewById(R.id.textViewPlanetInfo2);
    public TextView planetText = (TextView) findViewById(R.id.textViewPlanetText);

    public ImageButton mercuryButton = (ImageButton)

    public void getNewFragment (View v){
        Log.i("Planet Info", "Planet button pressed");

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        PlanetFragment pf = new PlanetFragment();
        ft.replace(R.id.planetGridFragment,pf);
        ft.commit();
    }

//    public void showRightPlanet () {
//
//
//    }

//    public void showDialogFragment (View v){
//        Log.i("Planet Info", "Banana button pressed");
//
//        FragmentManager fm = getSupportFragmentManager();
//        InfoFragment inf = InfoFragment.newInstance
//
//    }

//    public void getPreviousFragment (View v){
//        Log.i("Planet Info", "Back button pressed");
//
//        FragmentManager fm = getFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        GridFragment gf = new GridFragment();
//        ft.replace(R.id.planetInfoFragment, gf);
//        ft.commit();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        GridFragment gf = new GridFragment();
        ft.replace(R.id.main_activity_layout,gf);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
