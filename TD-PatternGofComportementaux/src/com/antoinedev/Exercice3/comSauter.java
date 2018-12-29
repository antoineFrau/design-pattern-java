package com.antoinedev.Exercice3;

import java.util.*;

/**
 * 
 */
public class comSauter implements Commande {

    private Robot robot;
    private int hauteur;

    public comSauter(Robot robot, int hauteur) {
        this.robot = robot;
        this.hauteur = hauteur;
    }
    @Override
    public void executer() {
        robot.sauter(hauteur);
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

    public int getHauteur() {
        return hauteur;
    }
}