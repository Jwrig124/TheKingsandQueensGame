package com.example.thekingsandqueensgame;

import android.content.SharedPreferences;
import android.graphics.Color;
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

import java.util.Calendar;
import java.util.Date;

// THE KINGS AND QUEENS GAME MAIN CONTENT
// Project created by Justin Wright, just a fun little thing to do on the side to learn about mobile development and touch up on java.


public class Game extends AppCompatActivity {
    private Button resume, load;
    private Button c1, c2, c3, c4, c5, c6;
    private int choiceCounter = 0; // Might need this in order to save and load in the future from choice.
    private int Strength = 0;
    private int Intelligence = 0;
    private int Agility = 0;
    private int Charm = 0;
    private int Luck = 0;
    private int Health = 100;
    private int page = 1;
    public static final String SAVE = "SaveGame";
    Date currentTime = Calendar.getInstance().getTime();


// Game over screen = button to bring to main menu.
    // TAKE OUT TOOLBAR OPTIONS ON GAME OVER SCREENS TO AVOID DEAD ENDS.

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
                        page++;
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
                        page++;
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
                        page++;
                        break;
                    case R.id.c5:
                        setContentView(R.layout.page6);
                        Toolbar toolbar5 = findViewById(R.id.toolbar);
                        setSupportActionBar(toolbar5);
                        choiceCounter = 5;
                        page++;
                        break;
                }
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                // stats and health. decided to put condition here rather than on every toolbar since it wont be accessed much
                setContentView(R.layout.activity_stats);
                Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle("Condition: " + Health);
                if (Health >= 100)
                    toolbar.setTitleTextColor(Color.GREEN);
                else if (Health >= 50 && Health <= 75)
                    toolbar.setTitleTextColor(Color.YELLOW);
                else if (Health >= 49 && Health <= 25)
                    toolbar.setTitleTextColor(Color.rgb(255, 165, 0));
                else if (Health < 25)
                    toolbar.setTitleTextColor(Color.RED);
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

                                } else if (choiceCounter == 2) { // On pages with multiple choices (page 3), use same if statement but nested switch for each choice.
                                    setContentView(R.layout.page3);
                                    Toolbar toolbar4 = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar4);
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
                                                case R.id.c5:
                                                    setContentView(R.layout.page6);
                                                    Toolbar toolbar5 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar5);
                                                    choiceCounter = 5;
                                                    break;
                                            }
                                        }
                                    });
                                    c4 = findViewById(R.id.c4);
                                    c4.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View c4) {
                                            switch (c4.getId()) {
                                                case R.id.c4:
                                                    setContentView(R.layout.page5);
                                                    Toolbar toolbar3 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar3);
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
                                                    Toolbar toolbar5 = findViewById(R.id.toolbar);
                                                    setSupportActionBar(toolbar5);
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
                                } else if (choiceCounter == 5) {
                                    setContentView(R.layout.page6);
                                    Toolbar toolbar7 = findViewById(R.id.toolbar);
                                    setSupportActionBar(toolbar7);
                                }
                        }


                    }
                });

                break;
            case R.id.item2:
                // Save
                SharedPreferences saveGame = getSharedPreferences(SAVE, MODE_PRIVATE);
                SharedPreferences.Editor editor = saveGame.edit();
                editor.putInt("savedHealth", Health).putInt("savedStrength", Strength)
                        .putInt("savedIntelligence", Intelligence).putInt("savedAgility", Agility)
                        .putInt("savedCharm", Charm).putInt("savedLuck", Luck).putInt("pageNumber", page);
                editor.apply();
                Toast.makeText(getApplicationContext(), "Game Saved!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                // Load
                SharedPreferences saveGameData = getSharedPreferences(SAVE, MODE_PRIVATE);

                setContentView(R.layout.load_game);
                Toolbar toolbar3 = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar3);
                final TextView pg = findViewById(R.id.savePage1);
                int pageN = saveGameData.getInt("pageNumber",1);
                pg.setText(Integer.toString(pageN));
                final TextView hp = findViewById(R.id.health1);
                int savedhealth = saveGameData.getInt("savedHealth", 100);
                hp.setText(Integer.toString(savedhealth));
                final TextView strength = findViewById(R.id.savestr);
                int savedstrength = saveGameData.getInt("savedStrength", 0);
                strength.setText(Integer.toString(savedstrength));
                final TextView intelligence = findViewById(R.id.saveint);
                int savedint = saveGameData.getInt("savedIntelligence", 0);
                intelligence.setText(Integer.toString(savedint));
                final TextView agility = findViewById(R.id.saveagi);
                int savedagility = saveGameData.getInt("savedAgility", 0);
                agility.setText(Integer.toString(savedagility));
                final TextView charm = findViewById(R.id.savecharm);
                int savedcharm= saveGameData.getInt("savedCharm", 0);
                charm.setText(Integer.toString(savedcharm));
                final TextView luck = findViewById(R.id.saveluck);
                int savedluck = saveGameData.getInt("savedLuck", 0);
                luck.setText(Integer.toString(savedluck));
                load = findViewById(R.id.load);
                load.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View load) {
                                                switch (load.getId()) {
                                                    case R.id.load:
                                                        SharedPreferences loadGame = getSharedPreferences(SAVE,MODE_PRIVATE);
                                                        page = loadGame.getInt("pageNumber",1);
                                                        Health = loadGame.getInt("savedHealth",100);
                                                        Strength = loadGame.getInt("savedStrength",0);
                                                        Intelligence = loadGame.getInt("savedIntelligence",0);
                                                        Agility = loadGame.getInt("savedAgility",0);
                                                        Charm = loadGame.getInt("savedCharm",0);
                                                        Luck = loadGame.getInt("savedLuck",0);
                                                        final TextView health = findViewById(R.id.health1);
                                                        health.setText(String.valueOf(Health));
                                                        final TextView str = findViewById(R.id.strength);
                                                        str.setText(String.valueOf(Strength));
                                                        final TextView intelligence = findViewById(R.id.intelligence);
                                                        intelligence.setText(String.valueOf(Intelligence));
                                                        final TextView agi = findViewById(R.id.agility);
                                                        agi.setText(String.valueOf(Agility));
                                                        final TextView charm = findViewById(R.id.strength);
                                                        charm.setText(String.valueOf(Charm));
                                                        final TextView luck = findViewById(R.id.strength);
                                                        luck.setText(String.valueOf(Luck));

                                                }
                                            }
                                        });


              //  Toast.makeText(this, "Game loaded", Toast.LENGTH_SHORT).show();
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



