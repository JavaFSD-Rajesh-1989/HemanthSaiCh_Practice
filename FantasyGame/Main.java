package UpskillingPrep.FantasyGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Character creation
            System.out.println("Choose your character type: 1. Warrior  2. Mage");
            int characterChoice = scanner.nextInt();
            Character player;

            if (characterChoice == 1) {
                System.out.print("Enter Warrior name: ");
                String name = scanner.next();
                player = new Warrior(name, 150, 30, 20);
            } else {
                System.out.print("Enter Mage name: ");
                String name = scanner.next();
                player = new Mage(name, 100, 40, 10);
            }

            System.out.println("Choose an enemy type: 1. Dragon  2. Goblin");
            int enemyChoice = scanner.nextInt();
            Character enemy;

            if (enemyChoice == 1) {
                enemy = new Dragon("Smaug", 200, 50, 40);
            } else {
                enemy = new Goblin("Grub", 80, 20, 5);
            }

            // Equipment system
            Equipment sword = new Sword("Excalibur", 50);
            try {
                sword.equip(player);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Combat logic
            System.out.println("\nCombat begins!");
            while (player.isAlive() && enemy.isAlive()) {
                System.out.println("\nYour move: 1. Attack  2. Use Ability");
                int action = scanner.nextInt();

                if (action == 1) {
                    player.attack(enemy);
                } else if (action == 2) {
                    player.useAbility(enemy);
                } else {
                    System.out.println("Invalid action. Turn skipped.");
                }

                if (enemy.isAlive()) {
                    System.out.println(enemy.getName() + " attacks!");
                    enemy.useAbility(player);
                }

                System.out.println(player.getName() + " has " + player.getHealth() + " HP remaining.");
                System.out.println(enemy.getName() + " has " + enemy.getHealth() + " HP remaining.");
            }

            if (player.isAlive()) {
                System.out.println("\nYou defeated " + enemy.getName() + "!");
            } else {
                System.out.println("\nYou were defeated by " + enemy.getName() + "...");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
