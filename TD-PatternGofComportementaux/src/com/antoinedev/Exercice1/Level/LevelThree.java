package com.antoinedev.Exercice1.Level;

import com.antoinedev.Exercice1.Player;

public class LevelThree implements LevelPlayer {
    private static int limitLevel = 50000;

    public LevelThree() {
        System.out.println("Felicitation ! Vous etes passé "+ getClass().getSimpleName());
    }

    @Override
    public int getLimitLevel() {
        return limitLevel;
    }

    @Override
    public void levelUp(Player p) {
        System.out.println("Felicitation ! Vous avez le niveau maximum");
    }
}
