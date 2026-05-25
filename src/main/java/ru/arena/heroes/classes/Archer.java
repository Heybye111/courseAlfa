package ru.arena.heroes.classes;

import ru.arena.heroes.Hero;

public class Archer extends Hero {
    private int arrowsCount;

    public Archer(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println("Лучник выпускает стрелу!");
    }

}
