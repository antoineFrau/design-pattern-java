package com.antoinedev.Exercice3;

import java.util.*;

/**
 * 
 */
public class comReculer implements Commande {

    private Robot robot;
    private int distance;

    public comReculer(Robot robot, int distance) {
        this.robot = robot;
        this.distance = distance;
    }

    @Override
    public void executer() {
        robot.reculer(distance);
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

    public int getDistance() {
        return distance;
    }
}