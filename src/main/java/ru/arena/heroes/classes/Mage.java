package ru.arena.heroes.classes;

import ru.arena.heroes.Hero;

public class Mage extends Hero {
    private int mana;

    @Override
    public void attack() {
        System.out.println("Маг запускает огненный шар!");
    }
}
