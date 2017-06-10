package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class nowPlayingClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the Song which is being Played", Toast.LENGTH_SHORT).show();
    }
}
