package ru.arena.heroes.classes;

import ru.arena.heroes.Hero;

public class Knight extends Hero {
    private int armor;

    @Override
    public void attack() {
        System.out.println("Рыцарь бьет мечом!");
    }
}
