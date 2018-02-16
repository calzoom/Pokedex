package com.japjot.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

//        TextView text = (TextView) findViewById(R.id.textView);

        try {

            JSONObject jsonObject = new JSONObject(loadJSONFromAsset());

            Iterator<String> keys = jsonObject.keys();

            while (keys.hasNext()) {
                String name = keys.next();
                JSONObject thispokemon = jsonObject.getJSONObject(name);

                JSONArray types = thispokemon.getJSONArray("Type");
                int len = types.length();


                // There is an error here, feeding in the Types as JSON objects is running into a problem
//                ArrayList<String> typez = new ArrayList<>();
//                for(int j=0; j<len; j++) {
//                    JSONObject json = types.getJSONObject(j);
//                    typez.add(json.getString(name).toString());
//                }

//                String[] type = typez.toArray(new String[typez.size()]);
                String[] temp = new String [2];

                pokes.add(new Pokemon(
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
//                        type (** feeding in the Types as JSON error)
                        temp
                ));

//                Toast.makeText(getApplicationContext(), name,
//                        Toast.LENGTH_LONG).show();

            }
        }
        catch(JSONException e){
            Log.e("json exception", e.getMessage());
        }
    }

}

