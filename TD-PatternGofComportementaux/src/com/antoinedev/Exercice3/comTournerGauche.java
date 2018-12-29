package com.antoinedev.Exercice3;

import java.util.*;


public class comTournerGauche implements Commande {

    private Robot robot;

    public comTournerGauche(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void executer() {
        robot.tournerGauche();
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}