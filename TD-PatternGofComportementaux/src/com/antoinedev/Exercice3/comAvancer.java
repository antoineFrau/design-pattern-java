package com.antoinedev.Exercice3;

public class comAvancer implements Commande {

    private Robot robot;
    private int distance;

    public comAvancer(Robot robot, int distance) {
        this.robot = robot;
        this.distance = distance;
    }

    @Override
    public void executer() {
        robot.avancer(distance);
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

    public int getDistance() {
        return distance;
    }
}