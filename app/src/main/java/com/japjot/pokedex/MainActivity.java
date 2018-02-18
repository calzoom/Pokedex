package com.japjot.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Pokemon> pokes = new ArrayList<>();
    public PokemonAdapter adapter;
    Boolean list = true;

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("pokeData.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            JSONObject jsonObject = new JSONObject(loadJSONFromAsset());

            Iterator<String> keys = jsonObject.keys();

            while (keys.hasNext()) {
                String name = keys.next();
                String nameofpic;
                if (name.matches(".*\\s+.*")) {
                    int space1 = name.indexOf(" ");
                    int space2 = name.indexOf(" ", space1 + 1);
                    int space3 = name.indexOf(" ", space2 + 1);
                    String word1 = name.substring(0, space1);
                    String word2 = name.substring(space2 + 1, space3);
                    nameofpic = word1 + "-" + word2;
                } else {
                    nameofpic = name;
                }
                String pic = "http://img.pokemondb.net/artwork/" + nameofpic.toLowerCase() + ".jpg";
                JSONObject thispokemon = jsonObject.getJSONObject(name);

                JSONArray thesetypes = thispokemon.getJSONArray("Type");
                int len = thesetypes.length();

                ArrayList<String> types = new ArrayList<>();
                for(int j = 0; j < thesetypes.length(); j++) {
                    types.add(thesetypes.get(j).toString());
                }

                pokes.add(new Pokemon(
                        pic,
                        name,
                        thispokemon.getString("#"),
                        thispokemon.getString("Attack"),
                        thispokemon.getString("Defense"),
                        thispokemon.getString("FlavorText"),
                        thispokemon.getString("HP"),
                        thispokemon.getString("Sp. Atk"),
                        thispokemon.getString("Sp. Def"),
                        thispokemon.getString("Species"),
                        thispokemon.getString("Speed"),
                        thispokemon.getString("Total"),
                        types
                ));
            }
        } catch(JSONException e) {
            Log.e("json exception", e.getMessage());
        }

        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new PokemonAdapter(this, pokes);
        recyclerView.setAdapter(adapter);

        Button toggle= findViewById(R.id.toggle);
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (list) {
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 4));
                } else {
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                }
                list = !list;
            }
        });

        Button filter = findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FilterActivity.class);
                startActivity(i);
            }
        });

        Button random = findViewById(R.id.random);
        random.setOnClickListener(new View.OnClickListener() {
            ArrayList<Pokemon> pokes2 = pokes;
            @Override
            public void onClick(View view) {
                Collections.shuffle(pokes2);
                adapter.setpoke(new ArrayList<Pokemon>(pokes2.subList(0, 20)));
                recyclerView.setAdapter(adapter);
            }
        });

        if (getIntent().hasExtra("camefromfilter")) {
            Bundle extras = getIntent().getExtras();
            ArrayList<String> types = (ArrayList<String>) extras.get("types");
            int minimumattack = extras.getInt("minimumattack");
            int minimumdefense = extras.getInt("minimumdefense");
            int minimumhp = extras.getInt("minimumhp");
            ArrayList<Pokemon> pokes2 = new ArrayList<Pokemon>();
            for (Pokemon thispoke : pokes) {
                if (thispoke.type.containsAll(types)
                        && Integer.parseInt(thispoke.attack) >= minimumattack
                        && Integer.parseInt(thispoke.defense) >= minimumdefense
                        && Integer.parseInt(thispoke.hp) >= minimumhp) {
                    pokes2.add(thispoke);
                }
            }
            pokes2 = removeDuplicates(pokes2);
            adapter.setpoke(pokes2);
            recyclerView.setAdapter(adapter);
        }

        SearchView search = findViewById(R.id.search);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                ArrayList<Pokemon> pokes2 = new ArrayList<Pokemon>();
                for (Pokemon thispoke : pokes) {
                    if (thispoke.name.startsWith(s) || thispoke.name.toLowerCase().startsWith(s) || thispoke.num.startsWith(s)) {
                        pokes2.add(thispoke);
                    }
                }
                pokes2 = removeDuplicates(pokes2);
                adapter.setpoke(pokes2);
                recyclerView.setAdapter(adapter);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                ArrayList<Pokemon> pokes2 = new ArrayList<Pokemon>();
                for (Pokemon thispoke : pokes) {
                    if (thispoke.name.startsWith(s) || thispoke.name.toLowerCase().startsWith(s) || thispoke.num.startsWith(s)) {
                        pokes2.add(thispoke);
                    }
                }
                pokes2 = removeDuplicates(pokes2);
                adapter.setpoke(pokes2);
                recyclerView.setAdapter(adapter);
                return false;
            }
        });
    }

    public ArrayList<Pokemon> removeDuplicates(ArrayList<Pokemon> p) {
        LinkedHashMap<String, Pokemon> data = new LinkedHashMap<String, Pokemon>();
        ArrayList<Pokemon> result = new ArrayList<Pokemon>();
        for (Pokemon item: p) {
            String name = item.name;
            if (!data.containsKey(name)) {
                data.put(name, item);
            }
        }
        result.addAll(data.values());
        return result;
    }

}

