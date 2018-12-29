package com.td1;

import com.td1.Deplacement.DeplacementHumainSansChaussure;
import com.td1.armes.*;
import com.td1.personnage.*;

public class Main {

    public static void main(String[] args) {
        Personnage p = new Humain("Bidule", new ArmeNull());
        System.out.println(p.toString() + ": " + p.seBattre());
        p.changerArme(new Couteau());
        System.out.println(p.toString() + ": " + p.seBattre());
        System.out.println(p.toString() + ": " + p.seDeplace());
        ((Humain)p).changerDeplacement(new DeplacementHumainSansChaussure());
        System.out.println(p.toString() + ": " + p.seDeplace());

        Personnage p2 = new Tauren("Diablo", new Bouclier());
        System.out.println(p2.toString() + ": " + p2.seBattre());
        p2.changerArme(new Epee());
        System.out.println(p2.toString() + ": " + p2.seBattre());
        System.out.println(p2.toString() + ": " + p2.seDeplace());
    }
}
