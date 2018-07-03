package com.dicoding.nikko.katalogfilm.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dicoding.nikko.katalogfilm.R;
import com.dicoding.nikko.katalogfilm.fragment.MyPreferenceFragment;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(getString(R.string.title_activity_settings));

        getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
