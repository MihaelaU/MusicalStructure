package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import static com.example.android.musicalstructure.R.styleable.MenuItem;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_album);
        TextView mTracksTextView = (TextView) findViewById(R.id.main_text_button_tracks);
        TextView mPlayListTextView = (TextView) findViewById(R.id.main_text_button_playlist);
        TextView mStoreTextView = (TextView) findViewById(R.id.main_text_button_store);
        /*
          Set onClick events for all Activities
         */
        mTracksTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (AlbumActivity.this, TrackActivity.class);
                startActivity(intent);
            }
        });
        mPlayListTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumActivity.this, PlayListActivity.class);
                startActivity(intent);
            }
        });
        mStoreTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
