package ru.arena.heroes;

public class Hero {
    static private int MAX_LEVEL;
    private String name;
    private int level;
    private int health;
    private static int heroesCreated;

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
        if (newLevel >= MAX_LEVEL) {
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


}
