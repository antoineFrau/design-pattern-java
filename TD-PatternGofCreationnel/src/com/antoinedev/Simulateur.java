package com.antoinedev;

public class Simulateur {

    protected Personnage monPersonnage;

    public String simuler(){
        return monPersonnage.animer();
    }

    public Simulateur(Personnage monPersonnage) {
        this.monPersonnage = monPersonnage;
    }
}
