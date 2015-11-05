package com.example.kittumadhu.homework02;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d("MainActivity", "onCreate");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        Switch toggle = (Switch)findViewById(R.id.age_button);

        final Button button=(Button)findViewById(R.id.ok_button);

        SharedPreferences sharedPrefs = getSharedPreferences("com.example.kittumadhu.homework02", MODE_PRIVATE);
        toggle.setChecked(sharedPrefs.getBoolean("age_button", false));

        button.setEnabled(false);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this,"over 18",Toast.LENGTH_LONG).show();
                    button.setEnabled(true);
                } else {
                    Toast.makeText(MainActivity.this,"under 18",Toast.LENGTH_LONG).show();
                     button.setEnabled(false);
                }
            }
        });


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



    public void sendMessage(View view) {
        Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();

    }
    public void onRestart(){
        super.onRestart();
        Log.d("MainActivity", "on Restart");
    }

    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "onclick", Toast.LENGTH_SHORT).show();
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_button:
                if (checked)
                    Toast.makeText(MainActivity.this,"belongstoUS",Toast.LENGTH_LONG).show();
                    break;
            case R.id.radio_button2:
                if (checked)
                    Toast.makeText(MainActivity.this,"belongstoCanada",Toast.LENGTH_LONG).show();
                    break;
        }
    }
}
