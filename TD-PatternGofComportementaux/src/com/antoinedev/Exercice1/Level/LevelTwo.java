package com.antoinedev.Exercice1.Level;

import com.antoinedev.Exercice1.Player;

public class LevelTwo implements LevelPlayer {
    private static int limitLevel = 5000;

    public LevelTwo() {
        System.out.println("Felicitation ! Vous etes passé "+ getClass().getSimpleName());
    }

    @Override
    public int getLimitLevel() {
        return limitLevel;
    }


    @Override
    public void levelUp(Player p) {
        p.setMyLevel(new LevelThree());
    }
}
