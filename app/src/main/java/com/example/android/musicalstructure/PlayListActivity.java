package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView mTracksTextView = (TextView) findViewById(R.id.main_text_button_tracks);
        TextView mAlbumsTextView = (TextView) findViewById(R.id.main_text_button_albums);
        TextView mStoreTextView = (TextView) findViewById(R.id.main_text_button_store);
        //set on click activities
        mTracksTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayListActivity.this, TrackActivity.class);
                startActivity(intent);
            }
        });
        mAlbumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayListActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });
        mStoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayListActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
