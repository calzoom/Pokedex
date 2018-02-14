package com.japjot.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    ArrayList<Utils.Pokemon> pokes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            JSONObject jsonObject = new JSONObject(Utils.json);
            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String name = keys.next();
                JSONObject thispoke = jsonObject.getJSONObject(name);
                pokes.add(new Utils.Pokemon(
                        name,
                        thispoke.getString("#"),
                        thispoke.getString("Attack"),
                        thispoke.getString("Defense"),
                        thispoke.getString("FlavorText"),
                        thispoke.getString("HP"),
                        thispoke.getString("Sp. Atk"),
                        thispoke.getString("Sp. Def"),
                        thispoke.getString("Speed"),
                        thispoke.getString("Total"),
                        thispoke.getJSONArray("Type")
                ));
            }
        } catch (JSONException e) {
            Log.e("json exception", e.getMessage());
        }
    }
}
