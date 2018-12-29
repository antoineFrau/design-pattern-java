package com.antoinedev.Exercice2;

import com.antoinedev.Exercice2.Personnages.Personnage;
import com.antoinedev.Exercice2.Personnages.Humain;
import com.antoinedev.Exercice2.Personnages.Invisible;
import com.antoinedev.Exercice2.Personnages.Orage;


public class Main {

    public static void main(String[] args) {
        Personnage p1 = new Humain("Titi");
        Personnage p2 = new Invisible("Titi", p1);
        Personnage p3 = new Orage("Titi", p2);
        System.out.println(p3.seDeplacer());
    }
    
}
