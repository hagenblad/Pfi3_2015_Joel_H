package com.example.joelhenning.assignment_1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {


    Random random = new Random();
    int quoteNumber = 0;

    public void getQuote (View v) {
        // Send to logcat
        Log.i("MyApp", "Button pressed");

        TextView movieQuote = (TextView) findViewById(R.id.moviequote);
        TextView movieTitle = (TextView) findViewById(R.id.movietitle);

        //Clear the textViews
        movieQuote.setText(null);
        movieTitle.setText(null);

        // Load the string-arrays
        String [] movies = getResources().getStringArray(R.array.movies);
        String [] quotes = getResources().getStringArray(R.array.quotes);

        // Generate a "random" position in the string-arrays
        quoteNumber = random.nextInt(quotes.length);

        // print out the quote and movie in respective textView
        movieQuote.setText(quotes[quoteNumber]);
        movieTitle.setText(movies[quoteNumber]);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
