package com.td1.Deplacement;

public class DeplacementHumainSansChaussure implements Deplacement{
    @Override
    public String seDeplace() {
        return "ne se déplacement pas car il n'a pas de chaussures.";
    }
}
