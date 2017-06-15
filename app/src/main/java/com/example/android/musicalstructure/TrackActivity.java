package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView mAlbumsTextView = (TextView) findViewById(R.id.main_text_button_albums);
        TextView mPlayListTextView = (TextView) findViewById(R.id.main_text_button_playlist);
        TextView mStoreTextView = (TextView) findViewById(R.id.main_text_button_store);
        //all activities for tracks
        mAlbumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });
        mPlayListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackActivity.this, PlayListActivity.class);
                startActivity(intent);
            }
        });
        mStoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
