package lection07_OOP.Objects;

public class Mage extends Hero {
    public Mage(String name, int health){
        super(name, health);
    }
    public void attackEnemy(Enemy obj){
        powerKick++;
        if (powerKick ==6) {
            powerKick =0;
            System.out.println("Wow! This is a mega FIREBALL!!!");
            obj.takeDamage(600);
        }
        System.out.println("Mage "+this.getName()+" throws a fireball");
        obj.takeDamage(400);
    }

    public void uniqueAbility(Enemy obj){
        System.out.println("It's a really secret spell");
        obj.takeDamage(800);

    }
}
