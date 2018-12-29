package com.antoinedev.Exercice1.Level;

import com.antoinedev.Exercice1.Player;

public class LevelOne implements LevelPlayer {
    private static int limitLevel = 100;

    public LevelOne() {
    }

    @Override
    public int getLimitLevel() {
        return limitLevel;
    }

    @Override
    public void levelUp(Player p) {
        p.setMyLevel(new LevelTwo());
    }
}
