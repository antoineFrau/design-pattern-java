package com.antoinedev.Exercice2;

public class Avion implements Defenseur {

    private boolean etat;
    private boolean status;
    private String nom;
    private BaseMilitaire maBase;

    public Avion(BaseMilitaire maBase, String nom) {
        this.etat = false;
        this.status = false;
        this.maBase = maBase;
        this.nom = nom;
        System.out.println("Nouveau "+getClass().getSimpleName()+": "+ this.nom);
    }

    @Override
    public void notification() {
        if(this.maBase.getEtatBase())
            System.out.println(getClass().getSimpleName()+": "+this.maBase.getNom()+" est attaquée");
        else
            System.out.println(getClass().getSimpleName()+": "+this.maBase.getNom()+" le calme est revenu");
        this.etat = this.maBase.getEtatBase();
    }

    public void scratchAvion() {
        this.status = false;
        System.out.println(this.nom+" s'est scratch");
        maBase.deleteDefenseur(this);
    }

}
