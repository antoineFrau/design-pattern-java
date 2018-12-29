package com.antoinedev.Exercice4;

public class PreviewProxy implements FicheVehicule {

    private String nomFichier;
    private Film leFilm;

    public PreviewProxy(String nomFichier) {
        this.nomFichier = nomFichier;
        System.out.println("Affichage de la photo : " + nomFichier);
    }

    @Override
    public void visualiserFilm() {
        if(leFilm == null){
            String[] s = nomFichier.split("\\.");
            leFilm = new Film(s[0].concat(".mpg"));
        }
        leFilm.visualiserFilm();
    }
}
