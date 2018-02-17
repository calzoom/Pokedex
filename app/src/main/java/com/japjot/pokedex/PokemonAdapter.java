package com.japjot.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import com.bumptech.glide.Glide;

/**
 * Created by japjot on 21018.
 */

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.CustomViewHolder>{
    ArrayList<Pokemon> pokemon;
    Context context;

    public PokemonAdapter(Context context, ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
        this.context = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.bind(pokemon.get(position));
    }

    @Override
    public int getItemCount() {
        return pokemon.size();
    }

    public void setpoke(ArrayList<Pokemon> newpoke) {
        pokemon = newpoke;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView name, num;
        ImageView pic;

        public CustomViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            num = itemView.findViewById(R.id.num);
            pic = itemView.findViewById(R.id.pic);
        }

        void bind(Pokemon pokemon){
            final Pokemon p = pokemon;
            name.setText(pokemon.name);
            num.setText(pokemon.num);
            Glide.with(context).load(pokemon.pic).into(pic);
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, ProfileActivity.class);
                    String nothing = null;
                    i.putExtra("pic", p.pic);
                    i.putExtra("name", p.name);
                    i.putExtra("num", p.num);
                    i.putExtra("attack", p.attack);
                    i.putExtra("defense", p.defense);
                    i.putExtra("flav", p.flav);
                    i.putExtra("hp", p.hp);
                    i.putExtra("spatk", p.spatk);
                    i.putExtra("spdef", p.spdef);
                    i.putExtra("species", p.species);
                    i.putExtra("speed", p.speed);
                    i.putExtra("total", p.total);
                    i.putExtra("type", String.join(", ", p.type));
                    context.startActivity(i);
                }
            });
        }
    }
}