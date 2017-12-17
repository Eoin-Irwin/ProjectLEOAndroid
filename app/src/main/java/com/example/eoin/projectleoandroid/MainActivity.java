package com.example.eoin.projectleoandroid;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = (Button) findViewById(R.id.Button_easy);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.Button_medium);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.Button_hard);
        three.setOnClickListener(this);
    }

    public void progressBar() {
        ProgressDialog progress;

        progress = new ProgressDialog(this);
        progress.setTitle("Looking for questions");
        progress.setMessage("Loading...");
        progress.setCancelable(true);
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.show();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Button_easy:
                Toast.makeText(MainActivity.this,
                        "Easy", Toast.LENGTH_SHORT).show();
                progressBar();
                Intent intent = new Intent(this, EasyQuestions.class);
                this.startActivity(intent);
                break;

            case R.id.Button_medium:
                Toast.makeText(MainActivity.this,
                        "Medium", Toast.LENGTH_SHORT).show();
                progressBar();
                break;

            case R.id.Button_hard:
                Toast.makeText(MainActivity.this,
                        "Hard", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}