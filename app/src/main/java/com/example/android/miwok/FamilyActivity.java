package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","वडील",R.drawable.family_father));
        words.add(new Word("Mother","आई",R.drawable.family_mother));
        words.add(new Word("Sister","बहीण",R.drawable.family_older_sister));
        words.add(new Word("Brother","भाऊ",R.drawable.family_older_brother));
        words.add(new Word("Grand Mother","आजी",R.drawable.family_grandmother));
        words.add(new Word("Grand Father","आजोबा",R.drawable.family_grandfather));
        words.add(new Word("Uncle","काका",R.drawable.family_younger_brother));
        words.add(new Word("Aunty","काकू",R.drawable.family_younger_sister));
        words.add(new Word("Nephew","भाचा",R.drawable.family_son));
        words.add(new Word("Niece","भाची",R.drawable.family_daughter));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
