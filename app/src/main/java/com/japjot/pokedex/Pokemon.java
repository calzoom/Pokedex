package com.japjot.pokedex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by japjot on 2/13/18.
 */

public class Pokemon {

    String pic, name, num, attack, defense, flav, hp, spatk, spdef, species, speed, total;
    ArrayList<String> type;

    public Pokemon(String pic, String name, String num, String attack, String defense, String flav, String hp, String spatk, String spdef, String species, String speed, String total, ArrayList<String> type) {
        this.pic = pic;
        this.name = name;
        this.num = num;
        this.attack = attack;
        this.defense = defense;
        this.flav = flav;
        this.hp = hp;
        this.spatk = spatk;
        this.spdef = spdef;
        this.species = species;
        this.speed = speed;
        this.total = total;
        this.type = type;
    }
}

