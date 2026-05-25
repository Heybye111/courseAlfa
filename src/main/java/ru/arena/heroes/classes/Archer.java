package ru.arena.heroes.classes;

import ru.arena.heroes.Hero;

public class Archer extends Hero {
    private int arrowsCount;

    @Override
    public void attack() {
        System.out.println("Лучник выпускает стрелу!");
    }

}
