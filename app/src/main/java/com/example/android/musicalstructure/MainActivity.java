package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTracksTextView = (TextView) findViewById(R.id.main_text_button_tracks);
        TextView mAlbumsTextView = (TextView) findViewById(R.id.main_text_button_albums);
        TextView mPlayListTextView = (TextView) findViewById(R.id.main_text_button_playlist);
        TextView mStoreTextView = (TextView) findViewById(R.id.main_text_button_store);

        //all activities
        mTracksTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrackActivity.class);
                startActivity(intent);
            }
        });
        mAlbumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });
        mPlayListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(intent);
            }
        });
        mStoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
