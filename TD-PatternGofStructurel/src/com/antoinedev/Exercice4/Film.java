package com.antoinedev.Exercice4;

public class Film implements FicheVehicule {

    private String nomFichier;

    public Film(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public void visualiserFilm() {
        System.out.println("Visualisation réelle du film (fichier: " + nomFichier + ")");
    }
}
