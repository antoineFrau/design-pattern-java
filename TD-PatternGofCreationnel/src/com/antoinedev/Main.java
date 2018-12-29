package com.antoinedev;

public class Main {

    public static void main(String[] args) {
        Simulateur s = new Simulateur(new Troll("Diablo"));
        System.out.println(s.simuler());
    }
}
