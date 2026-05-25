package ru.arena.heroes.classes;

import ru.arena.heroes.Hero;

public class Knight extends Hero {
    private int armor;

    public Knight(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println("Рыцарь бьет мечом!");
    }
//    @Override
//    public void rest(){
//        System.out.println("Рыцарь отдыхает");
//    }

}
