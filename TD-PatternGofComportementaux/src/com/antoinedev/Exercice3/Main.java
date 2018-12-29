package com.antoinedev.Exercice3;

public class Main {

    public static void main(String[] args) {
        Scenario s = new Scenario();
        Robot r = new Robot("Toto");
        s.addCommande(new comAvancer(r,10));
        s.addCommande(new comTournerGauche(r));
        s.addCommande(new comReculer(r,20));
        s.addCommande(new comTournerDroite(r));
        s.addCommande(new comSauter(r,2));
        s.addCommande(new comAvancer(r,3));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Execution du scenario");
        s.executer();
        System.out.println(r.toString());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Annulation du scenario");
        s.annulation();
        System.out.println(r.toString());
    }

}
