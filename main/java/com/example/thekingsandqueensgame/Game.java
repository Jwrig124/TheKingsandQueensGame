package com.example.thekingsandqueensgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

// THE KINGS AND QUEENS GAME MAIN CONTENT
// Project created by Justin Wright, just a fun little thing to do on the side to learn about mobile development and touch up on java.


public class Game extends AppCompatActivity {
    private Button resume;
    private Button c1,c2,c3,c4,c5,c6;
    private int choiceCounter =0; // Might need this in order to save and load in the future from choice.
    private int Strength = 0;
    private int Intelligence = 0;
    private int Agility = 0;
    private int Charm = 0;
    private int Luck = 0;

// Game over screen = button to bring to main menu.

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        c1 = findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c1) {
                switch (c1.getId()) {
                    case R.id.c1:
                        setContentView(R.layout.page2);
                        Toolbar toolbar = findViewById(R.id.toolbar);
                        setSupportActionBar(toolbar);
                        c2 = findViewById(R.id.c2);
                        c2.setOnClickListener(this);
                        choiceCounter = 1;
                        break;
                    case R.id.c2:
                        setContentView(R.layout.page3);
                        Toolbar toolbar2 = findViewById(R.id.toolbar);
                        setSupportActionBar(toolbar2);
                        c3 = findViewById(R.id.c3);
                        c3.setOnClickListener(this);
                        c4 = findViewById(R.id.c4);
                        c4.setOnClickListener(this);
                        choiceCounter = 2;
                        break;
                    case R.id.c3:
                        Charm++;
                        setContentView(R.layout.page4);
                        Toolbar toolbar3 = findViewById(R.id.toolbar);
                        setSupportActionBar(toolbar3);
                        c5 = findViewById(R.id.c5);
                        c5.setOnClickListener(this);
                        choiceCounter = 3;
                        break;
                    case R.id.c4:
                        setContentView(R.layout.page5);
                        Toolbar toolbar4 = findViewById(R.id.toolbar);
                        setSupportActionBar(toolbar4);
                        c5 = findViewById(R.id.c5);
                        c5.setOnClickListener(this);
                        choiceCounter = 4;
                        break;
                    case R.id.c5:
                        setContentView(R.layout.page6);
                        Toolbar toolbar5 = findViewById(R.id.toolbar);
                        setSupportActionBar(toolbar5);
                        choiceCounter = 5;
                        break;
                }
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                // stats
                setContentView(R.layout.activity_stats);
                Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                final TextView str = findViewById(R.id.strength);
                str.setText(Integer.toString(Strength));
                final TextView intel = findViewById(R.id.intelligence);
                intel.setText(Integer.toString(Intelligence));
                final TextView agi = findViewById(R.id.agility);
                agi.setText(Integer.toString(Agility));
                final TextView cha = findViewById(R.id.charm);
                cha.setText(Integer.toString(Charm));
                final TextView luc = findViewById(R.id.luck);
                luc.setText(Integer.toString(Luck));
                resume = findViewById(R.id.resume);
                resume.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View resume) {
                        switch (resume.getId()) {
                            case R.id.resume:
                                Toolbar toolbar = findViewById(R.id.toolbar);
                                setSupportActionBar(toolbar);
                                if (choiceCounter == 0) {
                                    setContentView(R.layout.page1);
                                    Toolbar toolbar2 = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar2);
                                    c1 = findViewById(R.id.c1);
                                    c1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View c1) {
                                            switch (c1.getId()) {
                                                case R.id.c1:
                                                    setContentView(R.layout.page2);
                                                    Toolbar toolbar = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar);
                                                    c2 = findViewById(R.id.c2);
                                                    c2.setOnClickListener(this);
                                                    choiceCounter = 1;
                                                    break;
                                                case R.id.c2:
                                                    setContentView(R.layout.page3);
                                                    Toolbar toolbar2 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar2);
                                                    c3 = findViewById(R.id.c3);
                                                    c3.setOnClickListener(this);
                                                    c4 = findViewById(R.id.c4);
                                                    c4.setOnClickListener(this);
                                                    choiceCounter = 2;
                                                    break;
                                                case R.id.c3:
                                                    Charm++;
                                                    setContentView(R.layout.page4);
                                                    Toolbar toolbar3 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar3);
                                                    c5 = findViewById(R.id.c5);
                                                    c5.setOnClickListener(this);
                                                    choiceCounter = 3;
                                                    break;
                                                case R.id.c4:
                                                    setContentView(R.layout.page5);
                                                    Toolbar toolbar4 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar4);
                                                    c5 = findViewById(R.id.c5);
                                                    c5.setOnClickListener(this);
                                                    choiceCounter = 4;
                                                    break;
                                                case R.id.c5:
                                                    setContentView(R.layout.page6);
                                                    Toolbar toolbar5 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar5);
                                                    choiceCounter = 5;
                                                    break;
                                            }
                                        }
                                    });
                                    break;

                                } else if (choiceCounter == 1) {
                                    setContentView(R.layout.page2);
                                    Toolbar toolbar3 = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar3);
                                    c2 = findViewById(R.id.c2);
                                    c2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View c2) {
                                            switch (c2.getId()) {
                                                case R.id.c2:
                                                    setContentView(R.layout.page3);
                                                    Toolbar toolbar2 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar2);
                                                    c3 = findViewById(R.id.c3);
                                                    c3.setOnClickListener(this);
                                                    c4 = findViewById(R.id.c4);
                                                    c4.setOnClickListener(this);
                                                    choiceCounter = 2;
                                                    break;
                                                case R.id.c3:
                                                    Charm++;
                                                    setContentView(R.layout.page4);
                                                    Toolbar toolbar3 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar3);
                                                    c5 = findViewById(R.id.c5);
                                                    c5.setOnClickListener(this);
                                                    choiceCounter = 3;
                                                    break;
                                                case R.id.c4:
                                                    setContentView(R.layout.page5);
                                                    Toolbar toolbar4 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar4);
                                                    c5 = findViewById(R.id.c5);
                                                    c5.setOnClickListener(this);
                                                    choiceCounter = 4;
                                                    break;
                                                case R.id.c5:
                                                    setContentView(R.layout.page6);
                                                    Toolbar toolbar5 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar5);
                                                    choiceCounter = 5;
                                                    break;
                                            }
                                        }
                                    });
                                    break;

                                } else if (choiceCounter == 2) {
                                    setContentView(R.layout.page3);
                                    Toolbar toolbar4 = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar4);
                                    c4 = findViewById(R.id.c4);
                                    c4.setOnClickListener(this);
                                    c3 = findViewById(R.id.c3);
                                    c3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View c3) {
                                            switch (c3.getId()) {
                                                case R.id.c3:
                                                    Charm++;
                                                    setContentView(R.layout.page4);
                                                    Toolbar toolbar3 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar3);
                                                    c5 = findViewById(R.id.c5);
                                                    c5.setOnClickListener(this);
                                                    choiceCounter = 3;
                                                    break;
                                                case R.id.c4:
                                                    setContentView(R.layout.page5);
                                                    Toolbar toolbar4 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar4);
                                                    c5 = findViewById(R.id.c5);
                                                    c5.setOnClickListener(this);
                                                    choiceCounter = 4;
                                                    break;
                                                case R.id.c5:
                                                    setContentView(R.layout.page6);
                                                    Toolbar toolbar5 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar5);
                                                    choiceCounter = 5;
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                } else if (choiceCounter == 3) {
                                    setContentView(R.layout.page4);
                                    Toolbar toolbar5 = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar5);
                                    c5 = findViewById(R.id.c5);
                                    c5.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View c5) {
                                            switch (c5.getId()) {
                                                case R.id.c5:
                                                    setContentView(R.layout.page6);
                                                    Toolbar toolbar4 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar4);
                                                    choiceCounter = 5;
                                                    break;
                                            }
                                        }
                                    });
                                    break;

                                } else if (choiceCounter == 4) {
                                    setContentView(R.layout.page5);
                                    Toolbar toolbar6 = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar6);
                                    c5 = findViewById(R.id.c5);
                                    c5.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View c5) {
                                            switch (c5.getId()) {
                                                case R.id.c5:
                                                    setContentView(R.layout.page6);
                                                    Toolbar toolbar4 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar4);
                                                    choiceCounter = 5;
                                                    break;
                                            }
                                        }

                                    });
                                    break;
                                }
                        }


                    }
                });


                break;
            case R.id.item2:
                // Save
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                // Load
                Toast.makeText(this, "Item 3 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                // Settings
                Toast.makeText(this, "Item 4 Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }

    }



