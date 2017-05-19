package com.android.kwave.basiclayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener{

        Button  btnRelative, btnLinear, btnGrid, btnSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnLinear = (Button) findViewById(R.id.btnLinear);
        btnGrid = (Button) findViewById(R.id.btnGrid);
        btnSpinner = (Button) findViewById(R.id.btnSpinner);

        btnRelative.setOnClickListener(this);
        btnLinear.setOnClickListener(this);
        btnGrid.setOnClickListener(this);
        btnSpinner.setOnClickListener(this);
    }


        public void OnClick(View v) {
            switch (v.getId()) {
                case R.id.btnRelative:
                    Intent intent = new Intent(this, RelativeActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btnLinear:

                    break;
                case R.id.btnGrid:

                    break;
                case R.id.btnSpinner:

                    break;
            }
        }

    }