package lection07_OOP;

import lection07_OOP.Objects.*;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Which hero do you want?");
            System.out.println("1. Warrior");
            System.out.println("2. Archer");
            System.out.println("3. Mage");
            ch = sc.nextInt();
        }while (ch!=1 && ch!=2 && ch!=3);
//making hero
        System.out.println("Input name of hero:");
        String name = sc.next();

        System.out.println("Input health of hero:");
        int health = sc.nextInt();
        Hero hero;
        if(ch==1){
            hero = new Warrior(name,health);
        } else if(ch==2){
            hero = new Archer(name,health);
        } else {
            hero = new Mage(name,health);
        }
//making enemies
        do {
            System.out.println("How many enemies do you want? (1-3):");
            ch = sc.nextInt();
        } while (ch!=1 && ch!=2 && ch!=3);
        Enemy enemy1;
        Enemy enemy2=null;
        Enemy enemy3=null;
        switch (ch){
            case 3:
                System.out.println("Input health of enemy3:");
                health = sc.nextInt();
                enemy3 = new Beast(health);
            case 2:
                System.out.println("Input health of enemy2:");
                health = sc.nextInt();
                enemy2 = new Goblin(health);
            default:
                System.out.println("Input health of enemy1:");
                health = sc.nextInt();
                enemy1 = new Zombie(health);
                break;
        }
// fight
        fight(hero, enemy1);
        if(hero.isAlive() && enemy2!=null) fight(hero,enemy2);
        if(hero.isAlive() && enemy3!=null) fight(hero,enemy3);
    }

    private static void fight(Hero obj1, Enemy obj2){
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int counter = 3;
        while (obj2.isAlive() || obj1.isAlive()) {
            if(counter>0){
                System.out.println("Do you want to use heroe's unique ability? (1-yes,0-no)");
                ch = sc.nextInt();
            }
            if (ch==1 && counter>0){
                obj1.uniqueAbility(obj2);
                counter--;
            }else {
                obj1.attackEnemy(obj2);
            }
            if(!obj2.isAlive()){
                if(obj2.getName().equals("Zombie")){
                    System.out.println("Do you want zombie to bring back to life? (1-yes,0-no)");
                    ch = sc.nextInt();
                    if(ch==1){
                        obj2.uniqueAbility();
                        System.out.println("Zombie never die!!!");
                    } else {
                        System.out.println("Zombie has died");
                        break;
                    }
                }else {
                    System.out.println("Enemy has died");
                    break;
                }
            }
            System.out.println(obj2.getHealth()+" - enemy health");
            obj1.takeDamage(obj2.attackHero());
            if(!obj1.isAlive()){
                System.out.println("Hero has died");
                break;
            }
            System.out.println(obj1.getHealth()+" - hero health");
        }
    }
}
