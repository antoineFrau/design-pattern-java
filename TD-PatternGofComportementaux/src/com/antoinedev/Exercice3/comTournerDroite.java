package com.antoinedev.Exercice3;

import java.util.*;

/**
 * 
 */
public class comTournerDroite implements Commande {

    private Robot robot;

    public comTournerDroite(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void executer() {
        robot.tournerDroite();
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

}