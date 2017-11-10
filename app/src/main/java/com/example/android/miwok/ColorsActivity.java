package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("White","पांढरा",R.drawable.color_white));
        words.add(new Word("Yellow","पिवळा",R.drawable.color_mustard_yellow));
        words.add(new Word("Black","काळा",R.drawable.color_black));
        words.add(new Word("Red","लाल",R.drawable.color_red));
        words.add(new Word("Green","हिरवा",R.drawable.color_green));
        words.add(new Word("Gray","करडा",R.drawable.color_gray));
        words.add(new Word("Brown","तपकिरी",R.drawable.color_brown));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

