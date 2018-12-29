package com.antoinedev.Exercice1;

import com.antoinedev.Exercice1.Personnages.TaurenAdapter;
import com.antoinedev.Exercice1.Personnages.TaurenEtranger;


public class Main {

    public static void main(String[] args) {
        TaurenEtranger taurenEtranger = new TaurenEtranger();
        TaurenAdapter taurenAdapter = new TaurenAdapter(taurenEtranger);
        taurenAdapter.courir();
        taurenAdapter.marcher();
    }

}
