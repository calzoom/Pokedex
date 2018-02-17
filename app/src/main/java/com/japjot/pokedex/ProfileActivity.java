package com.japjot.pokedex;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import java.net.URLEncoder;

public class ProfileActivity extends AppCompatActivity {

    ImageView pic;
    ImageButton search;
    TextView name, num, species, type, attack, defense, spatk, spdef, hp, speed, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        pic = findViewById(R.id.pic);
        name = findViewById(R.id.name);
        num = findViewById(R.id.num);
        species = findViewById(R.id.species);
        type = findViewById(R.id.type);
        attack = findViewById(R.id.attack);
        defense = findViewById(R.id.defense);
        spatk = findViewById(R.id.spatk);
        spdef = findViewById(R.id.spdef);
        hp = findViewById(R.id.hp);
        speed = findViewById(R.id.speed);
        total = findViewById(R.id.total);

        Bundle extras = getIntent().getExtras();
        String mypic = extras.getString("pic");
        String myname = extras.getString("name");
        String mynum = extras.getString("num");
        String myspecies = extras.getString("species");
        String mytype = extras.getString("type");
        String myattack = extras.getString("attack");
        String mydefense = extras.getString("defense");
        String myspatk = extras.getString("spatk");
        String myspdef = extras.getString("spdef");
        String myhp = extras.getString("hp");
        String myspeed = extras.getString("speed");
        String mytotal = extras.getString("total");

        Glide.with(this).load(mypic).into(pic);
        name.setText(myname);
        num.setText(mynum);
        species.setText(myspecies);
        type.setText(mytype);
        attack.setText(myattack);
        defense.setText(mydefense);
        spatk.setText(myspatk);
        spdef.setText(myspdef);
        hp.setText(myhp);
        speed.setText(myspeed);
        total.setText(mytotal);

        search = findViewById(R.id.search);
        final String thisname = myname;
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, thisname);
                startActivity(intent);
            }
        });
    }
}
