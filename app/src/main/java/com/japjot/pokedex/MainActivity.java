package com.japjot.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pokemon> pokes = new ArrayList<>();

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
                for(int j=0; j<len; j++) {
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

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new PokemonAdapter(this, pokes));
    }
}

