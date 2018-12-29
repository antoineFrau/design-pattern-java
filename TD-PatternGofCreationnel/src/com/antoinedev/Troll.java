package com.antoinedev;

public class Troll extends Personnage {

    public Troll(String nom) {
        super(nom);
    }

    @Override
    public String animer() {
        return "Le Troll de "+nom+" s’anime ";
    }

}
