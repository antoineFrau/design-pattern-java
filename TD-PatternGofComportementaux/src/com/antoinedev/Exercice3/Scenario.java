package com.antoinedev.Exercice3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Scenario {

    private ArrayList<Commande> commandes;

    public Scenario() {
        this.commandes = new ArrayList<>();
    }

    public void addCommande(Commande c){
        this.commandes.add(c);
    }

    public void deleteCommande(Commande c){
        this.commandes.remove(c);
    }

    public void executer(){
        for (int i = 0; i < this.commandes.size(); i++){
            System.out.println("Commande N°"+(i+1));
            this.commandes.get(i).executer();
        }
    }

    public void annulation(){
        for (int i = this.commandes.size()-1; i >= 0; i--){
            Commande c = this.commandes.get(i);
            Robot r = c.getRobot();
            System.out.println("Annulation de la commande N°"+(i+1));
            if (c instanceof comSauter)
                continue;
            if (c instanceof comAvancer)
                c = new comReculer(r, ((comAvancer) c).getDistance());
            else if (c instanceof comReculer)
                c = new comAvancer(r, ((comReculer) c).getDistance());
            else if (c instanceof comTournerDroite)
                c = new comTournerGauche(r);
            else
                c = new comTournerDroite(r);
            c.executer();
        }
    }

}
