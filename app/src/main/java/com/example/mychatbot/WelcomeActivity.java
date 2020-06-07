package com.example.mychatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends AppCompatActivity {
    /*
        This activity is similar to the Splash screen.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        /*
            Display the activity for some time and proceed to login activity.
         */
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainWindow = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(mainWindow);
                finish();
            }
        }, 1000);
    }
}