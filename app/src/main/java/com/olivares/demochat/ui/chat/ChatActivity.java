package com.olivares.demochat.ui.chat;

import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;


import androidx.appcompat.app.AppCompatActivity;

import com.olivares.demochat.R;


public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new Explode());
            getWindow().setExitTransition(new Explode());
        }

        setContentView(R.layout.activity_main);
    }
}
