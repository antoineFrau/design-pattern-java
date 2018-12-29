package com.antoinedev.Exercice1.Personnages;

public class TaurenAdapter implements Deplacable {

    private TaurenEtranger tauren;

    public TaurenAdapter(TaurenEtranger tauren) {
        this.tauren = tauren;
    }

    public void marcher() {
        tauren.avancer();
    }

    public void courir() {
        tauren.trotter();
    }

    public void sauter() { }

}
