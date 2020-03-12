package com.example.thekingsandqueensgame;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.thekingsandqueensgame.Game.SAVE;

// Date of creation - 11/20/2019
// GAME MAIN MENU

public class MainMenu extends AppCompatActivity {
    private Button newGame, loadGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newGame = findViewById(R.id.new_game);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });

        loadGame = findViewById(R.id.load_game);
        loadGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadGame();
            }
        });
    }
    public void newGame(){
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }

    public void loadGame(){
        SharedPreferences saveGame = getSharedPreferences(SAVE, MODE_PRIVATE);
        final TextView pg = findViewById(R.id.savePage1);
        int pageN = saveGame.getInt("pageNumber", 1);
        pg.setText(Integer.toString(pageN));

        setContentView(R.layout.load_game);

    }
}
