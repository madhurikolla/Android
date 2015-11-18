package com.example.kittumadhu.assignment03;

/**
 * Created by kittumadhu on 11/16/2015.
 */


        import android.os.Bundle;
        import android.preference.PreferenceFragment;

public class SettingsFragments extends PreferenceFragment {

    public SettingsFragments() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);


    }
}