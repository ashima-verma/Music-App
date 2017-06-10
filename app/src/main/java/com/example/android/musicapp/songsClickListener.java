package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class songsClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the List of Songs", Toast.LENGTH_SHORT).show();
    }
}
