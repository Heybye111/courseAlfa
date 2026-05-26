package ru.arena.heroes;

import java.util.Objects;

public class Hero {
    static private int MAX_LEVEL;
    private String name;
    private int level;
    private int health;
    private static int heroesCreated;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        MAX_LEVEL = 100;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
    }

    public void takeDamage(int damage, int health) {
        if (damage > health) {
            health = 0;
        } else {
            health = health - damage;
        }
    }

    public void levelUp() {
        int newLevel = level + 1;
        if (newLevel > MAX_LEVEL) {
            newLevel = MAX_LEVEL;
        } else {
            level = newLevel;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }

    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    public void attack(String target, int times) {
        System.out.println("Герой наносит обычный удар. Цель: " + target + times + "раз");
    }

    public static void printHeroesCreated() {
        heroesCreated++;
        System.out.println(heroesCreated);
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы");
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return level == hero.level && health == hero.health && Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, health);
    }
}
