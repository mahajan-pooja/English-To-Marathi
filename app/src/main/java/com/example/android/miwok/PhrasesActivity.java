package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?","तू कुठे जात आहेस?"));
        words.add(new Word("What is your name?","तुझे नाव काय आहे?"));
        words.add(new Word("My name is Pooja...","माझे नाव पूजा आहे."));
        words.add(new Word("How are you?","तू कशी/कसा आहेस?"));
        words.add(new Word("What is the time right now?","आता किती वाजलेत?"));
        words.add(new Word("Are you coming?","तू येणार आहेस का?"));
        words.add(new Word("Yes, I’m coming.","हो,मी येणार आहे?"));
        words.add(new Word("You are beautiful.","तू सुंदर आहेस."));
        words.add(new Word("I am working.","मी काम करत आहे."));
        words.add(new Word("I am cooking.","मी स्वयंपाक करत आहे."));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
