package com.mikeschen.www.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibActivity extends AppCompatActivity {
    private TextView mAdjective1TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        mAdjective1TextView = (TextView) findViewById(R.id.adjective1TextView);

        Intent intent = getIntent();
        String adjective1 = intent.getStringExtra("adjective1");
        String nationality = intent.getStringExtra("nationality");
        String person = intent.getStringExtra("person");
        mAdjective1TextView.setText("Pizza was invented by a " + adjective1 + " " + nationality + " chef named " + person + ".");
    }
}
