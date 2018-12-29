package com.antoinedev;

public class Orc extends Personnage {

    public Orc(String nom) {
        super(nom);
    }

    @Override
    public String animer() {
        return "L’orc de "+nom+" s’anime ";
    }
}
