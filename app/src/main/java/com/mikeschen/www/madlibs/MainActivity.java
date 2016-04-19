package com.mikeschen.www.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mReadMadLibButton;
    private EditText mAdjective1EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdjective1EditText = (EditText) findViewById(R.id.adjective1EditText);
        mReadMadLibButton = (Button) findViewById(R.id.readMadLibButton);
        mReadMadLibButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String adjective1 = mAdjective1EditText.getText().toString();
                Log.d(TAG, adjective1);
                Intent intent = new Intent(MainActivity.this, MadLibActivity.class);
                startActivity(intent);
            }
        });
    }
}
