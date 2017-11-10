package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "एक", R.drawable.number_one));
        words.add(new Word("Two", "दोन", R.drawable.number_two));
        words.add(new Word("Three", "तीन", R.drawable.number_three));
        words.add(new Word("Four", "चार", R.drawable.number_four));
        words.add(new Word("Five", "पाच", R.drawable.number_five));
        words.add(new Word("Six", "सहा", R.drawable.number_six));
        words.add(new Word("Seven", "सात", R.drawable.number_seven));
        words.add(new Word("Eight", "आठ", R.drawable.number_eight));
        words.add(new Word("Nine", "नऊ", R.drawable.number_nine));
        words.add(new Word("Ten", "दहा", R.drawable.number_ten));




        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
