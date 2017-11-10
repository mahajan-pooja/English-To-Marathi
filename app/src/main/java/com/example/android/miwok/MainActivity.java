/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find view that shows numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);

        //set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent to open the NumbersActivity
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //start new activity
                startActivity(numberIntent);
            }
        });

        //Find view that shows family category
        TextView family = (TextView)findViewById(R.id.family);


        //set a click listener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent to open the FamilyActivity
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //start new activity
                startActivity(familyIntent);
            }
        });


        //Find view that shows colors category
        TextView color = (TextView)findViewById(R.id.colors);

        //set a click listener on that view
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent to open the ColorsActivity
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //start new activity
                startActivity(colorIntent);
            }
        });


        //Find view that shows phrases category
        TextView phrase = (TextView)findViewById(R.id.phrases);

        //set a click listener on that view
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent to open the PhraseActivity
                Intent phraseIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //start new activity
                startActivity(phraseIntent);
            }
        });




    }


}
