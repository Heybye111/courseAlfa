package ru.arena.heroes.classes;

import ru.arena.heroes.Hero;

public class Mage extends Hero {
    private int mana;

    public Mage(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println("Маг запускает огненный шар!");
    }
}
