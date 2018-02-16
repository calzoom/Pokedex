package com.japjot.pokedex;

import java.util.List;

/**
 * Created by japjot on 2/13/18.
 */

public class Pokemon {

        String name, number, attack, defense, flavorText, hp, spAtk, spDef, species, speed, total;
        String[] type;

        public Pokemon(String name, String number, String attack, String defense, String flavorText, String hp, String spAtk, String spDef, String species, String speed, String total, String[] type) {
            this.name = name;
            this.number = number;
            this.attack = attack;
            this.defense = defense;
            this.flavorText = flavorText;
            this.hp = hp;
            this.spAtk = spAtk;
            this.spDef = spDef;
            this.species = species;
            this.speed = speed;
            this.total = total;
            this.type = type;
        }
}

