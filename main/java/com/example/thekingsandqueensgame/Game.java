package com.example.thekingsandqueensgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Game extends AppCompatActivity {
    private Button resume;
    private Button c1;
    private int Strength = 0;
    private int Intelligence = 0;
    private int Agility = 0;
    private int Charm = 0;
    private int Luck = 0;



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
                                ((ViewGroup) resume.getParent()).removeView(resume);
                                Toolbar toolbar = findViewById(R.id.toolbar);
                                setSupportActionBar(toolbar);
                                break;
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



