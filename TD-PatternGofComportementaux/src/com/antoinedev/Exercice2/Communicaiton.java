package com.antoinedev.Exercice2;

import java.util.ArrayList;

public class Communicaiton {

    private ArrayList<Defenseur> defenseurs;

    public Communicaiton() {
        this.defenseurs = new ArrayList<>();
    }

    public void addDefenseur(Defenseur d){
        this.defenseurs.add(d);
    }

    public void deleteDefenseur(Defenseur d){
        this.defenseurs.remove(d);
    }

    public void notifyDefenseur(){
        for (Defenseur d : this.defenseurs) {
            d.notification();
        }
    }
}
