package com.japjot.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.util.ArrayList;

public class FilterActivity extends AppCompatActivity {

    CheckBox Normal, Poison, Rock, Grass, Ground, Ice, Fire, Psychic, Dragon, Water, Bug, Dark, Fighting, Ghost, Steel, Flying, Electric, Fairy;
    CheckBox[] typechoices;
    ArrayList<String> selectedtypes;
    EditText minimumattack, minimumdefense, minimumhp;
    int minatk, mindef, minhp;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        Normal = findViewById(R.id.Normal);
        Poison = findViewById(R.id.Poison);
        Rock = findViewById(R.id.Rock);
        Grass = findViewById(R.id.Grass);
        Ground = findViewById(R.id.Ground);
        Ice = findViewById(R.id.Ice);
        Fire = findViewById(R.id.Fire);
        Psychic = findViewById(R.id.Psychic);
        Dragon = findViewById(R.id.Dragon);
        Water = findViewById(R.id.Water);
        Bug = findViewById(R.id.Bug);
        Dark = findViewById(R.id.Dark);
        Fighting = findViewById(R.id.Fighting);
        Ghost = findViewById(R.id.Ghost);
        Steel = findViewById(R.id.Steel);
        Flying = findViewById(R.id.Flying);
        Electric = findViewById(R.id.Electric);
        Fairy = findViewById(R.id.Fairy);

        typechoices = new CheckBox[] {Normal, Poison, Rock, Grass, Ground, Ice, Fire, Psychic, Dragon, Water, Bug, Dark, Fighting, Ghost, Steel, Flying, Electric, Fairy};
        selectedtypes = new ArrayList<String>();
        for (CheckBox thistype : typechoices) {
            final String text = thistype.getText().toString();
            thistype.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        selectedtypes.add(text);
                    } else {
                        selectedtypes.remove(text);
                    }
                }
            });
        }

        minimumattack = findViewById(R.id.minimumattack);
        minimumdefense = findViewById(R.id.minimumdefense);
        minimumhp = findViewById(R.id.minimumhp);

        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minimumattack.getText().toString().matches("")) {
                    minatk = 0;
                } else {
                    minatk = Integer.parseInt(minimumattack.getText().toString());
                }
                if (minimumdefense.getText().toString().matches("")) {
                    mindef = 0;
                } else {
                    mindef = Integer.parseInt(minimumdefense.getText().toString());
                }
                if (minimumhp.getText().toString().matches("")) {
                    minhp = 0;
                } else {
                    minhp = Integer.parseInt(minimumhp.getText().toString());
                }
                Intent i = new Intent(FilterActivity.this, MainActivity.class);
                i.putExtra("camefromfilter", 1);
                i.putExtra("types", selectedtypes);
                i.putExtra("minimumattack", minatk);
                i.putExtra("minimumdefense", mindef);
                i.putExtra("minimumhp", minhp);
                startActivity(i);
            }
        });
    }
}
