package lection07_OOP.Objects;

public class Warrior extends Hero {
    public Warrior(String name, int health){
        super(name, health);
    }
    public void attackEnemy(Enemy obj){
        powerKick++;
        if (powerKick ==4) {
            powerKick =0;
            System.out.println("Super punch!!!");
            obj.takeDamage(450);
        }
        System.out.println("Warrior "+this.getName()+" hits the sword");
        obj.takeDamage(300);
    }

    public void uniqueAbility(Enemy obj){
        System.out.println("SUPER-PUPER-MEGA PUNCH!!!");
        obj.takeDamage(600);
    }
}
