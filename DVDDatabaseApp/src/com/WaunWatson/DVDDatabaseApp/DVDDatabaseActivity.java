package com.WaunWatson.DVDDatabaseApp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class DVDDatabaseActivity extends Activity {
    private static final String TAG = "DVDDatabaseActivity";
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.i(TAG, "This how you use the Log!");

        Toast.makeText(this, "This is how you use Toast Messages!", Toast.LENGTH_SHORT).show();
    }
}
