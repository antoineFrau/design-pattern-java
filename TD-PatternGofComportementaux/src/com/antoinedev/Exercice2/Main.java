package com.antoinedev.Exercice2;

public class Main {

    public static void main(String[] args) {
        BaseMilitaire b = new BaseMilitaire("Solenzara");
        Avion aiglon = new Avion(b,"Aiglon");
        Compagnie intrepide = new Compagnie(b,"Intrepide");
        b.addDefenseur(aiglon);
        b.addDefenseur(intrepide);
        b.setEtatBase(true);
        aiglon.scratchAvion();
        b.setEtatBase(false);
    }
}
