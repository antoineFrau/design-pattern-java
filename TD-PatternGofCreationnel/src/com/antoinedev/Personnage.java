package com.antoinedev;

public abstract class Personnage {
    public abstract String animer();
    public String nom;

    public Personnage(String nom) {
        this.nom = nom;
    }
}
