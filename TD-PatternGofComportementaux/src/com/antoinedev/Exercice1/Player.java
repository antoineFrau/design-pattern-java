package com.antoinedev.Exercice1;

import com.antoinedev.Exercice1.Level.LevelOne;
import com.antoinedev.Exercice1.Level.LevelPlayer;

public class Player {

    private String name;
    private int nbPoint;
    private LevelPlayer myLevel;

    public Player(String name) {
        this.name= name;
        this.nbPoint = 0;
        this.myLevel = new LevelOne();
    }

    public int getNbPoint() {
        return nbPoint;
    }

    public void setNbPoint(int nbPoint) {
        this.nbPoint = nbPoint;
    }

    public LevelPlayer getMyLevel() {
        return myLevel;
    }

    public String getName() {
        return name;
    }

    public void setMyLevel(LevelPlayer myLevel) {
        this.myLevel = myLevel;
    }

    public void winingPoint(int n){
        nbPoint += n;
        if (nbPoint >= myLevel.getLimitLevel()){
            myLevel.levelUp(this);
        }
    }
}
