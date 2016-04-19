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
    private Button mReadMadLibButton;
    private EditText mAdjective1EditText;
    private EditText mNationalityEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdjective1EditText = (EditText) findViewById(R.id.adjective1EditText);
        mNationalityEditText = (EditText) findViewById(R.id.nationalityEditText);
        mReadMadLibButton = (Button) findViewById(R.id.readMadLibButton);
        mReadMadLibButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String adjective1 = mAdjective1EditText.getText().toString();
                String nationality = mNationalityEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, MadLibActivity.class);
                intent.putExtra("adjective1", adjective1);
                intent.putExtra("nationality", nationality);
                startActivity(intent);
            }
        });
    }
}
