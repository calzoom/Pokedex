package com.japjot.pokedex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.bumptech.glide.Glide;

/**
 * Created by japjot on 2/10/18.
 */

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.CustomViewHolder>{
    ArrayList<Utils.Pokemon> pokemon;
    Context context;

    public PokemonAdapter(Context context, ArrayList<Utils.Pokemon> pokemon) {
        this.pokemon = pokemon;
        this.context = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.row_view, parent, false);

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

    class CustomViewHolder extends RecyclerView.ViewHolder{

        TextView company, email, name;
        ImageView avatar;

        public CustomViewHolder(View itemView) {
            super(itemView);
            company = itemView.findViewById(R.id.company);
            email = itemView.findViewById(R.id.email);
            name = itemView.findViewById(R.id.name);
            avatar = itemView.findViewById(R.id.pic);
        }

        void bind(Utils.Pokemon pokemon){

            Glide.with(context).load(pokemon.avatar).into(avatar);
        }
    }
}