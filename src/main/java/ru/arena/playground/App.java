package ru.arena.playground;

import ru.arena.heroes.Hero;
import ru.arena.heroes.classes.Archer;
import ru.arena.heroes.classes.Knight;
import ru.arena.heroes.classes.Mage;

public class App {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Knight("Dark", 1, 99), new Mage("SkyWrath", 25, 5), new Archer("Legolas", 15, 78)
        };

        for (Hero hero : heroes) {
            hero.attack();
            hero.printInfo();
        }

        final Knight knight = new Knight("Dragon", 14, 77);

        System.out.println("Рыцарь: " + knight);

        knight.setHealth(75);

        System.out.println("Рыцарь: " + knight);
    }
}
