package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.musicapp.R.id.albums_a;
import static com.example.android.musicapp.R.id.artists_a;
import static com.example.android.musicapp.R.id.ic_ab;
import static com.example.android.musicapp.R.id.playlists_a;
import static com.example.android.musicapp.R.id.songs_a;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView now = (ImageView) findViewById(ic_ab);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open a {@Link NowPlayingActivity}
                Intent nowIntent = new Intent(MainActivity.this, nowPlaying.class);
                startActivity(nowIntent);
            }

        });

        TextView artists = (TextView) findViewById(artists_a);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open a {@Link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, artistsActivity.class);
                startActivity(artistsIntent);
            }

        });

        TextView albums = (TextView) findViewById(albums_a);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open a {@Link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, albumsActivity.class);
                startActivity(albumsIntent);
            }

        });

        TextView songs = (TextView) findViewById(songs_a);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open a {@Link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, songsActivity.class);
                startActivity(songsIntent);
            }

        });

        TextView playlists = (TextView) findViewById(playlists_a);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open a {@Link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, playlistsActivity.class);
                startActivity(playlistsIntent);
            }

        });
    }
}
