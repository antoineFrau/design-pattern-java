package com.antoinedev;

public class Humain extends Personnage {

    public Humain(String nom) {
        super(nom);
    }

    @Override
    public String animer() {
        return "L’humain de "+nom+" s’anime ";
    }
}
