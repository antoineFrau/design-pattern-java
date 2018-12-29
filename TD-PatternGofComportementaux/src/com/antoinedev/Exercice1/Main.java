package com.antoinedev.Exercice1;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("Zenom");
        System.out.println(p1.getName()+", "+p1.getNbPoint()+" points, "+p1.getMyLevel().getClass().getSimpleName());
        p1.winingPoint(100);
        p1.winingPoint(100);
        System.out.println(p1.getName()+", "+p1.getNbPoint()+" points, "+p1.getMyLevel().getClass().getSimpleName());

        /**
         * Question 1.4 :
         * Creer une classe LevelFour
         * Modifier la classe levelThree pour changer ça methode levelUp pour instancier un object LevelFour
         * Ce qui pose probleme au niveau du principe Open/Close (Je n'aime pas ça du tout)
         */

    }
}
